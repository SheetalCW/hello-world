package com.capitaworld.mfi.integration.api.model.matchparameter;

import java.util.List;

import com.capitaworld.api.common.lib.model.common.AuditorRequest;
import com.capitaworld.api.common.lib.model.common.AuthRequest;

public class MatchParameterRetailRequet extends AuditorRequest implements AuthRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4959198761075202857L;

	private Long id;

	private Long applicationId;

	private Long fpProductId;

	private List<MatchParameterDetailsRetailRequest> matchParameterDetailsRetailRequestList;

	private String userName;

	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public List<MatchParameterDetailsRetailRequest> getMatchParameterDetailsRetailRequestList() {
		return matchParameterDetailsRetailRequestList;
	}

	public void setMatchParameterDetailsRetailRequestList(
			List<MatchParameterDetailsRetailRequest> matchParameterDetailsRetailRequestList) {
		this.matchParameterDetailsRetailRequestList = matchParameterDetailsRetailRequestList;
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

}
