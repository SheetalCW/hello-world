package com.capitaworld.mfi.integration.domain.eligibility;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.capitaworld.mfi.integration.domain.common.Auditor;
@Entity
@Table(name = "applicant_eligibility_details")
public class MFIEligibilityDetails extends Auditor {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "application_Id")
	private Long applicationId;
	
	@Column(name = "fp_product_id")
	private Long fpProductId;
	
	@Column(name = "income _From_Occupation")
	private Double incomeFromOccupation;
	
	@Column(name = "existing_Bussness_And_Family_Expenses")
	private Double existingBussnessAndFamilyExpenses;
	
	@Column(name = "net_Savings")
	private Double netSavings;
	
	@Column(name = "expected_Increase_In_Income_OutOfLoan")
	private Double expectedIncreaseInIncomeOutOfLoan;
	
	@Column(name = "total_Cash_Flow")
	private Double totalCashFlow;
	
	@Column(name = "margin")
	private Double margin;
	
	@Column(name = "installment_Capacity")
	private Double installmentCapacity;
	
	@Column(name = "rate_Of_Interest")
	private Double rateOfInterest;
	
	@Column(name = "tenure")
	private Integer tenure;
	
	@Column(name = "per_Lakh_Emi")
	private Double perLakhEmi;
	
	@Column(name = "loan_Amount_Based_On_Income")
	private Double loanAmountBasedOnIncome;
	
	@Column(name = "recomended_loan_Amount")
	private Double recomendedloanAmount;
	
	@Column(name = "final_Loan_Amount")
	private Double finalLoanAmount;
	
	@Column(name = "instalment_On_Final_LoanAmount")
	private String instalmentOnFinalLoanAmount;
	
	

	public Long getFpProductId() {
		return fpProductId;
	}

	public void setFpProductId(Long fpProductId) {
		this.fpProductId = fpProductId;
	}

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
