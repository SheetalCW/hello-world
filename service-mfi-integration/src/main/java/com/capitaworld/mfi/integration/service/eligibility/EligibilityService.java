package com.capitaworld.mfi.integration.service.eligibility;

import com.capitaworld.mfi.integration.api.model.oneform.EligibilityDetailsRequest;

public interface EligibilityService {

	/**
	 * @param eligibilityRequest
	 * @return <code>null</code>=success, or error message
	 */
	String saveEligibilityInfo(EligibilityDetailsRequest eligibilityRequest);


}
