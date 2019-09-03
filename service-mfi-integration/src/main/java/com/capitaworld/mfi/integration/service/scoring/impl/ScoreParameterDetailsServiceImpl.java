package com.capitaworld.mfi.integration.service.scoring.impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capitaworld.mfi.integration.api.model.scoring.ScoreParameterDetailsRequest;
import com.capitaworld.mfi.integration.domain.scoring.MFIScoreParameterDetails;
import com.capitaworld.mfi.integration.repository.scoring.MFIScoreParameterDetailsRepository;
import com.capitaworld.mfi.integration.service.scoring.ScoreParameterDetailsService;
import com.capitaworld.mfi.integration.utils.CommonUtils;


@Service
public class ScoreParameterDetailsServiceImpl implements ScoreParameterDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(ScoreParameterDetailsServiceImpl.class.getName());

    @Autowired
    private MFIScoreParameterDetailsRepository scoreParameterDetailsRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String saveScoreParameterDetails(ScoreParameterDetailsRequest scoreParameterDetailsRequest) {
    	
    	Long applicationId = scoreParameterDetailsRequest.getApplicationId();
		
		MFIScoreParameterDetails scoreParameterDetails = scoreParameterDetailsRepository.findByApplicationIdAndIsActiveIsTrue(applicationId);
		scoreParameterDetails = CommonUtils.setAuditDetail(scoreParameterDetailsRequest, scoreParameterDetails, MFIScoreParameterDetails::new);
		scoreParameterDetails.setApplicationId(applicationId);
		scoreParameterDetailsRepository.save(scoreParameterDetails);
		
		logger.info("--------- save savescoreParameterDetails ------------ ");
		logger.info("============== Exit from  savescoreParameterDetails ====================  ");
		return null;
    }
}
