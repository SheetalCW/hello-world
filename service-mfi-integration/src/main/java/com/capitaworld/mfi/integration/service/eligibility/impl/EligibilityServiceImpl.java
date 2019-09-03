package com.capitaworld.mfi.integration.service.eligibility.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.capitaworld.mfi.integration.api.model.oneform.EligibilityDetailsRequest;
import com.capitaworld.mfi.integration.domain.oneform.MFIEligibilityDetails;
import com.capitaworld.mfi.integration.repository.oneform.MFIEligibilityDetailsRepository;
import com.capitaworld.mfi.integration.service.eligibility.EligibilityService;
import com.capitaworld.mfi.integration.utils.CommonUtils;

public class EligibilityServiceImpl implements EligibilityService {
	
	private static final Logger logger = LoggerFactory.getLogger(EligibilityServiceImpl.class); 
	
	@Autowired 
	private MFIEligibilityDetailsRepository mfiEligibilityDetailsRepository;

	@Override
	public String saveEligibilityInfo(EligibilityDetailsRequest eligibilityDetailsRequest) {
		Long applicationId = eligibilityDetailsRequest.getApplicationId();
				
		MFIEligibilityDetails eligibilityDetails = mfiEligibilityDetailsRepository.findByApplicationIdAndIsActiveIsTrue(applicationId);
		eligibilityDetails = CommonUtils.setAuditDetail(eligibilityDetailsRequest, eligibilityDetails, MFIEligibilityDetails::new);
		eligibilityDetails.setApplicationId(applicationId);
		mfiEligibilityDetailsRepository.save(eligibilityDetails);
		
		logger.info("--------- save saveApplicanteligibilityDetails ------------ ");
		logger.info("============== Exit from  saveeligibilityDetails ====================  ");
		return null;
	}
	

}


