package com.capitaworld.mfi.integration.api.model.matches;
import java.io.Serializable;

import com.capitaworld.api.common.lib.model.common.AuditorRequest;
import com.capitaworld.api.common.lib.model.common.AuthRequest;

public class MatchesParameterRequest extends AuditorRequest implements Serializable , AuthRequest{

	/**
	* 
	*/
	private static final long serialVersionUID = -7569468800671457278L;

	private Long id;

	private Long applicationId;
	private Long fpProductId;

	///////////

	private String industryFp;

	private String investmentSizeFp;

	private String geoMarketFocusFP;

	private String assetCoverageFp;

	private String debEqRatioFp;

	private String currentRatioFp;

	private String interestCovRatioFp;

	private String tolTnwFp;

	private String customerConFp;

	private String noOfCheckLastOneFp;

	private String noOfMonthLastSixFp;

	private String riskModelScoreFp;

	private String ageEstaFp;

	private String positiveProfFp;

	private String pastTernOverFp;

	private String positiveNetFp;

	private String turnOverToLoanFp;

	private String grossCashAccuralFp;

	private String minimumCibilFp;

	private String commercialCibilFp;

	private String tenureFp;

	// start new 1-05-2019

	private String cgtmseCoverageFp;

	private String msmeFundingFp;

	private String maxAllowDropInTurnoverFp;

	private String utilisationPercentageFp;

	private String creditSummationFp;

	private String collateralCoverageFp;

	private String conservativeDebtServiceCoverageRatioFp;

	// end new 1-05-2019
	//////////////////

	private String industryFs;

	private String investmentSizeFs;

	private String geoMarketFocusFs;

	private String assetCoverageFs;

	private String debEqRatioFs;

	private String currentRatioFs;

	private String interestCovRatioFs;

	private String tolTnwFs;

	private String customerConFs;

	private String noOfCheckLastOneFs;

	private String noOfMonthLastSixFs;

	private String riskModelScoreFs;

	private String ageEstaFs;

	private String positiveProfFs;

	private String pastTernOverFs;

	private String positiveNetFs;

	private String turnOverToLoanFs;

	private String grossCashAccuralFs;

	private String minimumCibilFs;

	private String commercialCibilFs;

	private String tenureFs;

	// start new 1-05-2019
	private String cgtmseCoverageFs;

	private String msmeFundingFs;

	private String maxAllowDropInTurnoverFs;

	private String utilisationPercentageFs;

	private String creditSummationFs;

	private String collateralCoverageFs;

	private String conservativeDebtServiceCoverageRatioFs;
	// end new 1-05-2019

	///////////

	private Boolean industryFlag;

	private Boolean investmentSizeFlag;

	private Boolean geoMarketFocusFlag;

	private Boolean assetCoverageFlag;

	private Boolean debEqRatioFlag;

	private Boolean currentRatioFlag;

	private Boolean interestCovRatioFlag;

	private Boolean tolTnwFlag;

	private Boolean customerConFlag;

	private Boolean noOfCheckLastOneFlag;

	private Boolean noOfMonthLastSixFlag;

	private Boolean riskModelScoreFlag;

	private Boolean ageEstaFlag;

	private Boolean positiveProfFlag;

	private Boolean pastTernOverFlag;

	private Boolean positiveNetFlag;

	private Boolean turnOverToLoanFlag;

	private Boolean grossCashAccuralFlag;

	private Boolean minimumCibilFlag;

	private Boolean commercialCibilFlag;

	private Boolean tenureFlag;

	// start new 1-05-2019

	private Boolean cgtmseCoverageFlag;

	private Boolean msmeFundingFlag;

	private Boolean maxAllowDropInTurnoverFlag;

	private Boolean utilisationPercentageFlag;

	private Boolean creditSummationFlag;

	private Boolean collateralCoverageFlag;

	private Boolean conservativeDebtServiceCoverageRatioFlag;

	private String userName;

	private String password;
	
	

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

}
