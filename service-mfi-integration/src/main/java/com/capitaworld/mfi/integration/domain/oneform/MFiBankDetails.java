package com.capitaworld.mfi.integration.domain.oneform;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "applicant_bank_details")
public class MFiBankDetails extends Auditor {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "applicant_detail_Id")
	private Long applicantDetailId;
	
	@Column(name = "application_Id")
	private Long applicationId;

	@Column(name = "bank_Name")
	private String bankName;

	@Column(name = "branch_name")
	private String branchName;

	@Column(name = "account_no")
	private String accountNo;

	@Column(name = "account_holder_name")
	private String accountHolderName;

	@Column(name = "account_type")
	private String accountType;

	@Column(name = "ifsc_code")
	private String ifscCode;

	/** ref of docDetails.cwDocId */
	@Column(name = "passbook_img_1")
	private Long passbookImg1;
	
	/** ref of docDetails.cwDocId */
	@Column(name = "passbook_img_2")
	private Long passbookImg2;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getApplicantDetailId() {
		return applicantDetailId;
	}

	public void setApplicantDetailId(Long applicantDetailId) {
		this.applicantDetailId = applicantDetailId;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
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

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public Long getPassbookImg1() {
		return passbookImg1;
	}

	public void setPassbookImg1(Long passbookImg1) {
		this.passbookImg1 = passbookImg1;
	}

	public Long getPassbookImg2() {
		return passbookImg2;
	}

	public void setPassbookImg2(Long passbookImg2) {
		this.passbookImg2 = passbookImg2;
	}

}
