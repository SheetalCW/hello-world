package com.capitaworld.mfi.integration.domain.bankscore;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.capitaworld.mfi.integration.domain.common.Auditor;


@Entity
@Table(name = "score_parameter_master")
public class ScoreParameterMaster extends Auditor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1575113961826942568L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "score_parameter_master_seq")
	private Long id;

	@Column(name = "application_id")
	private Long applicationId;

	@Column(name = "fp_product_id")
	private Long fpProductId;

	@Column(name = "cw_co_applicant_id")
	private Long cwCoApplicantId;

	@Column(name = "total_score")
	private Double totalScore;

	@Column(name = "risk_grading_id")
	private Long riskGradingId;

	@Column(name = "scale")
	private Double scale;

	@Column(name = "interpretation")
	private String interpretation;

	@Column(name = "foir")
	private Double foir;

	@Column(name = "roi")
	private Double roi;

	@Column(name = "tenure")
	private Double tenure;

	@Column(name = "processing_fees")
	private Double processingFees;

	@Column(name = "loan_to_value")
	private Double loanToValue;

	@Column(name = "management_risk_score")
	private Double managementRiskScore;

	@Column(name = "financial_risk_score")
	private Double financialRiskScore;

	@Column(name = "business_risk_score")
	private Double businessRiskScore;

	@Column(name = "mgmt_risk_max_total_score")
	private Double managementRiskMaxTotalScore;

	@Column(name = "financial_risk_max_total_score")
	private Double financialRiskMaxTotalScore;

	@Column(name = "business_risk_max_total_score")
	private Double businessRiskMaxTotalScore;

	///////////

	@Column(name = "mgmt_risk_max_total_weight")
	private Double managementRiskMaxTotalWeight;

	@Column(name = "financil_risk_max_total_weight")
	private Double financialRiskMaxTotalWeight;

	@Column(name = "business_risk_max_total_weight")
	private Double businessRiskMaxTotalWeight;

	//////////////

	@Column(name = "management_risk_weight")
	private Double managementRiskWeight;

	@Column(name = "financial_risk_weight")
	private Double financialRiskWeight;

	@Column(name = "business_risk_reight")
	private Double businessRiskWeight;

	@Column(name = "request")
	@Type(type= "text")
	private String request;

	@Column(name = "scoring_model_id")
	private Long scoringModelId;

	@Column(name = "scoring_total_score")
	private Double scoringTotalScore;

	@Column(name = "is_weight_consider")
	private Boolean isWeightConsider;

	@Column(name = "mngmt_scr_with_risk_weight")
	private Double managementScoreWithRiskWeight;

	@Column(name = "financial_scr_with_risk_weight")
	private Double financialScoreWithRiskWeight;

	@Column(name = "business_scr_with_risk_weight")
	private Double businessScoreWithRiskWeight;

	@Column(name = "mgmt_risk_weight_scoring")
	private Double managementRiskWeightOfScoring;

	@Column(name = "financial_risk_weight_scoring")
	private Double financialRiskWeightOfScoring;

	@Column(name = "business_risk_weight_scoring")
	private Double businessRiskWeightOfScoring;

	@Column(name = "is_proportionate_scr_consider")
	private Boolean isProportionateScoreConsider;

	@Column(name = "proportionate_score")
	private Double proportionateScore;

	@Column(name = "proportionate_score_fs")
	private Double proportionateScoreFS;

	@Column(name = "foir_scaling")
	private Integer marginScaling;

	@Column(name = "roi_scaling")
	private Integer roiScaling;

	@Column(name = "tenure_scaling")
	private Integer tenureScaling;

	@Column(name = "pf_scaling")
	private Integer pfScaling;

	@OneToMany(mappedBy = "scoreParameterMasterId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ScoreParameterMasterDetail> scoreParameterMasterDetailList;

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

	public Long getFpProductId() {
		return fpProductId;
	}

	public void setFpProductId(Long fpProductId) {
		this.fpProductId = fpProductId;
	}

	public Long getCwCoApplicantId() {
		return cwCoApplicantId;
	}

	public void setCwCoApplicantId(Long cwCoApplicantId) {
		this.cwCoApplicantId = cwCoApplicantId;
	}

	public Double getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Double totalScore) {
		this.totalScore = totalScore;
	}

	public Long getRiskGradingId() {
		return riskGradingId;
	}

	public void setRiskGradingId(Long riskGradingId) {
		this.riskGradingId = riskGradingId;
	}

	public Double getScale() {
		return scale;
	}

	public void setScale(Double scale) {
		this.scale = scale;
	}

	public String getInterpretation() {
		return interpretation;
	}

	public void setInterpretation(String interpretation) {
		this.interpretation = interpretation;
	}

	public Double getFoir() {
		return foir;
	}

	public void setFoir(Double foir) {
		this.foir = foir;
	}

	public Double getRoi() {
		return roi;
	}

	public void setRoi(Double roi) {
		this.roi = roi;
	}

	public Double getTenure() {
		return tenure;
	}

	public void setTenure(Double tenure) {
		this.tenure = tenure;
	}

	public Double getProcessingFees() {
		return processingFees;
	}

	public void setProcessingFees(Double processingFees) {
		this.processingFees = processingFees;
	}

	public Double getLoanToValue() {
		return loanToValue;
	}

	public void setLoanToValue(Double loanToValue) {
		this.loanToValue = loanToValue;
	}

	public Double getManagementRiskScore() {
		return managementRiskScore;
	}

	public void setManagementRiskScore(Double managementRiskScore) {
		this.managementRiskScore = managementRiskScore;
	}

	public Double getFinancialRiskScore() {
		return financialRiskScore;
	}

	public void setFinancialRiskScore(Double financialRiskScore) {
		this.financialRiskScore = financialRiskScore;
	}

	public Double getBusinessRiskScore() {
		return businessRiskScore;
	}

	public void setBusinessRiskScore(Double businessRiskScore) {
		this.businessRiskScore = businessRiskScore;
	}

	public Double getManagementRiskMaxTotalScore() {
		return managementRiskMaxTotalScore;
	}

	public void setManagementRiskMaxTotalScore(Double managementRiskMaxTotalScore) {
		this.managementRiskMaxTotalScore = managementRiskMaxTotalScore;
	}

	public Double getFinancialRiskMaxTotalScore() {
		return financialRiskMaxTotalScore;
	}

	public void setFinancialRiskMaxTotalScore(Double financialRiskMaxTotalScore) {
		this.financialRiskMaxTotalScore = financialRiskMaxTotalScore;
	}

	public Double getBusinessRiskMaxTotalScore() {
		return businessRiskMaxTotalScore;
	}

	public void setBusinessRiskMaxTotalScore(Double businessRiskMaxTotalScore) {
		this.businessRiskMaxTotalScore = businessRiskMaxTotalScore;
	}

	public Double getManagementRiskMaxTotalWeight() {
		return managementRiskMaxTotalWeight;
	}

	public void setManagementRiskMaxTotalWeight(Double managementRiskMaxTotalWeight) {
		this.managementRiskMaxTotalWeight = managementRiskMaxTotalWeight;
	}

	public Double getFinancialRiskMaxTotalWeight() {
		return financialRiskMaxTotalWeight;
	}

	public void setFinancialRiskMaxTotalWeight(Double financialRiskMaxTotalWeight) {
		this.financialRiskMaxTotalWeight = financialRiskMaxTotalWeight;
	}

	public Double getBusinessRiskMaxTotalWeight() {
		return businessRiskMaxTotalWeight;
	}

	public void setBusinessRiskMaxTotalWeight(Double businessRiskMaxTotalWeight) {
		this.businessRiskMaxTotalWeight = businessRiskMaxTotalWeight;
	}

	public Double getManagementRiskWeight() {
		return managementRiskWeight;
	}

	public void setManagementRiskWeight(Double managementRiskWeight) {
		this.managementRiskWeight = managementRiskWeight;
	}

	public Double getFinancialRiskWeight() {
		return financialRiskWeight;
	}

	public void setFinancialRiskWeight(Double financialRiskWeight) {
		this.financialRiskWeight = financialRiskWeight;
	}

	public Double getBusinessRiskWeight() {
		return businessRiskWeight;
	}

	public void setBusinessRiskWeight(Double businessRiskWeight) {
		this.businessRiskWeight = businessRiskWeight;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public Long getScoringModelId() {
		return scoringModelId;
	}

	public void setScoringModelId(Long scoringModelId) {
		this.scoringModelId = scoringModelId;
	}

	public Double getScoringTotalScore() {
		return scoringTotalScore;
	}

	public void setScoringTotalScore(Double scoringTotalScore) {
		this.scoringTotalScore = scoringTotalScore;
	}

	public Boolean getIsWeightConsider() {
		return isWeightConsider;
	}

	public void setIsWeightConsider(Boolean isWeightConsider) {
		this.isWeightConsider = isWeightConsider;
	}

	public Double getManagementScoreWithRiskWeight() {
		return managementScoreWithRiskWeight;
	}

	public void setManagementScoreWithRiskWeight(Double managementScoreWithRiskWeight) {
		this.managementScoreWithRiskWeight = managementScoreWithRiskWeight;
	}

	public Double getFinancialScoreWithRiskWeight() {
		return financialScoreWithRiskWeight;
	}

	public void setFinancialScoreWithRiskWeight(Double financialScoreWithRiskWeight) {
		this.financialScoreWithRiskWeight = financialScoreWithRiskWeight;
	}

	public Double getBusinessScoreWithRiskWeight() {
		return businessScoreWithRiskWeight;
	}

	public void setBusinessScoreWithRiskWeight(Double businessScoreWithRiskWeight) {
		this.businessScoreWithRiskWeight = businessScoreWithRiskWeight;
	}

	public Double getManagementRiskWeightOfScoring() {
		return managementRiskWeightOfScoring;
	}

	public void setManagementRiskWeightOfScoring(Double managementRiskWeightOfScoring) {
		this.managementRiskWeightOfScoring = managementRiskWeightOfScoring;
	}

	public Double getFinancialRiskWeightOfScoring() {
		return financialRiskWeightOfScoring;
	}

	public void setFinancialRiskWeightOfScoring(Double financialRiskWeightOfScoring) {
		this.financialRiskWeightOfScoring = financialRiskWeightOfScoring;
	}

	public Double getBusinessRiskWeightOfScoring() {
		return businessRiskWeightOfScoring;
	}

	public void setBusinessRiskWeightOfScoring(Double businessRiskWeightOfScoring) {
		this.businessRiskWeightOfScoring = businessRiskWeightOfScoring;
	}

	public Boolean getIsProportionateScoreConsider() {
		return isProportionateScoreConsider;
	}

	public void setIsProportionateScoreConsider(Boolean isProportionateScoreConsider) {
		this.isProportionateScoreConsider = isProportionateScoreConsider;
	}

	public Double getProportionateScore() {
		return proportionateScore;
	}

	public void setProportionateScore(Double proportionateScore) {
		this.proportionateScore = proportionateScore;
	}

	public Double getProportionateScoreFS() {
		return proportionateScoreFS;
	}

	public void setProportionateScoreFS(Double proportionateScoreFS) {
		this.proportionateScoreFS = proportionateScoreFS;
	}

	public Integer getMarginScaling() {
		return marginScaling;
	}

	public void setMarginScaling(Integer marginScaling) {
		this.marginScaling = marginScaling;
	}

	public Integer getRoiScaling() {
		return roiScaling;
	}

	public void setRoiScaling(Integer roiScaling) {
		this.roiScaling = roiScaling;
	}

	public Integer getTenureScaling() {
		return tenureScaling;
	}

	public void setTenureScaling(Integer tenureScaling) {
		this.tenureScaling = tenureScaling;
	}

	public Integer getPfScaling() {
		return pfScaling;
	}

	public void setPfScaling(Integer pfScaling) {
		this.pfScaling = pfScaling;
	}

	public List<ScoreParameterMasterDetail> getScoreParameterMasterDetailList() {
		return scoreParameterMasterDetailList;
	}

	public void setScoreParameterMasterDetailList(List<ScoreParameterMasterDetail> scoreParameterMasterDetailList) {
		this.scoreParameterMasterDetailList = scoreParameterMasterDetailList;
	}

}
