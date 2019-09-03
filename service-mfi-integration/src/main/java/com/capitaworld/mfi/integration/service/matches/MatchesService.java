package com.capitaworld.mfi.integration.service.matches;

import com.capitaworld.mfi.integration.api.model.matches.MatchesParameterRequest;

public interface MatchesService {
	/**
	 * @param matchesParameterRequest
	 * @return <code>null</code>=success, or error message
	 */

	public String saveMatchesParameter(MatchesParameterRequest  matchesParameterRequest)throws Exception; 
}
