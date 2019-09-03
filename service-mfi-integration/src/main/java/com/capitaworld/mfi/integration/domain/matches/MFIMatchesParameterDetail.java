package com.capitaworld.mfi.integration.domain.matches;

import javax.persistence.*;

import com.capitaworld.mfi.integration.domain.common.Auditor;

@Entity
@Table(name = "matches_para_det")
public class MFIMatchesParameterDetail extends Auditor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7533053513218309866L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "matches_para_det_seq")
	private Long id;

	@Column(name = "application_id")
	private Long applicationId;

	///////////
	
	
	@Column(name = "fp_product_id")
	private Long fpProductId;

	@Column(name = "industry_fp", length = 2000)
	private String industryFp;

	@Column(name = "investment_size_fp")
	private String investmentSizeFp;

	@Column(name = "geo_market_fp")
	private String geoMarketFocusFP;

	@Column(name = "asset_cove_fp")
	private String assetCoverageFp;

	@Column(name = "debt_eq_ratio_fp")
	private String debEqRatioFp;

	@Column(name = "current_ratio_fp")
	private String currentRatioFp;

	@Column(name = "interest_cov_fp")
	private String interestCovRatioFp;

	@Column(name = "tol_tnw_fp")
	private String tolTnwFp;

	@Column(name = "customer_con_fp")
	private String customerConFp;

	@Column(name = "no_of_check_last_one_fp")
	private String noOfCheckLastOneFp;

	@Column(name = "no_of_month_last_six_fp")
	private String noOfMonthLastSixFp;

	@Column(name = "risk_model_score_fp")
	private String riskModelScoreFp;

	@Column(name = "age_esta_fp")
	private String ageEstaFp;

	@Column(name = "positive_prof_fp")
	private String positiveProfFp;

	@Column(name = "past_tern_over_fp")
	private String pastTernOverFp;

	@Column(name = "positive_net_fp")
	private String positiveNetFp;

	@Column(name = "turn_over_to_loan_fp")
	private String turnOverToLoanFp;

	@Column(name = "gross_cash_accural_fp")
	private String grossCashAccuralFp;

	@Column(name = "minimum_cibil_fp")
	private String minimumCibilFp;

	@Column(name = "commercial_cibil_fp")
	private String commercialCibilFp;

	@Column(name = "tenure_fp")
	private String tenureFp;

	// start new 1-05-2019

	@Column(name = "cgtmse_coverage_fp")
	private String cgtmseCoverageFp;

	@Column(name = "msme_funding_fp")
	private String msmeFundingFp;

	@Column(name = "max_allow_drop_in_turnover_fp")
	private String maxAllowDropInTurnoverFp;

	@Column(name = "utilisation_percentage_fp")
	private String utilisationPercentageFp;

	@Column(name = "credit_summation_fp")
	private String creditSummationFp;

	@Column(name = "collateral_coverage_fp")
	private String collateralCoverageFp;

	@Column(name = "cnsrvtv_dbt_srvc_cvrg_ratio_fp")
	private String conservativeDebtServiceCoverageRatioFp;

	// end new 1-05-2019
	//////////////////

	@Column(name = "industry_fs")
	private String industryFs;

	@Column(name = "investment_size_fs")
	private String investmentSizeFs;

	@Column(name = "geo_market_fs")
	private String geoMarketFocusFs;

	@Column(name = "asset_cove_fs")
	private String assetCoverageFs;

	@Column(name = "debt_eq_ratio_fs")
	private String debEqRatioFs;

	@Column(name = "current_ratio_fs")
	private String currentRatioFs;

	@Column(name = "interest_cov_fs")
	private String interestCovRatioFs;

	@Column(name = "tol_tnw_fs")
	private String tolTnwFs;

	@Column(name = "customer_con_fs")
	private String customerConFs;

	@Column(name = "no_of_check_last_one_fs")
	private String noOfCheckLastOneFs;

	@Column(name = "no_of_month_last_six_fs")
	private String noOfMonthLastSixFs;

	@Column(name = "risk_model_score_fs")
	private String riskModelScoreFs;

	@Column(name = "age_esta_fs")
	private String ageEstaFs;

	@Column(name = "positive_prof_fs")
	private String positiveProfFs;

	@Column(name = "past_tern_over_fs")
	private String pastTernOverFs;

	@Column(name = "positive_net_fs")
	private String positiveNetFs;

	@Column(name = "turn_over_to_loan_fs")
	private String turnOverToLoanFs;

	@Column(name = "gross_cash_accural_fs")
	private String grossCashAccuralFs;

	@Column(name = "minimum_cibil_fs")
	private String minimumCibilFs;

	@Column(name = "commercial_cibil_fs")
	private String commercialCibilFs;

	@Column(name = "tenure_fs")
	private String tenureFs;

	// start new 1-05-2019
	@Column(name = "cgtmse_coverage_fs")
	private String cgtmseCoverageFs;

	@Column(name = "msme_funding_fs")
	private String msmeFundingFs;

	@Column(name = "max_allow_drop_in_turnover_fs")
	private String maxAllowDropInTurnoverFs;

	@Column(name = "utilisation_percentage_fs")
	private String utilisationPercentageFs;

	@Column(name = "credit_summation_fs")
	private String creditSummationFs;

	@Column(name = "collateral_coverage_fs")
	private String collateralCoverageFs;

	@Column(name = "cnsrvtv_dbt_srvc_cvrg_ratio_fs")
	private String conservativeDebtServiceCoverageRatioFs;
	// end new 1-05-2019

	///////////

	@Column(name = "industry_flag")
	private Boolean industryFlag;

	@Column(name = "investment_size_flag")
	private Boolean investmentSizeFlag;

	@Column(name = "geo_market_flag")
	private Boolean geoMarketFocusFlag;

	@Column(name = "asset_cove_flag")
	private Boolean assetCoverageFlag;

	@Column(name = "debt_eq_ratio_flag")
	private Boolean debEqRatioFlag;

	@Column(name = "current_ratio_flag")
	private Boolean currentRatioFlag;

	@Column(name = "interest_cov_flag")
	private Boolean interestCovRatioFlag;

	@Column(name = "tol_tnw_flag")
	private Boolean tolTnwFlag;

	@Column(name = "customer_con_flag")
	private Boolean customerConFlag;

	@Column(name = "no_of_check_last_one_flag")
	private Boolean noOfCheckLastOneFlag;

	@Column(name = "no_of_month_last_six_flag")
	private Boolean noOfMonthLastSixFlag;

	@Column(name = "risk_model_score_flag")
	private Boolean riskModelScoreFlag;

	@Column(name = "age_esta_flag")
	private Boolean ageEstaFlag;

	@Column(name = "positive_prof_flag")
	private Boolean positiveProfFlag;

	@Column(name = "past_tern_over_flag")
	private Boolean pastTernOverFlag;

	@Column(name = "positive_net_flag")
	private Boolean positiveNetFlag;

	@Column(name = "turn_over_to_loan_flag")
	private Boolean turnOverToLoanFlag;

	@Column(name = "gross_cash_accural_flag")
	private Boolean grossCashAccuralFlag;

	@Column(name = "minimum_cibil_flag")
	private Boolean minimumCibilFlag;

	@Column(name = "commercial_cibil_flag")
	private Boolean commercialCibilFlag;

	@Column(name = "tenure_flag")
	private Boolean tenureFlag;

	// start new 1-05-2019

	@Column(name = "cgtmse_coverage_flag")
	private Boolean cgtmseCoverageFlag;

	@Column(name = "msme_funding_flag")
	private Boolean msmeFundingFlag;

	@Column(name = "max_allow_drop_in_turnover_flg")
	private Boolean maxAllowDropInTurnoverFlag;

	@Column(name = "utilisation_percentage_flag")
	private Boolean utilisationPercentageFlag;

	@Column(name = "credit_summation_flag")
	private Boolean creditSummationFlag;

	@Column(name = "collateral_coverage_flag")
	private Boolean collateralCoverageFlag;

	@Column(name = "cnsrvtv_dbt_srvc_cvrg_rtio_flg")
	private Boolean conservativeDebtServiceCoverageRatioFlag;
	// end new 1-05-2019
	
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

	public String getIndustryFp() {
		return industryFp;
	}

	public void setIndustryFp(String industryFp) {
		this.industryFp = industryFp;
	}

	public String getInvestmentSizeFp() {
		return investmentSizeFp;
	}

	public void setInvestmentSizeFp(String investmentSizeFp) {
		this.investmentSizeFp = investmentSizeFp;
	}

	public String getGeoMarketFocusFP() {
		return geoMarketFocusFP;
	}

	public void setGeoMarketFocusFP(String geoMarketFocusFP) {
		this.geoMarketFocusFP = geoMarketFocusFP;
	}

	public String getAssetCoverageFp() {
		return assetCoverageFp;
	}

	public void setAssetCoverageFp(String assetCoverageFp) {
		this.assetCoverageFp = assetCoverageFp;
	}

	public String getDebEqRatioFp() {
		return debEqRatioFp;
	}

	public void setDebEqRatioFp(String debEqRatioFp) {
		this.debEqRatioFp = debEqRatioFp;
	}

	public String getCurrentRatioFp() {
		return currentRatioFp;
	}

	public void setCurrentRatioFp(String currentRatioFp) {
		this.currentRatioFp = currentRatioFp;
	}

	public String getInterestCovRatioFp() {
		return interestCovRatioFp;
	}

	public void setInterestCovRatioFp(String interestCovRatioFp) {
		this.interestCovRatioFp = interestCovRatioFp;
	}

	public String getTolTnwFp() {
		return tolTnwFp;
	}

	public void setTolTnwFp(String tolTnwFp) {
		this.tolTnwFp = tolTnwFp;
	}

	public String getCustomerConFp() {
		return customerConFp;
	}

	public void setCustomerConFp(String customerConFp) {
		this.customerConFp = customerConFp;
	}

	public String getNoOfCheckLastOneFp() {
		return noOfCheckLastOneFp;
	}

	public void setNoOfCheckLastOneFp(String noOfCheckLastOneFp) {
		this.noOfCheckLastOneFp = noOfCheckLastOneFp;
	}

	public String getNoOfMonthLastSixFp() {
		return noOfMonthLastSixFp;
	}

	public void setNoOfMonthLastSixFp(String noOfMonthLastSixFp) {
		this.noOfMonthLastSixFp = noOfMonthLastSixFp;
	}

	public String getRiskModelScoreFp() {
		return riskModelScoreFp;
	}

	public void setRiskModelScoreFp(String riskModelScoreFp) {
		this.riskModelScoreFp = riskModelScoreFp;
	}

	public String getAgeEstaFp() {
		return ageEstaFp;
	}

	public void setAgeEstaFp(String ageEstaFp) {
		this.ageEstaFp = ageEstaFp;
	}

	public String getPositiveProfFp() {
		return positiveProfFp;
	}

	public void setPositiveProfFp(String positiveProfFp) {
		this.positiveProfFp = positiveProfFp;
	}

	public String getPastTernOverFp() {
		return pastTernOverFp;
	}

	public void setPastTernOverFp(String pastTernOverFp) {
		this.pastTernOverFp = pastTernOverFp;
	}

	public String getPositiveNetFp() {
		return positiveNetFp;
	}

	public void setPositiveNetFp(String positiveNetFp) {
		this.positiveNetFp = positiveNetFp;
	}

	public String getTurnOverToLoanFp() {
		return turnOverToLoanFp;
	}

	public void setTurnOverToLoanFp(String turnOverToLoanFp) {
		this.turnOverToLoanFp = turnOverToLoanFp;
	}

	public String getGrossCashAccuralFp() {
		return grossCashAccuralFp;
	}

	public void setGrossCashAccuralFp(String grossCashAccuralFp) {
		this.grossCashAccuralFp = grossCashAccuralFp;
	}

	public String getMinimumCibilFp() {
		return minimumCibilFp;
	}

	public void setMinimumCibilFp(String minimumCibilFp) {
		this.minimumCibilFp = minimumCibilFp;
	}

	public String getCommercialCibilFp() {
		return commercialCibilFp;
	}

	public void setCommercialCibilFp(String commercialCibilFp) {
		this.commercialCibilFp = commercialCibilFp;
	}

	public String getTenureFp() {
		return tenureFp;
	}

	public void setTenureFp(String tenureFp) {
		this.tenureFp = tenureFp;
	}

	public String getCgtmseCoverageFp() {
		return cgtmseCoverageFp;
	}

	public void setCgtmseCoverageFp(String cgtmseCoverageFp) {
		this.cgtmseCoverageFp = cgtmseCoverageFp;
	}

	public String getMsmeFundingFp() {
		return msmeFundingFp;
	}

	public void setMsmeFundingFp(String msmeFundingFp) {
		this.msmeFundingFp = msmeFundingFp;
	}

	public String getMaxAllowDropInTurnoverFp() {
		return maxAllowDropInTurnoverFp;
	}

	public void setMaxAllowDropInTurnoverFp(String maxAllowDropInTurnoverFp) {
		this.maxAllowDropInTurnoverFp = maxAllowDropInTurnoverFp;
	}

	public String getUtilisationPercentageFp() {
		return utilisationPercentageFp;
	}

	public void setUtilisationPercentageFp(String utilisationPercentageFp) {
		this.utilisationPercentageFp = utilisationPercentageFp;
	}

	public String getCreditSummationFp() {
		return creditSummationFp;
	}

	public void setCreditSummationFp(String creditSummationFp) {
		this.creditSummationFp = creditSummationFp;
	}

	public String getCollateralCoverageFp() {
		return collateralCoverageFp;
	}

	public void setCollateralCoverageFp(String collateralCoverageFp) {
		this.collateralCoverageFp = collateralCoverageFp;
	}

	public String getConservativeDebtServiceCoverageRatioFp() {
		return conservativeDebtServiceCoverageRatioFp;
	}

	public void setConservativeDebtServiceCoverageRatioFp(String conservativeDebtServiceCoverageRatioFp) {
		this.conservativeDebtServiceCoverageRatioFp = conservativeDebtServiceCoverageRatioFp;
	}

	public String getIndustryFs() {
		return industryFs;
	}

	public void setIndustryFs(String industryFs) {
		this.industryFs = industryFs;
	}

	public String getInvestmentSizeFs() {
		return investmentSizeFs;
	}

	public void setInvestmentSizeFs(String investmentSizeFs) {
		this.investmentSizeFs = investmentSizeFs;
	}

	public String getGeoMarketFocusFs() {
		return geoMarketFocusFs;
	}

	public void setGeoMarketFocusFs(String geoMarketFocusFs) {
		this.geoMarketFocusFs = geoMarketFocusFs;
	}

	public String getAssetCoverageFs() {
		return assetCoverageFs;
	}

	public void setAssetCoverageFs(String assetCoverageFs) {
		this.assetCoverageFs = assetCoverageFs;
	}

	public String getDebEqRatioFs() {
		return debEqRatioFs;
	}

	public void setDebEqRatioFs(String debEqRatioFs) {
		this.debEqRatioFs = debEqRatioFs;
	}

	public String getCurrentRatioFs() {
		return currentRatioFs;
	}

	public void setCurrentRatioFs(String currentRatioFs) {
		this.currentRatioFs = currentRatioFs;
	}

	public String getInterestCovRatioFs() {
		return interestCovRatioFs;
	}

	public void setInterestCovRatioFs(String interestCovRatioFs) {
		this.interestCovRatioFs = interestCovRatioFs;
	}

	public String getTolTnwFs() {
		return tolTnwFs;
	}

	public void setTolTnwFs(String tolTnwFs) {
		this.tolTnwFs = tolTnwFs;
	}

	public String getCustomerConFs() {
		return customerConFs;
	}

	public void setCustomerConFs(String customerConFs) {
		this.customerConFs = customerConFs;
	}

	public String getNoOfCheckLastOneFs() {
		return noOfCheckLastOneFs;
	}

	public void setNoOfCheckLastOneFs(String noOfCheckLastOneFs) {
		this.noOfCheckLastOneFs = noOfCheckLastOneFs;
	}

	public String getNoOfMonthLastSixFs() {
		return noOfMonthLastSixFs;
	}

	public void setNoOfMonthLastSixFs(String noOfMonthLastSixFs) {
		this.noOfMonthLastSixFs = noOfMonthLastSixFs;
	}

	public String getRiskModelScoreFs() {
		return riskModelScoreFs;
	}

	public void setRiskModelScoreFs(String riskModelScoreFs) {
		this.riskModelScoreFs = riskModelScoreFs;
	}

	public String getAgeEstaFs() {
		return ageEstaFs;
	}

	public void setAgeEstaFs(String ageEstaFs) {
		this.ageEstaFs = ageEstaFs;
	}

	public String getPositiveProfFs() {
		return positiveProfFs;
	}

	public void setPositiveProfFs(String positiveProfFs) {
		this.positiveProfFs = positiveProfFs;
	}

	public String getPastTernOverFs() {
		return pastTernOverFs;
	}

	public void setPastTernOverFs(String pastTernOverFs) {
		this.pastTernOverFs = pastTernOverFs;
	}

	public String getPositiveNetFs() {
		return positiveNetFs;
	}

	public void setPositiveNetFs(String positiveNetFs) {
		this.positiveNetFs = positiveNetFs;
	}

	public String getTurnOverToLoanFs() {
		return turnOverToLoanFs;
	}

	public void setTurnOverToLoanFs(String turnOverToLoanFs) {
		this.turnOverToLoanFs = turnOverToLoanFs;
	}

	public String getGrossCashAccuralFs() {
		return grossCashAccuralFs;
	}

	public void setGrossCashAccuralFs(String grossCashAccuralFs) {
		this.grossCashAccuralFs = grossCashAccuralFs;
	}

	public String getMinimumCibilFs() {
		return minimumCibilFs;
	}

	public void setMinimumCibilFs(String minimumCibilFs) {
		this.minimumCibilFs = minimumCibilFs;
	}

	public String getCommercialCibilFs() {
		return commercialCibilFs;
	}

	public void setCommercialCibilFs(String commercialCibilFs) {
		this.commercialCibilFs = commercialCibilFs;
	}

	public String getTenureFs() {
		return tenureFs;
	}

	public void setTenureFs(String tenureFs) {
		this.tenureFs = tenureFs;
	}

	public String getCgtmseCoverageFs() {
		return cgtmseCoverageFs;
	}

	public void setCgtmseCoverageFs(String cgtmseCoverageFs) {
		this.cgtmseCoverageFs = cgtmseCoverageFs;
	}

	public String getMsmeFundingFs() {
		return msmeFundingFs;
	}

	public void setMsmeFundingFs(String msmeFundingFs) {
		this.msmeFundingFs = msmeFundingFs;
	}

	public String getMaxAllowDropInTurnoverFs() {
		return maxAllowDropInTurnoverFs;
	}

	public void setMaxAllowDropInTurnoverFs(String maxAllowDropInTurnoverFs) {
		this.maxAllowDropInTurnoverFs = maxAllowDropInTurnoverFs;
	}

	public String getUtilisationPercentageFs() {
		return utilisationPercentageFs;
	}

	public void setUtilisationPercentageFs(String utilisationPercentageFs) {
		this.utilisationPercentageFs = utilisationPercentageFs;
	}

	public String getCreditSummationFs() {
		return creditSummationFs;
	}

	public void setCreditSummationFs(String creditSummationFs) {
		this.creditSummationFs = creditSummationFs;
	}

	public String getCollateralCoverageFs() {
		return collateralCoverageFs;
	}

	public void setCollateralCoverageFs(String collateralCoverageFs) {
		this.collateralCoverageFs = collateralCoverageFs;
	}

	public String getConservativeDebtServiceCoverageRatioFs() {
		return conservativeDebtServiceCoverageRatioFs;
	}

	public void setConservativeDebtServiceCoverageRatioFs(String conservativeDebtServiceCoverageRatioFs) {
		this.conservativeDebtServiceCoverageRatioFs = conservativeDebtServiceCoverageRatioFs;
	}

	public Boolean getIndustryFlag() {
		return industryFlag;
	}

	public void setIndustryFlag(Boolean industryFlag) {
		this.industryFlag = industryFlag;
	}

	public Boolean getInvestmentSizeFlag() {
		return investmentSizeFlag;
	}

	public void setInvestmentSizeFlag(Boolean investmentSizeFlag) {
		this.investmentSizeFlag = investmentSizeFlag;
	}

	public Boolean getGeoMarketFocusFlag() {
		return geoMarketFocusFlag;
	}

	public void setGeoMarketFocusFlag(Boolean geoMarketFocusFlag) {
		this.geoMarketFocusFlag = geoMarketFocusFlag;
	}

	public Boolean getAssetCoverageFlag() {
		return assetCoverageFlag;
	}

	public void setAssetCoverageFlag(Boolean assetCoverageFlag) {
		this.assetCoverageFlag = assetCoverageFlag;
	}

	public Boolean getDebEqRatioFlag() {
		return debEqRatioFlag;
	}

	public void setDebEqRatioFlag(Boolean debEqRatioFlag) {
		this.debEqRatioFlag = debEqRatioFlag;
	}

	public Boolean getCurrentRatioFlag() {
		return currentRatioFlag;
	}

	public void setCurrentRatioFlag(Boolean currentRatioFlag) {
		this.currentRatioFlag = currentRatioFlag;
	}

	public Boolean getInterestCovRatioFlag() {
		return interestCovRatioFlag;
	}

	public void setInterestCovRatioFlag(Boolean interestCovRatioFlag) {
		this.interestCovRatioFlag = interestCovRatioFlag;
	}

	public Boolean getTolTnwFlag() {
		return tolTnwFlag;
	}

	public void setTolTnwFlag(Boolean tolTnwFlag) {
		this.tolTnwFlag = tolTnwFlag;
	}

	public Boolean getCustomerConFlag() {
		return customerConFlag;
	}

	public void setCustomerConFlag(Boolean customerConFlag) {
		this.customerConFlag = customerConFlag;
	}

	public Boolean getNoOfCheckLastOneFlag() {
		return noOfCheckLastOneFlag;
	}

	public void setNoOfCheckLastOneFlag(Boolean noOfCheckLastOneFlag) {
		this.noOfCheckLastOneFlag = noOfCheckLastOneFlag;
	}

	public Boolean getNoOfMonthLastSixFlag() {
		return noOfMonthLastSixFlag;
	}

	public void setNoOfMonthLastSixFlag(Boolean noOfMonthLastSixFlag) {
		this.noOfMonthLastSixFlag = noOfMonthLastSixFlag;
	}

	public Boolean getRiskModelScoreFlag() {
		return riskModelScoreFlag;
	}

	public void setRiskModelScoreFlag(Boolean riskModelScoreFlag) {
		this.riskModelScoreFlag = riskModelScoreFlag;
	}

	public Boolean getAgeEstaFlag() {
		return ageEstaFlag;
	}

	public void setAgeEstaFlag(Boolean ageEstaFlag) {
		this.ageEstaFlag = ageEstaFlag;
	}

	public Boolean getPositiveProfFlag() {
		return positiveProfFlag;
	}

	public void setPositiveProfFlag(Boolean positiveProfFlag) {
		this.positiveProfFlag = positiveProfFlag;
	}

	public Boolean getPastTernOverFlag() {
		return pastTernOverFlag;
	}

	public void setPastTernOverFlag(Boolean pastTernOverFlag) {
		this.pastTernOverFlag = pastTernOverFlag;
	}

	public Boolean getPositiveNetFlag() {
		return positiveNetFlag;
	}

	public void setPositiveNetFlag(Boolean positiveNetFlag) {
		this.positiveNetFlag = positiveNetFlag;
	}

	public Boolean getTurnOverToLoanFlag() {
		return turnOverToLoanFlag;
	}

	public void setTurnOverToLoanFlag(Boolean turnOverToLoanFlag) {
		this.turnOverToLoanFlag = turnOverToLoanFlag;
	}

	public Boolean getGrossCashAccuralFlag() {
		return grossCashAccuralFlag;
	}

	public void setGrossCashAccuralFlag(Boolean grossCashAccuralFlag) {
		this.grossCashAccuralFlag = grossCashAccuralFlag;
	}

	public Boolean getMinimumCibilFlag() {
		return minimumCibilFlag;
	}

	public void setMinimumCibilFlag(Boolean minimumCibilFlag) {
		this.minimumCibilFlag = minimumCibilFlag;
	}

	public Boolean getCommercialCibilFlag() {
		return commercialCibilFlag;
	}

	public void setCommercialCibilFlag(Boolean commercialCibilFlag) {
		this.commercialCibilFlag = commercialCibilFlag;
	}

	public Boolean getTenureFlag() {
		return tenureFlag;
	}

	public void setTenureFlag(Boolean tenureFlag) {
		this.tenureFlag = tenureFlag;
	}

	public Boolean getCgtmseCoverageFlag() {
		return cgtmseCoverageFlag;
	}

	public void setCgtmseCoverageFlag(Boolean cgtmseCoverageFlag) {
		this.cgtmseCoverageFlag = cgtmseCoverageFlag;
	}

	public Boolean getMsmeFundingFlag() {
		return msmeFundingFlag;
	}

	public void setMsmeFundingFlag(Boolean msmeFundingFlag) {
		this.msmeFundingFlag = msmeFundingFlag;
	}

	public Boolean getMaxAllowDropInTurnoverFlag() {
		return maxAllowDropInTurnoverFlag;
	}

	public void setMaxAllowDropInTurnoverFlag(Boolean maxAllowDropInTurnoverFlag) {
		this.maxAllowDropInTurnoverFlag = maxAllowDropInTurnoverFlag;
	}

	public Boolean getUtilisationPercentageFlag() {
		return utilisationPercentageFlag;
	}

	public void setUtilisationPercentageFlag(Boolean utilisationPercentageFlag) {
		this.utilisationPercentageFlag = utilisationPercentageFlag;
	}

	public Boolean getCreditSummationFlag() {
		return creditSummationFlag;
	}

	public void setCreditSummationFlag(Boolean creditSummationFlag) {
		this.creditSummationFlag = creditSummationFlag;
	}

	public Boolean getCollateralCoverageFlag() {
		return collateralCoverageFlag;
	}

	public void setCollateralCoverageFlag(Boolean collateralCoverageFlag) {
		this.collateralCoverageFlag = collateralCoverageFlag;
	}

	public Boolean getConservativeDebtServiceCoverageRatioFlag() {
		return conservativeDebtServiceCoverageRatioFlag;
	}

	public void setConservativeDebtServiceCoverageRatioFlag(Boolean conservativeDebtServiceCoverageRatioFlag) {
		this.conservativeDebtServiceCoverageRatioFlag = conservativeDebtServiceCoverageRatioFlag;
	}

}
