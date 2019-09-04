package com.capitaworld.mfi.integration.service.matches.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capitaworld.mfi.integration.api.model.matches.MatchParameterDetailsRetailRequest;
import com.capitaworld.mfi.integration.api.model.matches.MatchParameterRetailRequet;
import com.capitaworld.mfi.integration.domain.matches.MatchParameterDetailsRetail;
import com.capitaworld.mfi.integration.repository.matches.MatchParameterDetailsRetailRepository;
import com.capitaworld.mfi.integration.service.matches.MatchParameterDetailsRetailService;
import com.capitaworld.mfi.integration.utils.CommonUtils;

@Service
public class MatchParameterDetailsRetailServiceImpl implements MatchParameterDetailsRetailService  {

	private static final Logger logger = LoggerFactory.getLogger(MatchParameterDetailsRetailServiceImpl.class);
	
	@Autowired
	private MatchParameterDetailsRetailRepository  matchParameterDetailsRetailRepository;
	
	@Override
	@Transactional(noRollbackFor = Exception.class )
	public String saveMatchesParameter(MatchParameterRetailRequet matchParameterRetailRequet  ) {

		logger.info("================== Enter in saveMatchParameterDetails() ================  ");
		
		//int rowUpdated = matchParameterDetailsRetailRepository.deleteOldMatchParameterDetailsByApplication(matchParameterRetailRequet.getApplicationId() , matchParameterRetailRequet.getFpProductId());
		
		if(matchParameterRetailRequet.getMatchParameterDetailsRetailRequestList() != null && ! matchParameterRetailRequet.getMatchParameterDetailsRetailRequestList().isEmpty()) {
			int rowUpdated = matchParameterDetailsRetailRepository.inActive(matchParameterRetailRequet.getApplicationId() , matchParameterRetailRequet.getFpProductId() , false);
			logger.info("------------------ delete Old Match Parameter Details By applicationid ==> {} fpProductId ==> {}  -------------------  rowUpdated ==> {} ", matchParameterRetailRequet.getApplicationId(), matchParameterRetailRequet.getFpProductId() , rowUpdated);
		
			
			for (MatchParameterDetailsRetailRequest matchParameterDetailsRetailRequest : matchParameterRetailRequet.getMatchParameterDetailsRetailRequestList()) {
				MatchParameterDetailsRetail matchParameterDetailsRetail = null ;
				//matchParameterDetailsRetail = matchParameterDetailsRetailRepository.findByApplicationIdAndParameterNameAndIsActiveIsTrue(matchParameterDetailsRetailRequest.getApplicationId() , matchParameterDetailsRetailRequest.getParameterName());
				matchParameterDetailsRetail = CommonUtils.setAuditDetail(matchParameterDetailsRetailRequest, matchParameterDetailsRetail, MatchParameterDetailsRetail::new);
				matchParameterDetailsRetail.setApplicationId(matchParameterDetailsRetailRequest.getApplicationId());
				matchParameterDetailsRetail.setFpProductId(matchParameterDetailsRetailRequest.getFpProductId());
				matchParameterDetailsRetailRepository.save(matchParameterDetailsRetail);
			}
		}
		logger.info("================== Exit from saveMatchParameterDetails() =====================  ");
		return null;
	}
}
