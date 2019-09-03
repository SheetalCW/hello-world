package com.capitaworld.mfi.integration.service.oneform;

import com.capitaworld.mfi.integration.api.model.oneform.OneFormRequest;

public interface OneFormService {

	/**
	 * @param oneFormRequest
	 * @return <code>null</code>=success, or error message
	 */
	String saveOneFormInfo(OneFormRequest oneFormRequest);

}
