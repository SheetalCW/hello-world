
package com.capitaworld.mfi.integration.domain.loan;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.capitaworld.mfi.integration.domain.oneform.Auditor;

/**
 * The persistent class for the fs_loan_application_master database table.
 * 
 */
@Entity
@Table(name = "loan_master", uniqueConstraints = @UniqueConstraint(columnNames = { "application_id" }))
//@Inheritance(strategy = InheritanceType.JOINED)
public class LoanMaster extends Auditor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "loan_master_seq")
	private Long id;

	@Column(name = "fp_product_name")
	private String fpProductName;

	@Column(name = "fp_product_id")
	private Long fpProductId;

	@Column(name = "bank_name")
	private String bankName;

	@Column(name = "branch_name")
	private String branchName;

	@Column(name = "application_code")
	private String applicationCode;

	@Column(name = "application_id")
	private Long applicationId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "application_date")
	private Date applicationDate;

	@Column(name = "branch_code")
	private String branchCode;

	@Column(name = "new_or_renewal_status")
	private Integer newOrRenewalStatus;

	@Column(name = "market_place_or_bank_spec")
	private Integer marketPlaceOrBankSpecific;

	@Column(name = "current_proposal_status")
	private String currentProposalStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "send_to_bank")
	private Date sendToBank;

	@Column(name = "rejection_reason_from_cw", length = 2000)
	private String rejectionReasonFromCw;

	@Column(name = "config")
	private String config;

	@Column(name = "proposal_id")
	private Long proposalId;

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

}