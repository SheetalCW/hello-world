package com.capitaworld.mfi.integration.api.model.loan;

import java.io.Serializable;
import java.util.Date;

import com.capitaworld.api.common.lib.model.common.AuditorRequest;
import com.capitaworld.api.common.lib.model.common.AuthRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoanMasterRequest extends AuditorRequest implements Serializable, AuthRequest {
	private static final long serialVersionUID = 1L;

	private Long id;

	private Long applicationId;
	private String userName;
	private String password;
	
	private String fpProductName;

	private Long fpProductId;

	private String bankName;

	private String branchName;

	private String applicationCode;

	private Date applicationDate;

	private String branchCode;

	private Integer newOrRenewalStatus;

	private Integer marketPlaceOrBankSpecific;

	private String currentProposalStatus;

	private Date sendToBank;

	private String rejectionReasonFromCw;

	private String config;

	private Long proposalId;
	

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFpProductName() {
		return fpProductName;
	}

	public void setFpProductName(String fpProductName) {
		this.fpProductName = fpProductName;
	}

	public Long getFpProductId() {
		return fpProductId;
	}

	public void setFpProductId(Long fpProductId) {
		this.fpProductId = fpProductId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getApplicationCode() {
		return applicationCode;
	}

	public void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public Integer getNewOrRenewalStatus() {
		return newOrRenewalStatus;
	}

	public void setNewOrRenewalStatus(Integer newOrRenewalStatus) {
		this.newOrRenewalStatus = newOrRenewalStatus;
	}

	public Integer getMarketPlaceOrBankSpecific() {
		return marketPlaceOrBankSpecific;
	}

	public void setMarketPlaceOrBankSpecific(Integer marketPlaceOrBankSpecific) {
		this.marketPlaceOrBankSpecific = marketPlaceOrBankSpecific;
	}

	public String getCurrentProposalStatus() {
		return currentProposalStatus;
	}

	public void setCurrentProposalStatus(String currentProposalStatus) {
		this.currentProposalStatus = currentProposalStatus;
	}

	public Date getSendToBank() {
		return sendToBank;
	}

	public void setSendToBank(Date sendToBank) {
		this.sendToBank = sendToBank;
	}

	public String getRejectionReasonFromCw() {
		return rejectionReasonFromCw;
	}

	public void setRejectionReasonFromCw(String rejectionReasonFromCw) {
		this.rejectionReasonFromCw = rejectionReasonFromCw;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public Long getProposalId() {
		return proposalId;
	}

	public void setProposalId(Long proposalId) {
		this.proposalId = proposalId;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}


}
