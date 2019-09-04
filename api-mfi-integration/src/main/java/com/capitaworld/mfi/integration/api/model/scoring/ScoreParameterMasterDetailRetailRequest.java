package com.capitaworld.mfi.integration.api.model.scoring;

import java.io.Serializable;

import com.capitaworld.api.common.lib.model.common.AuditorRequest;

public class ScoreParameterMasterDetailRetailRequest extends AuditorRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3400310344696777562L;

	private Long id;

	private Long applicationId;

	private Long cwCoApplicantId;

	private String parameterName;

	private String parameterOption;

	private String answer;

	private Double obtainedScore;

	private Double maxScore;

	private String code;

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

	public Long getCwCoApplicantId() {
		return cwCoApplicantId;
	}

	public void setCwCoApplicantId(Long cwCoApplicantId) {
		this.cwCoApplicantId = cwCoApplicantId;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public String getParameterOption() {
		return parameterOption;
	}

	public void setParameterOption(String parameterOption) {
		this.parameterOption = parameterOption;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Double getObtainedScore() {
		return obtainedScore;
	}

	public void setObtainedScore(Double obtainedScore) {
		this.obtainedScore = obtainedScore;
	}

	public Double getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(Double maxScore) {
		this.maxScore = maxScore;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
