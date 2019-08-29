package com.capitaworld.mfi.integration.api.model.oneform;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IncomeDetailsRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private String relation;
	private String occupationType;
	private String frequencyIncomeType;
	private Integer incomeDays;
	private Double monthlyIncome;
	private Double yearlyIncome;

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getOccupationType() {
		return occupationType;
	}

	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}

	public String getFrequencyIncomeType() {
		return frequencyIncomeType;
	}

	public void setFrequencyIncomeType(String frequencyIncomeType) {
		this.frequencyIncomeType = frequencyIncomeType;
	}

	public Integer getIncomeDays() {
		return incomeDays;
	}

	public void setIncomeDays(Integer incomeDays) {
		this.incomeDays = incomeDays;
	}

	public Double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(Double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public Double getYearlyIncome() {
		return yearlyIncome;
	}

	public void setYearlyIncome(Double yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}

}
