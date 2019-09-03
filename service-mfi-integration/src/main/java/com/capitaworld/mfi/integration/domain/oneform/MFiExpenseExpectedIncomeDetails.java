package com.capitaworld.mfi.integration.domain.oneform;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.capitaworld.mfi.integration.domain.common.Auditor;

@Entity
@Table(name = "applicant_expense_expected_income_details")
public class MFiExpenseExpectedIncomeDetails extends Auditor {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "applicant_detail_Id")
	private Long applicantDetailId;
	
	@Column(name = "application_Id")
	private Long applicationId;

	@Column(name = "education_expense")
	private Double educationExpense;

	@Column(name = "medical_expense")
	private Double medicalExpense;

	@Column(name = "food_expense")
	private Double foodExpense;

	@Column(name = "other_expense")
	private Double otherExpense;

	@Column(name = "house_hold_expense")
	private Double houseHoldExpense;

	@Column(name = "clothes_expense")
	private Double clothesExpense;

	@Column(name = "business_in_brief")
	private Integer businessInBrief;

	@Column(name = "monthly_cashflow")
	private Double monthlyCashflow;

	@Column(name = "monthly_expenditure")
	private Double monthlyExpenditure;

	@Column(name = "monthly_income")
	private Double monthlyIncome;

	@Column(name = "total_expense")
	private Double totalExpense;

	@Column(name = "net_saving")
	private Double netSaving;

	@Column(name = "cash_flow")
	private Double cashFlow;

	@Column(name = "totl_monthly_income_for_family")
	private Double totalMonthlyIncomeForFamily;

	@Column(name = "existing_expenses")
	private Double existingExpenses;

	@Column(name = "expected_increase_in_income")
	private Double expectedIncreaseInIncome;

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

	public Double getEducationExpense() {
		return educationExpense;
	}

	public void setEducationExpense(Double educationExpense) {
		this.educationExpense = educationExpense;
	}

	public Double getMedicalExpense() {
		return medicalExpense;
	}

	public void setMedicalExpense(Double medicalExpense) {
		this.medicalExpense = medicalExpense;
	}

	public Double getFoodExpense() {
		return foodExpense;
	}

	public void setFoodExpense(Double foodExpense) {
		this.foodExpense = foodExpense;
	}

	public Double getOtherExpense() {
		return otherExpense;
	}

	public void setOtherExpense(Double otherExpense) {
		this.otherExpense = otherExpense;
	}

	public Double getHouseHoldExpense() {
		return houseHoldExpense;
	}

	public void setHouseHoldExpense(Double houseHoldExpense) {
		this.houseHoldExpense = houseHoldExpense;
	}

	public Double getClothesExpense() {
		return clothesExpense;
	}

	public void setClothesExpense(Double clothesExpense) {
		this.clothesExpense = clothesExpense;
	}

	public Integer getBusinessInBrief() {
		return businessInBrief;
	}

	public void setBusinessInBrief(Integer businessInBrief) {
		this.businessInBrief = businessInBrief;
	}

	public Double getMonthlyCashflow() {
		return monthlyCashflow;
	}

	public void setMonthlyCashflow(Double monthlyCashflow) {
		this.monthlyCashflow = monthlyCashflow;
	}

	public Double getMonthlyExpenditure() {
		return monthlyExpenditure;
	}

	public void setMonthlyExpenditure(Double monthlyExpenditure) {
		this.monthlyExpenditure = monthlyExpenditure;
	}

	public Double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(Double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public Double getTotalExpense() {
		return totalExpense;
	}

	public void setTotalExpense(Double totalExpense) {
		this.totalExpense = totalExpense;
	}

	public Double getNetSaving() {
		return netSaving;
	}

	public void setNetSaving(Double netSaving) {
		this.netSaving = netSaving;
	}

	public Double getCashFlow() {
		return cashFlow;
	}

	public void setCashFlow(Double cashFlow) {
		this.cashFlow = cashFlow;
	}

	public Double getTotalMonthlyIncomeForFamily() {
		return totalMonthlyIncomeForFamily;
	}

	public void setTotalMonthlyIncomeForFamily(Double totalMonthlyIncomeForFamily) {
		this.totalMonthlyIncomeForFamily = totalMonthlyIncomeForFamily;
	}

	public Double getExistingExpenses() {
		return existingExpenses;
	}

	public void setExistingExpenses(Double existingExpenses) {
		this.existingExpenses = existingExpenses;
	}

	public Double getExpectedIncreaseInIncome() {
		return expectedIncreaseInIncome;
	}

	public void setExpectedIncreaseInIncome(Double expectedIncreaseInIncome) {
		this.expectedIncreaseInIncome = expectedIncreaseInIncome;
	}

}
