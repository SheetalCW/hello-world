package com.capitaworld.mfi.integration.service.scoring;

import com.capitaworld.mfi.integration.api.model.scoring.ScoreParameterDetailsRequest;

public interface ScoreParameterDetailsService {
	
	/**
	 * @param scoreParameterDetailsRequest
	 * @return <code>null</code>=success, or error message
	 */

    public String saveScoreParameterDetails(ScoreParameterDetailsRequest scoreParameterDetailsRequest);
}
