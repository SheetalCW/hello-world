package com.capitaworld.mfi.integration.service.scoring.impl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capitaworld.mfi.integration.api.model.scoring.ScoreParameterMasterRetailRequest;
import com.capitaworld.mfi.integration.api.model.scoring.ScoreParameterRetailRequest;
import com.capitaworld.mfi.integration.domain.scoring.ScoreParameterMaster;
import com.capitaworld.mfi.integration.repository.scoring.ScoreParameterMasterRepository;
import com.capitaworld.mfi.integration.service.scoring.ScoreParameterMasterDetailRetailService;
import com.capitaworld.mfi.integration.service.scoring.ScoreParameterMasterRetailService;
import com.capitaworld.mfi.integration.utils.CommonUtils;

@Service
public class ScoreParameterMasterRetailServiceImpl implements ScoreParameterMasterRetailService  {

	private static final Logger logger = LoggerFactory.getLogger(ScoreParameterMasterRetailServiceImpl.class);
	
	@Autowired
	private ScoreParameterMasterRepository scoreParameterMasterRepository;
	
	@Autowired
	private ScoreParameterMasterDetailRetailService scoreParameterMasterDetailRetailService;
	
	@Override
	@Transactional(noRollbackFor = Exception.class)
	public String saveScoreParameter(ScoreParameterRetailRequest scoreParameterRetailRequest){

		logger.info("================== Enter in saveScoreParameter() ================== applicationId ==> {} " , scoreParameterRetailRequest.getApplicationId());

		if(scoreParameterRetailRequest.getScoreParameterMasterRetailRequestList() != null && ! scoreParameterRetailRequest.getScoreParameterMasterRetailRequestList().isEmpty()) {
			List<ScoreParameterMasterRetailRequest> scoreParameterMasterRetailRequestList = scoreParameterRetailRequest.getScoreParameterMasterRetailRequestList().stream().sorted(Comparator.comparing(ScoreParameterMasterRetailRequest::getIsCoApplicant)).collect(Collectors.toList());
			if(scoreParameterMasterRetailRequestList != null && ! scoreParameterMasterRetailRequestList.isEmpty() ) {	
				
			
				int rowUpdated = scoreParameterMasterRepository.inActive(scoreParameterRetailRequest.getApplicationId(), scoreParameterRetailRequest.getFpProductId(), false);
				logger.info("------------------ delete Old score Parameter Details By applicationId ==> {} fpProductId ==> {} rowUpdated ==> {} ", scoreParameterRetailRequest.getApplicationId(), scoreParameterRetailRequest.getFpProductId() , rowUpdated);
			
				for (ScoreParameterMasterRetailRequest scoreParameterMasterRetailRequest : scoreParameterMasterRetailRequestList) {
					
					//scoreParameterMaster = scoreParameterMasterRepository.findByApplicationIdAndCwCoApplicantIdAndIsActiveIsTrue(scoreParameterMasterRetailRequest.getApplicationId() , scoreParameterMasterRetailRequest.getCwCoApplicantId());
					ScoreParameterMaster scoreParameterMaster  = null ;	
					scoreParameterMaster = CommonUtils.setAuditDetail(scoreParameterMasterRetailRequest, scoreParameterMaster, ScoreParameterMaster::new);
					scoreParameterMaster.setApplicationId(scoreParameterMasterRetailRequest.getApplicationId());
					scoreParameterMaster.setCwCoApplicantId(scoreParameterMasterRetailRequest.getCwCoApplicantId());
					if(scoreParameterMasterRetailRequest.getScoreParameterMasterDetailRetailRequestList() != null && ! scoreParameterMasterRetailRequest.getScoreParameterMasterDetailRetailRequestList().isEmpty()) {
						scoreParameterMasterDetailRetailService.saveScoreParameterMasterDetail(scoreParameterMasterRetailRequest.getScoreParameterMasterDetailRetailRequestList() , scoreParameterMaster);
					}
					scoreParameterMasterRepository.save(scoreParameterMaster);
					
				}
				
				logger.info("================== Exit from saveScoreParameter() ================  ");
				return null;
			}
		}
	
		logger.info("================== Exit from saveScoreParameter() ================  ");
		return null;
	}
	
	/*@Override
	public Boolean saveScoreParameter(ScoreParameterRetailRequest scoreParameterRetailRequest){
		int rowUpdated = inActive(scoreParameterRetailRequest);
		logger.info("------------------ delete Old score Parameter Details By applicationId ==> {} fpProductId ==> {} owUpdated ==> {} ", scoreParameterRetailRequest.getApplicationId(), scoreParameterRetailRequest.getFpProductId() , rowUpdated);
		saveScoreParame( scoreParameterRetailRequest);
		return true;
	}*/
}
