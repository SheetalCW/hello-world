package com.capitaworld.mfi.integration.api.model.bankscore;

import java.io.Serializable;
import java.util.List;

import com.capitaworld.api.common.lib.model.common.AuditorRequest;

public class ScoreParameterMasterRetailRequest extends AuditorRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1575113961826942568L;

	private Long id;

	private Long applicationId;

	private Long fpProductId;

	private Long cwCoApplicantId;

	private Double totalScore;

	private Long riskGradingId;

	private Double scale;

	private String interpretation;

	private Double foir;

	private Double roi;

	private Double tenure;

	private Double processingFees;

	private Double loanToValue;

	private Double managementRiskScore;

	private Double financialRiskScore;

	private Double businessRiskScore;

	private Double managementRiskMaxTotalScore;

	private Double financialRiskMaxTotalScore;

	private Double businessRiskMaxTotalScore;

	///////////

	private Double managementRiskMaxTotalWeight;

	private Double financialRiskMaxTotalWeight;

	private Double businessRiskMaxTotalWeight;

	//////////////

	private Double managementRiskWeight;

	private Double financialRiskWeight;

	private Double businessRiskWeight;

	private String request;

	private Long scoringModelId;

	private Double scoringTotalScore;

	private Boolean isWeightConsider;

	private Double managementScoreWithRiskWeight;

	private Double financialScoreWithRiskWeight;

	private Double businessScoreWithRiskWeight;

	private Double managementRiskWeightOfScoring;

	private Double financialRiskWeightOfScoring;

	private Double businessRiskWeightOfScoring;

	private Boolean isProportionateScoreConsider;

	private Double proportionateScore;

	private Double proportionateScoreFS;

	private Integer marginScaling;

	private Integer roiScaling;

	private Integer tenureScaling;

	private Integer pfScaling;

	private String userName;

	private String password;

	private Boolean isCoApplicant = false;
	private List<ScoreParameterMasterDetailRetailRequest> scoreParameterMasterDetailRetailRequestList;

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

	public Boolean getIsCoApplicant() {
		return isCoApplicant;
	}

	public void setIsCoApplicant(Boolean isCoApplicant) {
		this.isCoApplicant = isCoApplicant;
	}

	public List<ScoreParameterMasterDetailRetailRequest> getScoreParameterMasterDetailRetailRequestList() {
		return scoreParameterMasterDetailRetailRequestList;
	}

	public void setScoreParameterMasterDetailRetailRequestList(
			List<ScoreParameterMasterDetailRetailRequest> scoreParameterMasterDetailRetailRequestList) {
		this.scoreParameterMasterDetailRetailRequestList = scoreParameterMasterDetailRetailRequestList;
	}

}
