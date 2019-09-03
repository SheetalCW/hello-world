package com.capitaworld.mfi.integration.service.oneform.impl;

import java.util.List;
import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capitaworld.mfi.integration.api.model.oneform.ApplicantDetailsRequest;
import com.capitaworld.mfi.integration.api.model.oneform.AssetsDetailsRequest;
import com.capitaworld.mfi.integration.api.model.oneform.BankDetailsRequest;
import com.capitaworld.mfi.integration.api.model.oneform.CurrentFinancialArrangementsDetailsRequest;
import com.capitaworld.mfi.integration.api.model.oneform.DocumentDetailRequest;
import com.capitaworld.mfi.integration.api.model.oneform.IncomeDetailsRequest;
import com.capitaworld.mfi.integration.api.model.oneform.OneFormRequest;
import com.capitaworld.mfi.integration.domain.oneform.MFIDocumentDetail;
import com.capitaworld.mfi.integration.domain.oneform.MFiApplicantDetails;
import com.capitaworld.mfi.integration.domain.oneform.MFiAssetsDetails;
import com.capitaworld.mfi.integration.domain.oneform.MFiBankDetails;
import com.capitaworld.mfi.integration.domain.oneform.MFiCurrentFinancialArrangementsDetails;
import com.capitaworld.mfi.integration.domain.oneform.MFiIncomeDetails;
import com.capitaworld.mfi.integration.repository.oneform.MFIDocumentDetailRepository;
import com.capitaworld.mfi.integration.repository.oneform.MFiApplicantDetailsRepository;
import com.capitaworld.mfi.integration.repository.oneform.MFiAssetsDetailsRepository;
import com.capitaworld.mfi.integration.repository.oneform.MFiBankDetailsRepository;
import com.capitaworld.mfi.integration.repository.oneform.MFiCurrentFinancialArrangementsDetailsRepository;
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
	private MFIDocumentDetailRepository documentDetailRepository;
	
	@Autowired 
	private MFiAssetsDetailsRepository mfiAssetsDetailsRepository;
	
	@Autowired 
	private MFiCurrentFinancialArrangementsDetailsRepository mfiCurrentFinancialArrangementsDetailsRepository;
	
	
	
	@Autowired 
	private MFiIncomeDetailsRepository mfiIncomeDetailsRepository;

	@Override
	public String saveOneFormInfo(OneFormRequest oneFormRequest) {
		
		Long applicationId=oneFormRequest.getApplicationId();
		ApplicantDetailsRequest applicantDetailsRequest = oneFormRequest.getApplicantDetails();
		List<ApplicantDetailsRequest> coApplicantDetailsRequestList = oneFormRequest.getCoApplicantDetailsList();
		
		saveApplicantDetails(applicantDetailsRequest, applicationId);
		saveCoApplicantDetails(coApplicantDetailsRequestList, applicationId);
		
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

		saveDocumentDetails(applicantDetailsRequest.getProfileImg(), applicationId, null, applicantDetail::setProfileImg);
		saveDocumentDetails(applicantDetailsRequest.getAddressProofImg1(), applicationId, null, applicantDetail::setAddressProofImg1);
		saveDocumentDetails(applicantDetailsRequest.getAddressProofImg2(), applicationId, null, applicantDetail::setAddressProofImg2);
		saveDocumentDetails(applicantDetailsRequest.getConsentFormImg1(), applicationId, null, applicantDetail::setConsentFormImg1);
		saveDocumentDetails(applicantDetailsRequest.getConsentFormImg2(), applicationId, null, applicantDetail::setConsentFormImg2);
		applicantDetail = mfiApplicantDetailsRepository.save(applicantDetail);

		Long applicantDetailId=applicantDetail.getId();
		logger.info("--------- saved saveApplicantDetails ------------ generated ApplicantDetailId: {}", applicantDetailId);
		
		saveBankDetails(applicantDetailsRequest.getBankDetails(), applicationId, applicantDetailId);

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

			saveDocumentDetails(coApplicantDetailsRequest.getProfileImg(), applicationId, null, coApplicantDetail::setProfileImg);
			saveDocumentDetails(coApplicantDetailsRequest.getAddressProofImg1(), applicationId, null, coApplicantDetail::setAddressProofImg1);
			saveDocumentDetails(coApplicantDetailsRequest.getAddressProofImg2(), applicationId, null, coApplicantDetail::setAddressProofImg2);
			coApplicantDetail = mfiApplicantDetailsRepository.save(coApplicantDetail);
			Long coApplicantDetailId=coApplicantDetail.getId();
			logger.info("--------- saved saveCoApplicantDetails ------------ generated coApplicantDetailId: {}", coApplicantDetailId);
			
			saveBankDetails(coApplicantDetailsRequest.getBankDetails(), applicationId, coApplicantDetailId);

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
		bankDetails = CommonUtils.setAuditDetail(bankDetailsRequest, bankDetails, MFiBankDetails::new);
		bankDetails.setApplicantDetailId(applicantDetailId);
		bankDetails.setApplicationId(applicationId);
		
		saveDocumentDetails(bankDetailsRequest.getPassbookImg1(), applicationId, applicantDetailId, bankDetails::setPassbookImg1);
		saveDocumentDetails(bankDetailsRequest.getPassbookImg2(), applicationId, applicantDetailId, bankDetails::setPassbookImg2);
		mfiBankDetailsRepository.save(bankDetails);
		
		logger.info("--------- save saveApplicantbankDetails ------------ ");
		logger.info("============== Exit from  saveApplicantbankDetails ====================  ");	
	}
	
	/**
	 * @param documentDetailRequest
	 * @param applicationId
	 * @param applicantDetailId
	 * @param cwDocIdConsumer (Optional) setter called iff document found and cwDocIdSetter.apply(CwDocId)
	 */
	private void saveDocumentDetails(DocumentDetailRequest documentDetailRequest, Long applicationId, Long applicantDetailId, Consumer<Long> cwDocIdConsumer) {
		if(documentDetailRequest == null) {
			logger.debug("documentDetailRequest is null for applicationId : {}, applicantDetailId : {} so ignoring", applicationId, applicantDetailId);
			return;
		}
		if(documentDetailRequest.getCwDocId() == null) {
			logger.debug("documentDetailRequest.getCwDocId() is null for applicationId : {}, applicantDetailId : {} so ignoring", applicationId, applicantDetailId);
			return;
		}
		
		MFIDocumentDetail documentDetail = documentDetailRepository.findByCwDocIdAndIsActiveIsTrue(documentDetailRequest.getCwDocId());
		documentDetail = CommonUtils.setAuditDetail(documentDetailRequest, documentDetail, MFIDocumentDetail::new);
//			documentDetail.setDocumentType(DocumentDetail.DocType.PASSBOOK_IMG_1);
		documentDetail.setApplicationId(applicationId);
		documentDetail.setCwDocId(documentDetailRequest.getCwDocId());
		documentDetail.setDocumentData(documentDetailRequest.getDocumentData());
		documentDetailRepository.save(documentDetail);
		
		if(cwDocIdConsumer != null)
			cwDocIdConsumer.accept(documentDetailRequest.getCwDocId());

		logger.info("--------- saved documentDetail ------------ ");
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
