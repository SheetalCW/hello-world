package com.capitaworld.mfi.integration.api.model.oneform;

import java.util.List;

import com.capitaworld.api.common.lib.model.common.AuthRequest;

/**
 * Main request class for one form
 * 
 * @author dharmendra.chudasama
 */
public class OneFormRequest implements AuthRequest {
	private static final long serialVersionUID = -6246774295805361361L;

	private Long applicationId;
	private String userName;
	private String password;

	private ApplicantDetailsRequest applicantDetails;
	private List<ApplicantDetailsRequest> coApplicantDetailsList;

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
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

	public ApplicantDetailsRequest getApplicantDetails() {
		return applicantDetails;
	}

	public void setApplicantDetails(ApplicantDetailsRequest applicantDetails) {
		this.applicantDetails = applicantDetails;
	}

	public List<ApplicantDetailsRequest> getCoApplicantDetailsList() {
		return coApplicantDetailsList;
	}

	public void setCoApplicantDetailsList(List<ApplicantDetailsRequest> coApplicantDetailsList) {
		this.coApplicantDetailsList = coApplicantDetailsList;
	}

}
