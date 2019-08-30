package com.capitaworld.mfi.integration.service.oneform.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capitaworld.mfi.integration.api.api_url_and_constants.CommonUtils;
import com.capitaworld.mfi.integration.api.model.oneform.ApplicantDetailsRequest;
import com.capitaworld.mfi.integration.api.model.oneform.BankDetailsRequest;
import com.capitaworld.mfi.integration.api.model.oneform.OneFormRequest;
import com.capitaworld.mfi.integration.domain.oneform.MFiApplicantDetails;
import com.capitaworld.mfi.integration.domain.oneform.MFiBankDetails;
import com.capitaworld.mfi.integration.repository.oneform.MFiApplicantDetailsRepository;
import com.capitaworld.mfi.integration.repository.oneform.MFiAssetsDetailsRepository;
import com.capitaworld.mfi.integration.repository.oneform.MFiBankDetailsRepository;
import com.capitaworld.mfi.integration.repository.oneform.MFiCurrentFinancialArrangementsDetailsRepository;
import com.capitaworld.mfi.integration.repository.oneform.MFiExpenseExpectedIncomeDetailsRepository;
import com.capitaworld.mfi.integration.repository.oneform.MFiIncomeDetailsRepository;
import com.capitaworld.mfi.integration.service.oneform.OneFormService;

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
		saveApplicantDetails(applicantDetailsRequest, applicationId);

		List<ApplicantDetailsRequest> coApplicantDetailsRequestList = oneFormRequest.getCoApplicantDetailsList();
		//saveCoApplicantDetails(coApplicantDetailsRequestList,applicationId);
		
		System.out.println("INSIDE SERVICE OF ONE FORM INFO.......>>>>>>>>>>>>");
		// TODO Auto-generated method stub
		return null;
	}


//SAVING APPLICANT DETAILS
	
	private void saveApplicantDetails(ApplicantDetailsRequest applicantDetailsRequest, Long applicationId) {
		logger.info("============== Enter in saveApplicantDetails ==================== applicationId ==> {} " ,  applicationId);
		
		List<MFiApplicantDetails> applicantDetailList = mfiApplicantDetailsRepository.findByApplicationIdAndIsCoApplicantAndIsActiveIsTrue(applicationId, false);
		MFiApplicantDetails applicantDetails;
		if(applicantDetailList.isEmpty()) {
			applicantDetails=new MFiApplicantDetails();
			CommonUtils.copyProperties(applicantDetailsRequest, applicantDetails);
			applicantDetails.setIsActive(true);
			applicantDetails.setCreatedBy(1l);
			applicantDetails.setCreatedDate(new Date());
			
		}else {
			applicantDetails = applicantDetailList.get(0);
			CommonUtils.copyProperties(applicantDetailsRequest, applicantDetails);
			applicantDetails.setModifiedBy(1l);
			applicantDetails.setModifiedDate(new Date());
		}
		applicantDetails.setApplicationId(applicationId);
		applicantDetails.setIsCoApplicant(false);
		
		//will return generated key for new inserted record
		applicantDetails = mfiApplicantDetailsRepository.save(applicantDetails);
		Long applicantDetailId=applicantDetails.getId();
		
		BankDetailsRequest bankDetailsRequest = applicantDetailsRequest.getBankDetails();
		saveApplicantBankDetails(bankDetailsRequest, applicationId,applicantDetailId);
	
		
		//bankDetails applicationId priApplicantId
		logger.info("--------- save saveApplicantDetails ------------ ");
		logger.info("============== Exit from  saveApplicantDetails ====================  ");	

		
	}

//SAVING BANK DETAILS
private void saveApplicantBankDetails(BankDetailsRequest bankDetailsRequest, Long applicationId, Long applicantDetailId) {
	
	logger.info("============== Enter in saveBankDetails ==================== applicationId ==> {} " ,  applicationId);
	
	List<MFiBankDetails> bankDetailList = mfiBankDetailsRepository.findByApplicantDetailIdAndIsActiveIsTrue(applicantDetailId);
	MFiBankDetails bankDetails;
	if(bankDetailList.isEmpty()) {
		bankDetails=new MFiBankDetails();
		CommonUtils.copyProperties(bankDetailsRequest, bankDetails);
		bankDetails.setIsActive(true);
		bankDetails.setCreatedBy(1l);
		bankDetails.setCreatedDate(new Date());
		
	}else {
		bankDetails = bankDetailList.get(0);
		CommonUtils.copyProperties(bankDetailsRequest, bankDetails);
		bankDetails.setModifiedBy(1l);
		bankDetails.setModifiedDate(new Date());
	}	
	
	mfiBankDetailsRepository.save(bankDetails);
	logger.info("--------- save saveBankDetails ------------ ");
	logger.info("============== Exit from  saveBankDetails ====================  ");	
	
}

	/*
	 * private void saveCoApplicantDetails(List<ApplicantDetailsRequest>
	 * coApplicantDetailsRequestList, Long applicationId) { logger.
	 * info("============== Enter in saveCoApplicantDetails ==================== applicationId ==> {} "
	 * , applicationId); List<MFiApplicantDetails> coApplicantDetailList =
	 * mfiApplicantDetailsRepository.
	 * findByApplicationIdAndIsCoApplicantDetailsAndIsActiveIsTrue(applicationId,
	 * true);
	 * 
	 * for (MFiApplicantDetails mFiApplicantDetails : coApplicantDetailList) {
	 * 
	 * }
	 * 
	 * 
	 * if(coApplicantDetails == null) { coApplicantDetails=new
	 * MFiApplicantDetails();
	 * 
	 * for(ApplicantDetailsRequest coApplicantDetailsRequest :
	 * coApplicantDetailsRequestList) {
	 * 
	 * CommonUtils.copyProperties(coApplicantDetailsRequest, coApplicantDetails);
	 * coApplicantDetails.setIsActive(true); coApplicantDetails.setCreatedBy(1l);
	 * coApplicantDetails.setCreatedDate(new Date());
	 * 
	 * }
	 * 
	 * }else {
	 * 
	 * for(ApplicantDetailsRequest coApplicantDetailsRequest :
	 * coApplicantDetailsRequestList) {
	 * 
	 * CommonUtils.copyProperties(coApplicantDetailsRequest, coApplicantDetails);
	 * coApplicantDetails.setModifiedBy(1l); coApplicantDetails.setModifiedDate(new
	 * Date()); } } coApplicantDetails.setApplicationId(applicationId);
	 * coApplicantDetails.setIsCoApplicant(true);
	 * 
	 * 
	 * // TODO Auto-generated method stub
	 * 
	 * }
	 */
}
