package com.capitaworld.mfi.integration.api.model.oneform;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpenseExpectedIncomeDetailsRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private Double houseHoldExpense;
	private Double educationExpense;
	private Double medicalExpense;
	private Double foodExpense;
	private Double clothesExpense;
	private Double otherExpense;
	private Double totalExpense;
	private Integer businessInBrief;
	private Double monthlyCashflow;
	private Double monthlyExpenditure;
	private Double monthlyIncome;
	private Double totalMonthlyIncomeForFamily;
	private Double existingExpenses;
	private Double netSaving;
	private Double expectedIncreaseInIncome;
	private Double cashFlow;

	public Double getHouseHoldExpense() {
		return houseHoldExpense;
	}

	public void setHouseHoldExpense(Double houseHoldExpense) {
		this.houseHoldExpense = houseHoldExpense;
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

	public Double getClothesExpense() {
		return clothesExpense;
	}

	public void setClothesExpense(Double clothesExpense) {
		this.clothesExpense = clothesExpense;
	}

	public Double getOtherExpense() {
		return otherExpense;
	}

	public void setOtherExpense(Double otherExpense) {
		this.otherExpense = otherExpense;
	}

	public Double getTotalExpense() {
		return totalExpense;
	}

	public void setTotalExpense(Double totalExpense) {
		this.totalExpense = totalExpense;
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

	public Double getNetSaving() {
		return netSaving;
	}

	public void setNetSaving(Double netSaving) {
		this.netSaving = netSaving;
	}

	public Double getExpectedIncreaseInIncome() {
		return expectedIncreaseInIncome;
	}

	public void setExpectedIncreaseInIncome(Double expectedIncreaseInIncome) {
		this.expectedIncreaseInIncome = expectedIncreaseInIncome;
	}

	public Double getCashFlow() {
		return cashFlow;
	}

	public void setCashFlow(Double cashFlow) {
		this.cashFlow = cashFlow;
	}

}
