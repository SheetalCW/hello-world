package com.capitaworld.mfi.integration.service.oneform.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capitaworld.mfi.integration.api.model.oneform.ApplicantDetailsRequest;
import com.capitaworld.mfi.integration.api.model.oneform.AssetsDetailsRequest;
import com.capitaworld.mfi.integration.api.model.oneform.BankDetailsRequest;
import com.capitaworld.mfi.integration.api.model.oneform.CurrentFinancialArrangementsDetailsRequest;
import com.capitaworld.mfi.integration.api.model.oneform.ExpenseExpectedIncomeDetailsRequest;
import com.capitaworld.mfi.integration.api.model.oneform.IncomeDetailsRequest;
import com.capitaworld.mfi.integration.api.model.oneform.OneFormRequest;
import com.capitaworld.mfi.integration.domain.oneform.MFiApplicantDetails;
import com.capitaworld.mfi.integration.domain.oneform.MFiAssetsDetails;
import com.capitaworld.mfi.integration.domain.oneform.MFiBankDetails;
import com.capitaworld.mfi.integration.domain.oneform.MFiCurrentFinancialArrangementsDetails;
import com.capitaworld.mfi.integration.domain.oneform.MFiExpenseExpectedIncomeDetails;
import com.capitaworld.mfi.integration.domain.oneform.MFiIncomeDetails;
import com.capitaworld.mfi.integration.repository.oneform.MFiApplicantDetailsRepository;
import com.capitaworld.mfi.integration.repository.oneform.MFiAssetsDetailsRepository;
import com.capitaworld.mfi.integration.repository.oneform.MFiBankDetailsRepository;
import com.capitaworld.mfi.integration.repository.oneform.MFiCurrentFinancialArrangementsDetailsRepository;
import com.capitaworld.mfi.integration.repository.oneform.MFiExpenseExpectedIncomeDetailsRepository;
import com.capitaworld.mfi.integration.repository.oneform.MFiIncomeDetailsRepository;
import com.capitaworld.mfi.integration.service.oneform.OneFormService;
import com.capitaworld.mfi.integration.utils.CommonUtils;

@Service
public class OneFormServiceImpl implements OneFormService {
	
	private static final Logger logger = LoggerFactory.getLogger(OneFormServiceImpl.class); 

	@Autowired 
	private MFiApplicantDetailsRepository mfiApplicantDetailsRepository;
	
	@Autowired 
	private MFiBankDetailsRepository mfiBankDetailsRepository;
	
	@Autowired 
	private MFiAssetsDetailsRepository mfiAssetsDetailsRepository;
	
	@Autowired 
	private MFiCurrentFinancialArrangementsDetailsRepository mfiCurrentFinancialArrangementsDetailsRepository;
	
	@Autowired 
	private MFiExpenseExpectedIncomeDetailsRepository mfiExpenseExpectedIncomeDetailsRepository;
	
	@Autowired 
	private MFiIncomeDetailsRepository mfiIncomeDetailsRepository;

	@Override
	public Boolean saveOneFormInfo(OneFormRequest oneFormRequest) {
		
		Long applicationId=oneFormRequest.getApplicationId();
		ApplicantDetailsRequest applicantDetailsRequest = oneFormRequest.getApplicantDetails();
		List<ApplicantDetailsRequest> coApplicantDetailsRequestList = oneFormRequest.getCoApplicantDetailsList();
		
		saveApplicantDetails(applicantDetailsRequest, applicationId);
		saveCoApplicantDetails(coApplicantDetailsRequestList, applicationId);
		
		// TODO Auto-generated method stub
		return null;
	}


	private void saveApplicantDetails(ApplicantDetailsRequest applicantDetailsRequest, Long applicationId) {
		logger.info("============== Enter in saveApplicantDetails ==================== applicationId ==> {} " ,  applicationId);
		
		if(applicantDetailsRequest == null) {
			logger.debug("applicantDetailsRequest is null for applicationId : {} so ignoring", applicationId);
			return;
		}

		MFiApplicantDetails applicantDetail = mfiApplicantDetailsRepository.findByApplicationIdAndIsCoApplicantIsFalseAndIsActiveIsTrue(applicationId);
		applicantDetail = CommonUtils.setAuditDetail(applicantDetailsRequest, applicantDetail, MFiApplicantDetails::new);
		applicantDetail.setApplicationId(applicationId);
		applicantDetail.setIsCoApplicant(false);
		applicantDetail = mfiApplicantDetailsRepository.save(applicantDetail);
		Long applicantDetailId=applicantDetail.getId();
		logger.info("--------- saved saveApplicantDetails ------------ generated ApplicantDetailId: {}", applicantDetailId);
		
		saveBankDetails(applicantDetailsRequest.getBankDetails(), applicationId, applicantDetailId);
		saveExpenseExpectedDetails(applicantDetailsRequest.getExpenseExpectedIncomeDetails(), applicationId, applicantDetailId);

		saveAssetsDetails(applicantDetailsRequest.getAssetsDetailsList(), applicationId,applicantDetailId);
		saveIncomeDetails(applicantDetailsRequest.getIncomeDetailsList(), applicationId,applicantDetailId);
		saveCurrFinArrDetails(applicantDetailsRequest.getCurrFinArrangementsDetailList(), applicationId,applicantDetailId);
	}

	private void saveCoApplicantDetails(List<ApplicantDetailsRequest> coApplicantDetailsRequestList, Long applicationId) {
		logger.info("============== Enter in saveCoApplicantDetails ==================== applicationId ==> {} " ,  applicationId);
		
		if(coApplicantDetailsRequestList == null) {
			logger.debug("coApplicantDetailsRequestList is null for applicationId : {} so ignoring", applicationId);
			return;
		}
		
		mfiApplicantDetailsRepository.inactiveCoApplicants(applicationId);
		for (ApplicantDetailsRequest coApplicantDetailsRequest : coApplicantDetailsRequestList) {

			MFiApplicantDetails coApplicantDetail = CommonUtils.setAuditDetail(coApplicantDetailsRequest, null, MFiApplicantDetails::new);
			coApplicantDetail.setApplicationId(applicationId);
			coApplicantDetail.setIsCoApplicant(true);
			coApplicantDetail = mfiApplicantDetailsRepository.save(coApplicantDetail);
			Long coApplicantDetailId=coApplicantDetail.getId();
			logger.info("--------- saved saveCoApplicantDetails ------------ generated coApplicantDetailId: {}", coApplicantDetailId);
			
			saveBankDetails(coApplicantDetailsRequest.getBankDetails(), applicationId, coApplicantDetailId);
			saveExpenseExpectedDetails(coApplicantDetailsRequest.getExpenseExpectedIncomeDetails(), applicationId, coApplicantDetailId);

			saveAssetsDetails(coApplicantDetailsRequest.getAssetsDetailsList(), applicationId,coApplicantDetailId);
			saveIncomeDetails(coApplicantDetailsRequest.getIncomeDetailsList(), applicationId,coApplicantDetailId);
			saveCurrFinArrDetails(coApplicantDetailsRequest.getCurrFinArrangementsDetailList(), applicationId,coApplicantDetailId);
		}
	}

	private void saveBankDetails(BankDetailsRequest bankDetailsRequest, Long applicationId, Long applicantDetailId) {
		if(bankDetailsRequest == null) {
			logger.debug("bankDetailsRequest is null for applicationId : {}, applicantDetailId : {} so ignoring", applicationId, applicantDetailId);
			return;
		}
		
		MFiBankDetails bankDetails = mfiBankDetailsRepository.findByApplicantDetailIdAndIsActiveIsTrue(applicantDetailId);
		bankDetails = com.capitaworld.mfi.integration.utils.CommonUtils.setAuditDetail(bankDetailsRequest, bankDetails, MFiBankDetails::new);
		bankDetails.setApplicantDetailId(applicantDetailId);
		bankDetails.setApplicationId(applicationId);
		mfiBankDetailsRepository.save(bankDetails);
		
		logger.info("--------- save saveApplicantbankDetails ------------ ");
		logger.info("============== Exit from  saveApplicantbankDetails ====================  ");	
	}
	
	private void saveExpenseExpectedDetails(ExpenseExpectedIncomeDetailsRequest expenseExpectedDetailsRequest, Long applicationId, Long applicantDetailId) {
		if(expenseExpectedDetailsRequest == null) {
			logger.debug("expenseExpectedDetailsRequest is null for applicationId : {}, applicantDetailId : {} so ignoring", applicationId, applicantDetailId);
			return;
		}

		MFiExpenseExpectedIncomeDetails expenseExpectedDetails = mfiExpenseExpectedIncomeDetailsRepository.findByApplicantDetailIdAndIsActiveIsTrue(applicantDetailId);
		expenseExpectedDetails = CommonUtils.setAuditDetail(expenseExpectedDetailsRequest, expenseExpectedDetails, MFiExpenseExpectedIncomeDetails::new);
		expenseExpectedDetails.setApplicantDetailId(applicantDetailId);
		expenseExpectedDetails.setApplicationId(applicationId);
		mfiExpenseExpectedIncomeDetailsRepository.save(expenseExpectedDetails);
		
		logger.info("--------- save saveApplicantExpenseExpectedDetails ------------ ");
		logger.info("============== Exit from  saveApplicantExpenseExpectedDetails ====================  ");
	}
	
	private void saveAssetsDetails(List<AssetsDetailsRequest> assetsDetailsRequestList, Long applicationId, Long applicantDetailId) {
		if(assetsDetailsRequestList == null) {
			logger.debug("assetsDetailsRequestList is null for applicationId : {}, applicantDetailId : {} so ignoring", applicationId, applicantDetailId);
			return;
		}

		mfiAssetsDetailsRepository.inactive(applicantDetailId);
		for (AssetsDetailsRequest assetsDetailsRequest : assetsDetailsRequestList) {
			MFiAssetsDetails assetsDetails = CommonUtils.setAuditDetail(assetsDetailsRequest, null, MFiAssetsDetails::new);
			assetsDetails.setApplicantDetailId(applicantDetailId);
			assetsDetails.setApplicationId(applicationId);
			mfiAssetsDetailsRepository.save(assetsDetails);
		}
		
		logger.info("--------- save saveApplicantAssetsDetails ------------ ");
		logger.info("============== Exit from  saveApplicantAssetsDetails ====================  ");
		
	}
		
	private void saveIncomeDetails(List<IncomeDetailsRequest> incomeDetailsRequestList, Long applicationId, Long applicantDetailId) {
		if(incomeDetailsRequestList == null) {
			logger.debug("incomeDetailsRequestList is null for applicationId : {}, applicantDetailId : {} so ignoring", applicationId, applicantDetailId);
			return;
		}

		mfiIncomeDetailsRepository.inactive(applicantDetailId);
		for (IncomeDetailsRequest incomeDetailsRequest : incomeDetailsRequestList) {
			MFiIncomeDetails incomeDetails = CommonUtils.setAuditDetail(incomeDetailsRequest, null, MFiIncomeDetails::new);
			incomeDetails.setApplicantDetailId(applicantDetailId);
			incomeDetails.setApplicationId(applicationId);
			mfiIncomeDetailsRepository.save(incomeDetails);
		}
		
		logger.info("--------- save saveApplicantIncomeDetails ------------ ");
		logger.info("============== Exit from  saveApplicantIncomeDetails ====================  ");
		
	}
	
	private void saveCurrFinArrDetails(List<CurrentFinancialArrangementsDetailsRequest> currFinArrDetailsRequestList, Long applicationId, Long applicantDetailId) {
		if(currFinArrDetailsRequestList == null) {
			logger.debug("currFinArrDetailsRequestList is null for applicationId : {}, applicantDetailId : {} so ignoring", applicationId, applicantDetailId);
			return;
		}

		mfiCurrentFinancialArrangementsDetailsRepository.inactive(applicantDetailId);
		for (CurrentFinancialArrangementsDetailsRequest currFinArrDetailsRequest : currFinArrDetailsRequestList) {
			MFiCurrentFinancialArrangementsDetails currFinArrDetails = CommonUtils.setAuditDetail(currFinArrDetailsRequest, null, MFiCurrentFinancialArrangementsDetails::new);
			currFinArrDetails.setApplicantDetailId(applicantDetailId);
			currFinArrDetails.setApplicationId(applicationId);
			mfiCurrentFinancialArrangementsDetailsRepository.save(currFinArrDetails);
		}
		
		logger.info("--------- save saveApplicantCurrentFinancialArrangementsDetails ------------ ");
		logger.info("============== Exit from  saveApplicantCurrentFinancialArrangementsDetails ====================  ");
	}
	
}
