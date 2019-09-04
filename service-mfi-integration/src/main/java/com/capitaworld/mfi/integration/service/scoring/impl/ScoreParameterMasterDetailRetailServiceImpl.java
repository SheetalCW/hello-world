package com.capitaworld.mfi.integration.service.scoring.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capitaworld.mfi.integration.api.model.scoring.ScoreParameterMasterDetailRetailRequest;
import com.capitaworld.mfi.integration.domain.scoring.ScoreParameterMaster;
import com.capitaworld.mfi.integration.domain.scoring.ScoreParameterMasterDetail;
import com.capitaworld.mfi.integration.repository.scoring.ScoreParameterMasterDetailRepository;
import com.capitaworld.mfi.integration.service.scoring.ScoreParameterMasterDetailRetailService;
import com.capitaworld.mfi.integration.utils.CommonUtils;

@Service
public class ScoreParameterMasterDetailRetailServiceImpl implements ScoreParameterMasterDetailRetailService{

	private static final Logger logger = LoggerFactory.getLogger(ScoreParameterMasterDetailRetailServiceImpl.class);
	
	@Autowired
	private ScoreParameterMasterDetailRepository scoreParameterMasterDetailRepository;
	
	@Override
	public String saveScoreParameterMasterDetail(List<ScoreParameterMasterDetailRetailRequest> scoreParameterDetailRetailRequestList , ScoreParameterMaster scoreParameterMaster ) {

		logger.info("================== Enter in saveScoreParamenterDetail() ================  applicationId ==> {} " , scoreParameterMaster.getApplicationId());
	
		scoreParameterMaster.setScoreParameterMasterDetailList(new ArrayList<>());
		
		if(scoreParameterDetailRetailRequestList != null && ! scoreParameterDetailRetailRequestList.isEmpty()) {
			
			for (ScoreParameterMasterDetailRetailRequest scoreParameterMasterDetailRetailRequest : scoreParameterDetailRetailRequestList) {
				
				//scoreParameterMasterDetail = scoreParameterMasterDetailRepository.findByApplicationIdAndCwCoApplicantIdAndParameterNameAndIsActiveIsTrue(scoreParameterMasterDetailRetailRequest.getApplicationId(), scoreParameterMasterDetailRetailRequest.getCwCoApplicantId() ,  scoreParameterMasterDetailRetailRequest.getParameterName());
				
				ScoreParameterMasterDetail scoreParameterMasterDetail = null;
				scoreParameterMasterDetail = CommonUtils.setAuditDetail(scoreParameterMasterDetailRetailRequest, scoreParameterMasterDetail, ScoreParameterMasterDetail::new);
				scoreParameterMasterDetail.setApplicationId(scoreParameterMasterDetailRetailRequest.getApplicationId());
				scoreParameterMasterDetail.setScoreParameterMasterId(scoreParameterMaster);
				scoreParameterMaster.getScoreParameterMasterDetailList().add(scoreParameterMasterDetail);
			}
		}	
		
		logger.info("================== Exit from saveScoreParamenterDetail() ================  ");
		
		return null;
	}
	
	@Override
	@Transactional(noRollbackFor = Exception.class)
	public String deleteOldScoreParameterDetailListByApplicationIdAndId(Long applicationId , Long scoreParameterId ) {
		logger.info("================== Enter in deleteOldListByApplicatinoIdAndId() ================  applicationId ==> {} scoreParameterId ==> {} " , applicationId , scoreParameterId);
		Integer rowUpdated = scoreParameterMasterDetailRepository.deleteOldScoreParameterDetailByApplicationIdAndScoreParameterId(applicationId , scoreParameterId);
		logger.info("---------------------- delete old score parameter detail -------------- rowUpdated ==> {} " , rowUpdated);
		logger.info("================== Exit from deleteOldListByApplicatinoIdAndId() ================  ");
		
		return null;
		
	}
	
}
