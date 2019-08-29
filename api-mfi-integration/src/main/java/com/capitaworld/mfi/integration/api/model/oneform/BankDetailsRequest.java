package com.capitaworld.mfi.integration.api.model.oneform;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BankDetailsRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private String bankName;
	private String branchName;
	private String accountNo;
	private String accountHolderName;
	private String accountType;
	private String ifscCode;
	private String passbookImg;

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

	public void setAccountType(String accountTypeStr) {
		this.accountType = accountTypeStr;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getPassbookImg() {
		return passbookImg;
	}

	public void setPassbookImg(String passbookImg) {
		this.passbookImg = passbookImg;
	}

}
