package com.capitaworld.mfi.integration.api.model.scoring;

import java.util.List;

import com.capitaworld.api.common.lib.model.common.AuditorRequest;
import com.capitaworld.api.common.lib.model.common.AuthRequest;

public class ScoreParameterRetailRequest extends AuditorRequest implements AuthRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8512833553162591032L;

	private Long applicationId;

	private Long fpProductId;

	private String userName;

	private String password;

	private List<ScoreParameterMasterRetailRequest> scoreParameterMasterRetailRequestList;

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getFpProductId() {
		return fpProductId;
	}

	public void setFpProductId(Long fpProductId) {
		this.fpProductId = fpProductId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<ScoreParameterMasterRetailRequest> getScoreParameterMasterRetailRequestList() {
		return scoreParameterMasterRetailRequestList;
	}

	public void setScoreParameterMasterRetailRequestList(
			List<ScoreParameterMasterRetailRequest> scoreParameterMasterRetailRequestList) {
		this.scoreParameterMasterRetailRequestList = scoreParameterMasterRetailRequestList;
	}

}
