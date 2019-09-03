package com.capitaworld.mfi.integration.api.model.oneform;

import com.capitaworld.api.common.lib.model.common.AuthRequest;

public class EligibilityDetailsRequest implements AuthRequest {
	
	
private static final long serialVersionUID = 1L;
	
	
	private Long applicationId;
	private String userName;
	private String password;

	private Double incomeFromOccupation;
	private Double existingBussnessAndFamilyExpenses;
	private Double netSavings;
	private Double expectedIncreaseInIncomeOutOfLoan;
	private Double totalCashFlow;
	private Double margin;
	private Double installmentCapacity;
	private Double rateOfInterest;
	private Integer tenure;
	private Double perLakhEmi;
	private Double loanAmountBasedOnIncome;
	private Double recomendedloanAmount;
	private Double finalLoanAmount;
	private String instalmentOnFinalLoanAmount;
	
	
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
	public Long getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	
	public Double getIncomeFromOccupation() {
		return incomeFromOccupation;
	}
	public void setIncomeFromOccupation(Double incomeFromOccupation) {
		this.incomeFromOccupation = incomeFromOccupation;
	}
	public Double getExistingBussnessAndFamilyExpenses() {
		return existingBussnessAndFamilyExpenses;
	}
	public void setExistingBussnessAndFamilyExpenses(Double existingBussnessAndFamilyExpenses) {
		this.existingBussnessAndFamilyExpenses = existingBussnessAndFamilyExpenses;
	}
	public Double getNetSavings() {
		return netSavings;
	}
	public void setNetSavings(Double netSavings) {
		this.netSavings = netSavings;
	}
	public Double getExpectedIncreaseInIncomeOutOfLoan() {
		return expectedIncreaseInIncomeOutOfLoan;
	}
	public void setExpectedIncreaseInIncomeOutOfLoan(Double expectedIncreaseInIncomeOutOfLoan) {
		this.expectedIncreaseInIncomeOutOfLoan = expectedIncreaseInIncomeOutOfLoan;
	}
	public Double getTotalCashFlow() {
		return totalCashFlow;
	}
	public void setTotalCashFlow(Double totalCashFlow) {
		this.totalCashFlow = totalCashFlow;
	}
	public Double getMargin() {
		return margin;
	}
	public void setMargin(Double margin) {
		this.margin = margin;
	}
	public Double getInstallmentCapacity() {
		return installmentCapacity;
	}
	public void setInstallmentCapacity(Double installmentCapacity) {
		this.installmentCapacity = installmentCapacity;
	}
	public Double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(Double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	public Double getPerLakhEmi() {
		return perLakhEmi;
	}
	public void setPerLakhEmi(Double perLakhEmi) {
		this.perLakhEmi = perLakhEmi;
	}
	public Double getLoanAmountBasedOnIncome() {
		return loanAmountBasedOnIncome;
	}
	public void setLoanAmountBasedOnIncome(Double loanAmountBasedOnIncome) {
		this.loanAmountBasedOnIncome = loanAmountBasedOnIncome;
	}
	public Double getRecomendedloanAmount() {
		return recomendedloanAmount;
	}
	public void setRecomendedloanAmount(Double recomendedloanAmount) {
		this.recomendedloanAmount = recomendedloanAmount;
	}
	public Double getFinalLoanAmount() {
		return finalLoanAmount;
	}
	public void setFinalLoanAmount(Double finalLoanAmount) {
		this.finalLoanAmount = finalLoanAmount;
	}
	public String getInstalmentOnFinalLoanAmount() {
		return instalmentOnFinalLoanAmount;
	}
	public void setInstalmentOnFinalLoanAmount(String instalmentOnFinalLoanAmount) {
		this.instalmentOnFinalLoanAmount = instalmentOnFinalLoanAmount;
	}
	
	

	
}
