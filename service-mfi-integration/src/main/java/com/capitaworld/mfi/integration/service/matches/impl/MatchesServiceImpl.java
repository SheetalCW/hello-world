package com.capitaworld.mfi.integration.service.matches.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capitaworld.mfi.integration.api.model.matches.MatchesParameterRequest;
import com.capitaworld.mfi.integration.domain.matches.MFIMatchesParameterDetail;
import com.capitaworld.mfi.integration.repository.matches.MFIMatchesRepository;
import com.capitaworld.mfi.integration.service.matches.MatchesService;
import com.capitaworld.mfi.integration.utils.CommonUtils;


@Service
public class MatchesServiceImpl implements MatchesService {
	
	private static final Logger logger = LoggerFactory.getLogger(MatchesServiceImpl.class); 


	@Autowired
	private MFIMatchesRepository matchesRepository;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public String saveMatchesParameter(MatchesParameterRequest matchesParameterRequest) throws Exception {
		
		Long applicationId = matchesParameterRequest.getApplicationId();
		
		MFIMatchesParameterDetail matchparameterDetails = matchesRepository.findByApplicationIdAndIsActiveIsTrue(applicationId);
		matchparameterDetails = CommonUtils.setAuditDetail(matchesParameterRequest, matchparameterDetails, MFIMatchesParameterDetail::new);
		matchparameterDetails.setApplicationId(applicationId);
		matchesRepository.save(matchparameterDetails);
		
		logger.info("--------- save saveMatchesParameterDetails ------------ ");
		logger.info("============== Exit from  saveMatchesParameterDetails ====================  ");
		return null;
		
		}

}