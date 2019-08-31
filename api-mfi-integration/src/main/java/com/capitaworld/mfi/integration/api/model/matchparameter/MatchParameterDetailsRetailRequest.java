package com.capitaworld.mfi.integration.api.model.matchparameter;

import java.io.Serializable;

import com.capitaworld.api.common.lib.model.common.AuditorRequest;

/**
 * @author ankit.gupta
 *
 */

public class MatchParameterDetailsRetailRequest extends AuditorRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1870494426184005798L;

	private Long id;

	private Long applicationId;

	private Long fpProductId;

	private String parameterName;

	private String fpValue;

	private String fsValue;

	private Boolean isDisplay;

	private Boolean isMandatory;

	private Boolean isMatched;

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

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public String getFpValue() {
		return fpValue;
	}

	public void setFpValue(String fpValue) {
		this.fpValue = fpValue;
	}

	public String getFsValue() {
		return fsValue;
	}

	public void setFsValue(String fsValue) {
		this.fsValue = fsValue;
	}

	public Boolean getIsDisplay() {
		return isDisplay;
	}

	public void setIsDisplay(Boolean isDisplay) {
		this.isDisplay = isDisplay;
	}

	public Boolean getIsMandatory() {
		return isMandatory;
	}

	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public Boolean getIsMatched() {
		return isMatched;
	}

	public void setIsMatched(Boolean isMatched) {
		this.isMatched = isMatched;
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
