package com.capitaworld.mfi.integration.service.eligibility.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capitaworld.mfi.integration.api.model.eligibility.EligibilityDetailRequest;
import com.capitaworld.mfi.integration.domain.eligibility.MFIEligibilityDetails;
import com.capitaworld.mfi.integration.repository.eligibility.MFIEligibilityDetailsRepository;
import com.capitaworld.mfi.integration.service.eligibility.EligibilityService;
import com.capitaworld.mfi.integration.utils.CommonUtils;
@Service
public class EligibilityServiceImpl implements EligibilityService {
	
	private static final Logger logger = LoggerFactory.getLogger(EligibilityServiceImpl.class); 
	
	@Autowired 
	private MFIEligibilityDetailsRepository mfiEligibilityDetailsRepository;

	@Override
	public String saveEligibilityInfo(EligibilityDetailRequest eligibilityDetailsRequest) {
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


