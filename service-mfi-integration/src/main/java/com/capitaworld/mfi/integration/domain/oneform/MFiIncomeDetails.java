package com.capitaworld.mfi.integration.domain.oneform;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.capitaworld.mfi.integration.domain.common.Auditor;

@Entity
@Table(name = "applicant_income_details")
public class MFiIncomeDetails extends Auditor {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "applicant_detail_Id")
	private Long applicantDetailId;

	
	@Column(name = "application_Id")
	private Long applicationId;

	@Column(name = "relation")
	private String relation;

	@Column(name = "occupation_type")
	private String occupationType;

	@Column(name = "frequency_income_type")
	private String frequencyIncomeType;

	@Column(name = "income_days")
	private Integer incomeDays;

	@Column(name = "monthly_income")
	private Double monthlyIncome;

	@Column(name = "yearly_income")
	private Double yearlyIncome;

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
