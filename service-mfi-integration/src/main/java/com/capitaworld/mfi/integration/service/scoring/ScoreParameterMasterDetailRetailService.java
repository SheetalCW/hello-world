package com.capitaworld.mfi.integration.service.scoring;

import java.util.List;

import com.capitaworld.mfi.integration.api.model.scoring.ScoreParameterMasterDetailRetailRequest;
import com.capitaworld.mfi.integration.domain.scoring.ScoreParameterMaster;

public interface ScoreParameterMasterDetailRetailService {

	public String saveScoreParameterMasterDetail(List<ScoreParameterMasterDetailRetailRequest> scoreParameterDetailRetailRequestList , ScoreParameterMaster scoreParameterMaster ) ;
	
	public String deleteOldScoreParameterDetailListByApplicationIdAndId(Long applicationId , Long scoreParameterId );
}
