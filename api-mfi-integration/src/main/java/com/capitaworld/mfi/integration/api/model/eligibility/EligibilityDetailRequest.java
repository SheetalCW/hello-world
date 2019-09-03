package com.capitaworld.mfi.integration.api.model.eligibility;

import java.io.Serializable;

import com.capitaworld.api.common.lib.model.common.AuthRequest;

public class EligibilityDetailRequest implements Serializable , AuthRequest  {
	private static final long serialVersionUID = 5196620738025478356L;

	private Long applicationId;

	private Long productId;

	private Double projectedSales;

	private Double workingCapitalGap;

	private Double workingCapitalLimit;

	private Double cashAccruals;

	private Double foir;

	private Double availableCashAccrualsPerYear;

	private Double availableCashAccrualsMonthly;

	private Double yearlyLoanObligation;

	private Double monthlyLoanObligation;

	private Double availableCashAccrualsNewLoan;

	private Double rateOfInterest;

	private Double loanAmt;

	private Integer tenure;

	// for AssesMentEquipment purpose
	private Double existingCashMargin;
	private Double grossFixedAssetsLastestFinancials;
	private Double turnOverAsPerLatestItr;

	//
	private Double turnOverGfaRatio;
	private Double costMachineryEquipmentPurchased;
	private Double incrementalTurnOverLimitComputed;
	private Double incrementalTurnOver;
	private Double incrementalCashMargin;
	private Double incrementalTurnOverLowerOf;

	//

	private Double totalCashMargin;
	private Double fixedIncomeObligations;
	private Double availableCashMargin;
	private Double monthlyCashMargin;
	//
	private Double monthlyLoanObligations;
	private Double availableCashMarginsForNew;

	private Double eligibleLoanAmount;
	private Double proposedLoanAmount;
	private Double loanAmount;
	private Double maxLoanAmountProvidedBank;
	private Double finalLoanAmountNew;
	private Double perLakhEmi;
	// for new Margin Purpose In Equipment Purpose
	private Double margin;

	// FOR NEW REQ. TERM LOAN METHOD THREE---
	private Double dscr;
	private Double payBackPeriod;
	// for nayak committee
	private Double promoterContribution;

	// for Ntb Purpose in eligibility Calculation starts here....
	private Double averageIncomeLastSixMonths;
	private Double averageMonthlyWithDrawal;
	private Double availableIncomeNewLoan;

	private Double averagePerMonthInvestMents;
	private Double monthlyObligation;
	private Double availableIncomeNewLoanMonthly;
	private Double eligibleMonthlyEmi;
	private Double totalEligibleLoanAmount;
	private Double averagePerMonthObligation;
	// Ending Ntb

	// FINAL RESULT FOR NTB STORE THIS VARIABLE
	private Double result;
	private Double emi;

	// for Normal WORKING CAPITAL
	private Double eligibleBankFinance;
	private String subSector;
	// ends Normal Working Capital

	// FOR MPBF FIRST STATRTS HERE PURPOSE
	private Double totalCurrentAssets;
	private Double otherCurrentLiabilities;
	private Double currentRatio;

	// for MPBF FIRST SECOND ENDS HERE...

	// FOR PAYBACK METHOD STARTS HERE---->
	private Double costOfNewMachineryEquipmentPurchased;
	private Double incrementalMarginMentionBorrower;
	private Double capOnCashMarginInvestMent;
	private Double valueOfCashMarginPerAnnum;
	private Double finalIncrementalCashMarginLowerof;
	// STEP 4 ---->
	private Double totalCashFlow;
	private Double availableCashFlow;
	// for hybrid method
	private Double incrementalMarginExistingMargin;

	private Long fpAssessmentId;

	// CIBIL CHANGES
	private Double netWorkingLimit;
	private Double existingLimits;

	private Double topAmount;
	private Double itrSalary;
	private Double oneFormSalary;
	private Double bankStatementSalary;
	private Double itrResult;

	private String loanType;
	// for HYBRID METHOD -----15-10-18--->
	private Double cashMarginPaybackMethod;

	// for hybrid method-----cam 16-10-18
	private Double valueOfCashMarginPaybackPeriod;

	// for kotak bank parameter Testing
	private Double loanAmountTOLAndTNW;
	private Double loanAmountUsingTOLAndTNWFP;

	private Double loanAmountCollateralCoverageFp;
	private Double collateralCovrageFS;
	private Double loanAmountCollateralCoveragefinal;

	// Loan Amount as per Projected Turnover Method
	private Double workingCapitalRequirement;

	// Loan Amount as per TOL/TNW Method
	private Double totalOutsideLiabilities;
	private Double tangibleNetWorth;
	private Double tOLAndTNJ;
	private Double tOLAndTNJMaximumK;
	private Double workingCapitalLimitTOL;
	private Double eligibleBankFinanceTOL;
	private Double existingLimitsTOL;
	private Double netEligibleBankFinanceTOL;

	// Loan Amount as per Collateral Method
	private Double workingCapitalLimitColleteral;
	private Double eligibleBankFinanceColletral;
	private Double neteligibleBankFinanceColletral;
	private Double amountOfColletralFsQ;
	private Double colletralCoverageFpR;

	// Loan Amount as per DSCR Method
	private Double ebidtadscr;
	private Double existingObligationsEMIDSCR;
	private Double dscrz;
	private Double dscrfpaa;
	private Double workingCapitalLimitAB;
	private Double eligibleBankFinanceAD;
	private Double existingLimitsAE;
	private Double netEligibleBankFinanceAF;
	private Double loanAmountLowerOfAH;
	private Double promoterContributionDscr;
	private Double promoterContributionColletral;
	private Double promoterContributionTol;

	// for DISPLAY TEASER AND CAM PROJECTED SALES
	private Double growthCalculatedFromSales;
	private Double growthSetByBank;
	private Double projectedSalesOfPreviousFyear;
	private Double salesOfCurrentFyear;
	private Boolean isHistoric;
	private Boolean isGrowth;
	private Boolean isApril;
	private Double sales2;
	private Double sales3;

	// for EXISTING AND ADDITONAL LOAN
	private Double netEligibleBankFinance;
	private Double existingPlusAdditional;
	private Double fpMaxAdditionalAmount;
	private Double existingAndAdditionalTotalLoanMaxAmount;
	private Double fpMaxTotalAmount;
	private Double cashAccuralsPerMonths;
	private Double bankFinanceBasedOnCashFlowFirstExisting;
	private Double bankFinanceBasedOnCashFlowSecond;
	private Double netEligibleBankFinanceExisting;
	private Double finalTotalLoanAmount;
	private Double lowerOfLAndO;
	private Double lowerOfAmountLNAndO;
	private Double finalValueExistingLoan;
	private Double lowerOfAmountEHAndI;
	private Double lowerOfGAndI;
	private Double existingLoan;
	private Double fsAdditionalLoanAmount;
	private Double fpAdditionalMaxLoanAmount;
	private Double resultCandA;
	private Double resultBandA;
	private Double workingCapitalLimitBasedProjSales;
	private Double bankFinanceBasedCashFlow;
	private Double manufacturing;
	private Double service;
	private Double trading;
	private Integer loanArrangeMentFpSelectionType;
	private Double proposedLoanAmountAdditional;

	// FOR TERM LOAN new
	private Double lowerOfAmountRTAndU;
	private Double availableCashAccuralsperMonth;
	private Double bankFinanceExistingLoan;
	private Double bankFinanceAdditionalLoan;
	private Double netEligibleBankFinanceExistingLoan;
	private Double netEligibleBankFianceAdditionalLoan;
	private Double bankFinanceBasedOnCashFlow;
	private Double availableCashAccrualsPerMonth;
	private Double lowerOfLOAndM;
	private Double finalAdditionalLoanAmount;
	private Double cibilExistingLimit;
	private Double computedIncrementalMarginBasedExistingMargin;
	private Double lowerOfAmountWYAndZ;
	private Double lowerOfWZndX;
	private Double lowerOfVYndW;
	private Double lowerOfAmountVXAndY;
	private Double lowerOfRUndS;
	private Double salesdataDomesticAndExport;
	private Double debtors;
	
	//==Changes on 12/08/19 from rahul meena's changes
	//Nayak Commttee
	private Double maximumTotalLimitSetLender;
	private Double finalExisitingWorkingCapitalLimit;
	//MPBF1
	private Double totalWorkingCapitalLimit;
	private Double additionalLimit;
	private Double proposedLoanAmountFsAdditional;
	private Double existingAndAdditionalLoanMaxAmount;
	private Double eligibleTotalWorkingLimit;
	private Double finalExistingLimit;
	private Double finalAdditionalWorkingCapitalLimit;
	private Double finalTotalWorkingCapitalLimit;
	//(MPBF SECOND)
//	private Double additionalWcLimit;
	private Double finalAdditionalLimit;
	//Historical
	private Double totalWCLimitBasedOnCashFlow;
	//TL - Equipment
	private Double finalAdditionalTermLoanAmount;
	//TL - Payback
	private Double finalTotalTermLoanAmount;
	//TL - Hybrid
	private Double additionalWorkingCapitalLimit; //TODO "additionalWcLimit" is exists
	//TL - Historical
	private Double termLoanBasedOnCashFlow;
	//--
	private String fpAssessmentName;

	private String userName;

	private String password;

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Double getProjectedSales() {
		return projectedSales;
	}

	public void setProjectedSales(Double projectedSales) {
		this.projectedSales = projectedSales;
	}

	public Double getWorkingCapitalGap() {
		return workingCapitalGap;
	}

	public void setWorkingCapitalGap(Double workingCapitalGap) {
		this.workingCapitalGap = workingCapitalGap;
	}

	public Double getWorkingCapitalLimit() {
		return workingCapitalLimit;
	}

	public void setWorkingCapitalLimit(Double workingCapitalLimit) {
		this.workingCapitalLimit = workingCapitalLimit;
	}

	public Double getCashAccruals() {
		return cashAccruals;
	}

	public void setCashAccruals(Double cashAccruals) {
		this.cashAccruals = cashAccruals;
	}

	public Double getFoir() {
		return foir;
	}

	public void setFoir(Double foir) {
		this.foir = foir;
	}

	public Double getAvailableCashAccrualsPerYear() {
		return availableCashAccrualsPerYear;
	}

	public void setAvailableCashAccrualsPerYear(Double availableCashAccrualsPerYear) {
		this.availableCashAccrualsPerYear = availableCashAccrualsPerYear;
	}

	public Double getAvailableCashAccrualsMonthly() {
		return availableCashAccrualsMonthly;
	}

	public void setAvailableCashAccrualsMonthly(Double availableCashAccrualsMonthly) {
		this.availableCashAccrualsMonthly = availableCashAccrualsMonthly;
	}

	public Double getYearlyLoanObligation() {
		return yearlyLoanObligation;
	}

	public void setYearlyLoanObligation(Double yearlyLoanObligation) {
		this.yearlyLoanObligation = yearlyLoanObligation;
	}

	public Double getMonthlyLoanObligation() {
		return monthlyLoanObligation;
	}

	public void setMonthlyLoanObligation(Double monthlyLoanObligation) {
		this.monthlyLoanObligation = monthlyLoanObligation;
	}

	public Double getAvailableCashAccrualsNewLoan() {
		return availableCashAccrualsNewLoan;
	}

	public void setAvailableCashAccrualsNewLoan(Double availableCashAccrualsNewLoan) {
		this.availableCashAccrualsNewLoan = availableCashAccrualsNewLoan;
	}

	public Double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(Double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public Double getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(Double loanAmt) {
		this.loanAmt = loanAmt;
	}

	public Double getEligibleLoanAmount() {
		return eligibleLoanAmount;
	}

	public void setEligibleLoanAmount(Double eligibleLoanAmount) {
		this.eligibleLoanAmount = eligibleLoanAmount;
	}

	public Double getProposedLoanAmount() {
		return proposedLoanAmount;
	}

	public void setProposedLoanAmount(Double proposedLoanAmount) {
		this.proposedLoanAmount = proposedLoanAmount;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Double getMaxLoanAmountProvidedBank() {
		return maxLoanAmountProvidedBank;
	}

	public void setMaxLoanAmountProvidedBank(Double maxLoanAmountProvidedBank) {
		this.maxLoanAmountProvidedBank = maxLoanAmountProvidedBank;
	}

	public Double getFinalLoanAmountNew() {
		return finalLoanAmountNew;
	}

	public void setFinalLoanAmountNew(Double finalLoanAmountNew) {
		this.finalLoanAmountNew = finalLoanAmountNew;
	}

	public Double getPerLakhEmi() {
		return perLakhEmi;
	}

	public void setPerLakhEmi(Double perLakhEmi) {
		this.perLakhEmi = perLakhEmi;
	}

	public Double getMargin() {
		return margin;
	}

	public void setMargin(Double margin) {
		this.margin = margin;
	}

	public Double getExistingCashMargin() {
		return existingCashMargin;
	}

	public void setExistingCashMargin(Double existingCashMargin) {
		this.existingCashMargin = existingCashMargin;
	}

	public Double getGrossFixedAssetsLastestFinancials() {
		return grossFixedAssetsLastestFinancials;
	}

	public void setGrossFixedAssetsLastestFinancials(Double grossFixedAssetsLastestFinancials) {
		this.grossFixedAssetsLastestFinancials = grossFixedAssetsLastestFinancials;
	}

	public Double getTurnOverAsPerLatestItr() {
		return turnOverAsPerLatestItr;
	}

	public void setTurnOverAsPerLatestItr(Double turnOverAsPerLatestItr) {
		this.turnOverAsPerLatestItr = turnOverAsPerLatestItr;
	}

	public Double getTurnOverGfaRatio() {
		return turnOverGfaRatio;
	}

	public void setTurnOverGfaRatio(Double turnOverGfaRatio) {
		this.turnOverGfaRatio = turnOverGfaRatio;
	}

	public Double getCostMachineryEquipmentPurchased() {
		return costMachineryEquipmentPurchased;
	}

	public void setCostMachineryEquipmentPurchased(Double costMachineryEquipmentPurchased) {
		this.costMachineryEquipmentPurchased = costMachineryEquipmentPurchased;
	}

	public Double getIncrementalTurnOverLimitComputed() {
		return incrementalTurnOverLimitComputed;
	}

	public void setIncrementalTurnOverLimitComputed(Double incrementalTurnOverLimitComputed) {
		this.incrementalTurnOverLimitComputed = incrementalTurnOverLimitComputed;
	}

	public Double getIncrementalTurnOver() {
		return incrementalTurnOver;
	}

	public void setIncrementalTurnOver(Double incrementalTurnOver) {
		this.incrementalTurnOver = incrementalTurnOver;
	}

	public Double getIncrementalCashMargin() {
		return incrementalCashMargin;
	}

	public void setIncrementalCashMargin(Double incrementalCashMargin) {
		this.incrementalCashMargin = incrementalCashMargin;
	}

	public Double getIncrementalTurnOverLowerOf() {
		return incrementalTurnOverLowerOf;
	}

	public void setIncrementalTurnOverLowerOf(Double incrementalTurnOverLowerOf) {
		this.incrementalTurnOverLowerOf = incrementalTurnOverLowerOf;
	}

	public Double getTotalCashMargin() {
		return totalCashMargin;
	}

	public void setTotalCashMargin(Double totalCashMargin) {
		this.totalCashMargin = totalCashMargin;
	}

	public Double getFixedIncomeObligations() {
		return fixedIncomeObligations;
	}

	public void setFixedIncomeObligations(Double fixedIncomeObligations) {
		this.fixedIncomeObligations = fixedIncomeObligations;
	}

	public Double getAvailableCashMargin() {
		return availableCashMargin;
	}

	public void setAvailableCashMargin(Double availableCashMargin) {
		this.availableCashMargin = availableCashMargin;
	}

	public Double getMonthlyCashMargin() {
		return monthlyCashMargin;
	}

	public void setMonthlyCashMargin(Double monthlyCashMargin) {
		this.monthlyCashMargin = monthlyCashMargin;
	}

	public Double getMonthlyLoanObligations() {
		return monthlyLoanObligations;
	}

	public void setMonthlyLoanObligations(Double monthlyLoanObligations) {
		this.monthlyLoanObligations = monthlyLoanObligations;
	}

	public Double getAvailableCashMarginsForNew() {
		return availableCashMarginsForNew;
	}

	public void setAvailableCashMarginsForNew(Double availableCashMarginsForNew) {
		this.availableCashMarginsForNew = availableCashMarginsForNew;
	}

	public Double getDscr() {
		return dscr;
	}

	public void setDscr(Double dscr) {
		this.dscr = dscr;
	}

	public Double getPayBackPeriod() {
		return payBackPeriod;
	}

	public void setPayBackPeriod(Double payBackPeriod) {
		this.payBackPeriod = payBackPeriod;
	}

	public Double getPromoterContribution() {
		return promoterContribution;
	}

	public void setPromoterContribution(Double promoterContribution) {
		this.promoterContribution = promoterContribution;
	}

	public Double getAverageIncomeLastSixMonths() {
		return averageIncomeLastSixMonths;
	}

	public void setAverageIncomeLastSixMonths(Double averageIncomeLastSixMonths) {
		this.averageIncomeLastSixMonths = averageIncomeLastSixMonths;
	}

	public Double getAverageMonthlyWithDrawal() {
		return averageMonthlyWithDrawal;
	}

	public void setAverageMonthlyWithDrawal(Double averageMonthlyWithDrawal) {
		this.averageMonthlyWithDrawal = averageMonthlyWithDrawal;
	}

	public Double getAvailableIncomeNewLoan() {
		return availableIncomeNewLoan;
	}

	public void setAvailableIncomeNewLoan(Double availableIncomeNewLoan) {
		this.availableIncomeNewLoan = availableIncomeNewLoan;
	}

	public Double getAveragePerMonthInvestMents() {
		return averagePerMonthInvestMents;
	}

	public void setAveragePerMonthInvestMents(Double averagePerMonthInvestMents) {
		this.averagePerMonthInvestMents = averagePerMonthInvestMents;
	}

	public Double getMonthlyObligation() {
		return monthlyObligation;
	}

	public void setMonthlyObligation(Double monthlyObligation) {
		this.monthlyObligation = monthlyObligation;
	}

	public Double getAvailableIncomeNewLoanMonthly() {
		return availableIncomeNewLoanMonthly;
	}

	public void setAvailableIncomeNewLoanMonthly(Double availableIncomeNewLoanMonthly) {
		this.availableIncomeNewLoanMonthly = availableIncomeNewLoanMonthly;
	}

	public Double getEligibleMonthlyEmi() {
		return eligibleMonthlyEmi;
	}

	public void setEligibleMonthlyEmi(Double eligibleMonthlyEmi) {
		this.eligibleMonthlyEmi = eligibleMonthlyEmi;
	}

	public Double getTotalEligibleLoanAmount() {
		return totalEligibleLoanAmount;
	}

	public void setTotalEligibleLoanAmount(Double totalEligibleLoanAmount) {
		this.totalEligibleLoanAmount = totalEligibleLoanAmount;
	}

	public Double getAveragePerMonthObligation() {
		return averagePerMonthObligation;
	}

	public void setAveragePerMonthObligation(Double averagePerMonthObligation) {
		this.averagePerMonthObligation = averagePerMonthObligation;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	public Double getEmi() {
		return emi;
	}

	public void setEmi(Double emi) {
		this.emi = emi;
	}

	public Double getEligibleBankFinance() {
		return eligibleBankFinance;
	}

	public void setEligibleBankFinance(Double eligibleBankFinance) {
		this.eligibleBankFinance = eligibleBankFinance;
	}

	public String getSubSector() {
		return subSector;
	}

	public void setSubSector(String subSector) {
		this.subSector = subSector;
	}

	public Double getTotalCurrentAssets() {
		return totalCurrentAssets;
	}

	public void setTotalCurrentAssets(Double totalCurrentAssets) {
		this.totalCurrentAssets = totalCurrentAssets;
	}

	public Double getOtherCurrentLiabilities() {
		return otherCurrentLiabilities;
	}

	public void setOtherCurrentLiabilities(Double otherCurrentLiabilities) {
		this.otherCurrentLiabilities = otherCurrentLiabilities;
	}

	public Double getCurrentRatio() {
		return currentRatio;
	}

	public void setCurrentRatio(Double currentRatio) {
		this.currentRatio = currentRatio;
	}

	public Double getCostOfNewMachineryEquipmentPurchased() {
		return costOfNewMachineryEquipmentPurchased;
	}

	public void setCostOfNewMachineryEquipmentPurchased(Double costOfNewMachineryEquipmentPurchased) {
		this.costOfNewMachineryEquipmentPurchased = costOfNewMachineryEquipmentPurchased;
	}

	public Double getIncrementalMarginMentionBorrower() {
		return incrementalMarginMentionBorrower;
	}

	public void setIncrementalMarginMentionBorrower(Double incrementalMarginMentionBorrower) {
		this.incrementalMarginMentionBorrower = incrementalMarginMentionBorrower;
	}

	public Double getCapOnCashMarginInvestMent() {
		return capOnCashMarginInvestMent;
	}

	public void setCapOnCashMarginInvestMent(Double capOnCashMarginInvestMent) {
		this.capOnCashMarginInvestMent = capOnCashMarginInvestMent;
	}

	public Double getValueOfCashMarginPerAnnum() {
		return valueOfCashMarginPerAnnum;
	}

	public void setValueOfCashMarginPerAnnum(Double valueOfCashMarginPerAnnum) {
		this.valueOfCashMarginPerAnnum = valueOfCashMarginPerAnnum;
	}

	public Double getFinalIncrementalCashMarginLowerof() {
		return finalIncrementalCashMarginLowerof;
	}

	public void setFinalIncrementalCashMarginLowerof(Double finalIncrementalCashMarginLowerof) {
		this.finalIncrementalCashMarginLowerof = finalIncrementalCashMarginLowerof;
	}

	public Double getTotalCashFlow() {
		return totalCashFlow;
	}

	public void setTotalCashFlow(Double totalCashFlow) {
		this.totalCashFlow = totalCashFlow;
	}

	public Double getAvailableCashFlow() {
		return availableCashFlow;
	}

	public void setAvailableCashFlow(Double availableCashFlow) {
		this.availableCashFlow = availableCashFlow;
	}

	public Double getIncrementalMarginExistingMargin() {
		return incrementalMarginExistingMargin;
	}

	public void setIncrementalMarginExistingMargin(Double incrementalMarginExistingMargin) {
		this.incrementalMarginExistingMargin = incrementalMarginExistingMargin;
	}

	public Long getFpAssessmentId() {
		return fpAssessmentId;
	}

	public void setFpAssessmentId(Long fpAssessmentId) {
		this.fpAssessmentId = fpAssessmentId;
	}

	public Double getNetWorkingLimit() {
		return netWorkingLimit;
	}

	public void setNetWorkingLimit(Double netWorkingLimit) {
		this.netWorkingLimit = netWorkingLimit;
	}

	public Double getExistingLimits() {
		return existingLimits;
	}

	public void setExistingLimits(Double existingLimits) {
		this.existingLimits = existingLimits;
	}

	public Double getTopAmount() {
		return topAmount;
	}

	public void setTopAmount(Double topAmount) {
		this.topAmount = topAmount;
	}

	public Double getItrSalary() {
		return itrSalary;
	}

	public void setItrSalary(Double itrSalary) {
		this.itrSalary = itrSalary;
	}

	public Double getOneFormSalary() {
		return oneFormSalary;
	}

	public void setOneFormSalary(Double oneFormSalary) {
		this.oneFormSalary = oneFormSalary;
	}

	public Double getBankStatementSalary() {
		return bankStatementSalary;
	}

	public void setBankStatementSalary(Double bankStatementSalary) {
		this.bankStatementSalary = bankStatementSalary;
	}

	public Double getItrResult() {
		return itrResult;
	}

	public void setItrResult(Double itrResult) {
		this.itrResult = itrResult;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Double getCashMarginPaybackMethod() {
		return cashMarginPaybackMethod;
	}

	public void setCashMarginPaybackMethod(Double cashMarginPaybackMethod) {
		this.cashMarginPaybackMethod = cashMarginPaybackMethod;
	}

	public Double getValueOfCashMarginPaybackPeriod() {
		return valueOfCashMarginPaybackPeriod;
	}

	public void setValueOfCashMarginPaybackPeriod(Double valueOfCashMarginPaybackPeriod) {
		this.valueOfCashMarginPaybackPeriod = valueOfCashMarginPaybackPeriod;
	}

	public Double getLoanAmountTOLAndTNW() {
		return loanAmountTOLAndTNW;
	}

	public void setLoanAmountTOLAndTNW(Double loanAmountTOLAndTNW) {
		this.loanAmountTOLAndTNW = loanAmountTOLAndTNW;
	}

	public Double getLoanAmountUsingTOLAndTNWFP() {
		return loanAmountUsingTOLAndTNWFP;
	}

	public void setLoanAmountUsingTOLAndTNWFP(Double loanAmountUsingTOLAndTNWFP) {
		this.loanAmountUsingTOLAndTNWFP = loanAmountUsingTOLAndTNWFP;
	}

	public Double getLoanAmountCollateralCoverageFp() {
		return loanAmountCollateralCoverageFp;
	}

	public void setLoanAmountCollateralCoverageFp(Double loanAmountCollateralCoverageFp) {
		this.loanAmountCollateralCoverageFp = loanAmountCollateralCoverageFp;
	}

	public Double getCollateralCovrageFS() {
		return collateralCovrageFS;
	}

	public void setCollateralCovrageFS(Double collateralCovrageFS) {
		this.collateralCovrageFS = collateralCovrageFS;
	}

	public Double getLoanAmountCollateralCoveragefinal() {
		return loanAmountCollateralCoveragefinal;
	}

	public void setLoanAmountCollateralCoveragefinal(Double loanAmountCollateralCoveragefinal) {
		this.loanAmountCollateralCoveragefinal = loanAmountCollateralCoveragefinal;
	}

	public Double getWorkingCapitalRequirement() {
		return workingCapitalRequirement;
	}

	public void setWorkingCapitalRequirement(Double workingCapitalRequirement) {
		this.workingCapitalRequirement = workingCapitalRequirement;
	}

	public Double getTotalOutsideLiabilities() {
		return totalOutsideLiabilities;
	}

	public void setTotalOutsideLiabilities(Double totalOutsideLiabilities) {
		this.totalOutsideLiabilities = totalOutsideLiabilities;
	}

	public Double getTangibleNetWorth() {
		return tangibleNetWorth;
	}

	public void setTangibleNetWorth(Double tangibleNetWorth) {
		this.tangibleNetWorth = tangibleNetWorth;
	}

	public Double gettOLAndTNJ() {
		return tOLAndTNJ;
	}

	public void settOLAndTNJ(Double tOLAndTNJ) {
		this.tOLAndTNJ = tOLAndTNJ;
	}

	public Double gettOLAndTNJMaximumK() {
		return tOLAndTNJMaximumK;
	}

	public void settOLAndTNJMaximumK(Double tOLAndTNJMaximumK) {
		this.tOLAndTNJMaximumK = tOLAndTNJMaximumK;
	}

	public Double getWorkingCapitalLimitTOL() {
		return workingCapitalLimitTOL;
	}

	public void setWorkingCapitalLimitTOL(Double workingCapitalLimitTOL) {
		this.workingCapitalLimitTOL = workingCapitalLimitTOL;
	}

	public Double getEligibleBankFinanceTOL() {
		return eligibleBankFinanceTOL;
	}

	public void setEligibleBankFinanceTOL(Double eligibleBankFinanceTOL) {
		this.eligibleBankFinanceTOL = eligibleBankFinanceTOL;
	}

	public Double getExistingLimitsTOL() {
		return existingLimitsTOL;
	}

	public void setExistingLimitsTOL(Double existingLimitsTOL) {
		this.existingLimitsTOL = existingLimitsTOL;
	}

	public Double getNetEligibleBankFinanceTOL() {
		return netEligibleBankFinanceTOL;
	}

	public void setNetEligibleBankFinanceTOL(Double netEligibleBankFinanceTOL) {
		this.netEligibleBankFinanceTOL = netEligibleBankFinanceTOL;
	}

	public Double getWorkingCapitalLimitColleteral() {
		return workingCapitalLimitColleteral;
	}

	public void setWorkingCapitalLimitColleteral(Double workingCapitalLimitColleteral) {
		this.workingCapitalLimitColleteral = workingCapitalLimitColleteral;
	}

	public Double getEligibleBankFinanceColletral() {
		return eligibleBankFinanceColletral;
	}

	public void setEligibleBankFinanceColletral(Double eligibleBankFinanceColletral) {
		this.eligibleBankFinanceColletral = eligibleBankFinanceColletral;
	}

	public Double getNeteligibleBankFinanceColletral() {
		return neteligibleBankFinanceColletral;
	}

	public void setNeteligibleBankFinanceColletral(Double neteligibleBankFinanceColletral) {
		this.neteligibleBankFinanceColletral = neteligibleBankFinanceColletral;
	}

	public Double getAmountOfColletralFsQ() {
		return amountOfColletralFsQ;
	}

	public void setAmountOfColletralFsQ(Double amountOfColletralFsQ) {
		this.amountOfColletralFsQ = amountOfColletralFsQ;
	}

	public Double getColletralCoverageFpR() {
		return colletralCoverageFpR;
	}

	public void setColletralCoverageFpR(Double colletralCoverageFpR) {
		this.colletralCoverageFpR = colletralCoverageFpR;
	}

	public Double getEbidtadscr() {
		return ebidtadscr;
	}

	public void setEbidtadscr(Double ebidtadscr) {
		this.ebidtadscr = ebidtadscr;
	}

	public Double getExistingObligationsEMIDSCR() {
		return existingObligationsEMIDSCR;
	}

	public void setExistingObligationsEMIDSCR(Double existingObligationsEMIDSCR) {
		this.existingObligationsEMIDSCR = existingObligationsEMIDSCR;
	}

	public Double getDscrz() {
		return dscrz;
	}

	public void setDscrz(Double dscrz) {
		this.dscrz = dscrz;
	}

	public Double getDscrfpaa() {
		return dscrfpaa;
	}

	public void setDscrfpaa(Double dscrfpaa) {
		this.dscrfpaa = dscrfpaa;
	}

	public Double getWorkingCapitalLimitAB() {
		return workingCapitalLimitAB;
	}

	public void setWorkingCapitalLimitAB(Double workingCapitalLimitAB) {
		this.workingCapitalLimitAB = workingCapitalLimitAB;
	}

	public Double getEligibleBankFinanceAD() {
		return eligibleBankFinanceAD;
	}

	public void setEligibleBankFinanceAD(Double eligibleBankFinanceAD) {
		this.eligibleBankFinanceAD = eligibleBankFinanceAD;
	}

	public Double getExistingLimitsAE() {
		return existingLimitsAE;
	}

	public void setExistingLimitsAE(Double existingLimitsAE) {
		this.existingLimitsAE = existingLimitsAE;
	}

	public Double getNetEligibleBankFinanceAF() {
		return netEligibleBankFinanceAF;
	}

	public void setNetEligibleBankFinanceAF(Double netEligibleBankFinanceAF) {
		this.netEligibleBankFinanceAF = netEligibleBankFinanceAF;
	}

	public Double getLoanAmountLowerOfAH() {
		return loanAmountLowerOfAH;
	}

	public void setLoanAmountLowerOfAH(Double loanAmountLowerOfAH) {
		this.loanAmountLowerOfAH = loanAmountLowerOfAH;
	}

	public Double getPromoterContributionDscr() {
		return promoterContributionDscr;
	}

	public void setPromoterContributionDscr(Double promoterContributionDscr) {
		this.promoterContributionDscr = promoterContributionDscr;
	}

	public Double getPromoterContributionColletral() {
		return promoterContributionColletral;
	}

	public void setPromoterContributionColletral(Double promoterContributionColletral) {
		this.promoterContributionColletral = promoterContributionColletral;
	}

	public Double getPromoterContributionTol() {
		return promoterContributionTol;
	}

	public void setPromoterContributionTol(Double promoterContributionTol) {
		this.promoterContributionTol = promoterContributionTol;
	}

	public Double getGrowthCalculatedFromSales() {
		return growthCalculatedFromSales;
	}

	public void setGrowthCalculatedFromSales(Double growthCalculatedFromSales) {
		this.growthCalculatedFromSales = growthCalculatedFromSales;
	}

	public Double getGrowthSetByBank() {
		return growthSetByBank;
	}

	public void setGrowthSetByBank(Double growthSetByBank) {
		this.growthSetByBank = growthSetByBank;
	}

	public Double getProjectedSalesOfPreviousFyear() {
		return projectedSalesOfPreviousFyear;
	}

	public void setProjectedSalesOfPreviousFyear(Double projectedSalesOfPreviousFyear) {
		this.projectedSalesOfPreviousFyear = projectedSalesOfPreviousFyear;
	}

	public Double getSalesOfCurrentFyear() {
		return salesOfCurrentFyear;
	}

	public void setSalesOfCurrentFyear(Double salesOfCurrentFyear) {
		this.salesOfCurrentFyear = salesOfCurrentFyear;
	}

	public Boolean getIsHistoric() {
		return isHistoric;
	}

	public void setIsHistoric(Boolean isHistoric) {
		this.isHistoric = isHistoric;
	}

	public Boolean getIsGrowth() {
		return isGrowth;
	}

	public void setIsGrowth(Boolean isGrowth) {
		this.isGrowth = isGrowth;
	}

	public Boolean getIsApril() {
		return isApril;
	}

	public void setIsApril(Boolean isApril) {
		this.isApril = isApril;
	}

	public Double getSales2() {
		return sales2;
	}

	public void setSales2(Double sales2) {
		this.sales2 = sales2;
	}

	public Double getSales3() {
		return sales3;
	}

	public void setSales3(Double sales3) {
		this.sales3 = sales3;
	}

	public Double getNetEligibleBankFinance() {
		return netEligibleBankFinance;
	}

	public void setNetEligibleBankFinance(Double netEligibleBankFinance) {
		this.netEligibleBankFinance = netEligibleBankFinance;
	}

	public Double getExistingPlusAdditional() {
		return existingPlusAdditional;
	}

	public void setExistingPlusAdditional(Double existingPlusAdditional) {
		this.existingPlusAdditional = existingPlusAdditional;
	}

	public Double getFpMaxAdditionalAmount() {
		return fpMaxAdditionalAmount;
	}

	public void setFpMaxAdditionalAmount(Double fpMaxAdditionalAmount) {
		this.fpMaxAdditionalAmount = fpMaxAdditionalAmount;
	}

	public Double getExistingAndAdditionalTotalLoanMaxAmount() {
		return existingAndAdditionalTotalLoanMaxAmount;
	}

	public void setExistingAndAdditionalTotalLoanMaxAmount(Double existingAndAdditionalTotalLoanMaxAmount) {
		this.existingAndAdditionalTotalLoanMaxAmount = existingAndAdditionalTotalLoanMaxAmount;
	}

	public Double getFpMaxTotalAmount() {
		return fpMaxTotalAmount;
	}

	public void setFpMaxTotalAmount(Double fpMaxTotalAmount) {
		this.fpMaxTotalAmount = fpMaxTotalAmount;
	}

	public Double getCashAccuralsPerMonths() {
		return cashAccuralsPerMonths;
	}

	public void setCashAccuralsPerMonths(Double cashAccuralsPerMonths) {
		this.cashAccuralsPerMonths = cashAccuralsPerMonths;
	}

	public Double getBankFinanceBasedOnCashFlowFirstExisting() {
		return bankFinanceBasedOnCashFlowFirstExisting;
	}

	public void setBankFinanceBasedOnCashFlowFirstExisting(Double bankFinanceBasedOnCashFlowFirstExisting) {
		this.bankFinanceBasedOnCashFlowFirstExisting = bankFinanceBasedOnCashFlowFirstExisting;
	}

	public Double getBankFinanceBasedOnCashFlowSecond() {
		return bankFinanceBasedOnCashFlowSecond;
	}

	public void setBankFinanceBasedOnCashFlowSecond(Double bankFinanceBasedOnCashFlowSecond) {
		this.bankFinanceBasedOnCashFlowSecond = bankFinanceBasedOnCashFlowSecond;
	}

	public Double getNetEligibleBankFinanceExisting() {
		return netEligibleBankFinanceExisting;
	}

	public void setNetEligibleBankFinanceExisting(Double netEligibleBankFinanceExisting) {
		this.netEligibleBankFinanceExisting = netEligibleBankFinanceExisting;
	}

	public Double getFinalTotalLoanAmount() {
		return finalTotalLoanAmount;
	}

	public void setFinalTotalLoanAmount(Double finalTotalLoanAmount) {
		this.finalTotalLoanAmount = finalTotalLoanAmount;
	}

	public Double getLowerOfLAndO() {
		return lowerOfLAndO;
	}

	public void setLowerOfLAndO(Double lowerOfLAndO) {
		this.lowerOfLAndO = lowerOfLAndO;
	}

	public Double getLowerOfAmountLNAndO() {
		return lowerOfAmountLNAndO;
	}

	public void setLowerOfAmountLNAndO(Double lowerOfAmountLNAndO) {
		this.lowerOfAmountLNAndO = lowerOfAmountLNAndO;
	}

	public Double getFinalValueExistingLoan() {
		return finalValueExistingLoan;
	}

	public void setFinalValueExistingLoan(Double finalValueExistingLoan) {
		this.finalValueExistingLoan = finalValueExistingLoan;
	}

	public Double getLowerOfAmountEHAndI() {
		return lowerOfAmountEHAndI;
	}

	public void setLowerOfAmountEHAndI(Double lowerOfAmountEHAndI) {
		this.lowerOfAmountEHAndI = lowerOfAmountEHAndI;
	}

	public Double getLowerOfGAndI() {
		return lowerOfGAndI;
	}

	public void setLowerOfGAndI(Double lowerOfGAndI) {
		this.lowerOfGAndI = lowerOfGAndI;
	}

	public Double getExistingLoan() {
		return existingLoan;
	}

	public void setExistingLoan(Double existingLoan) {
		this.existingLoan = existingLoan;
	}

	public Double getFsAdditionalLoanAmount() {
		return fsAdditionalLoanAmount;
	}

	public void setFsAdditionalLoanAmount(Double fsAdditionalLoanAmount) {
		this.fsAdditionalLoanAmount = fsAdditionalLoanAmount;
	}

	public Double getFpAdditionalMaxLoanAmount() {
		return fpAdditionalMaxLoanAmount;
	}

	public void setFpAdditionalMaxLoanAmount(Double fpAdditionalMaxLoanAmount) {
		this.fpAdditionalMaxLoanAmount = fpAdditionalMaxLoanAmount;
	}

	public Double getResultCandA() {
		return resultCandA;
	}

	public void setResultCandA(Double resultCandA) {
		this.resultCandA = resultCandA;
	}

	public Double getResultBandA() {
		return resultBandA;
	}

	public void setResultBandA(Double resultBandA) {
		this.resultBandA = resultBandA;
	}

	public Double getWorkingCapitalLimitBasedProjSales() {
		return workingCapitalLimitBasedProjSales;
	}

	public void setWorkingCapitalLimitBasedProjSales(Double workingCapitalLimitBasedProjSales) {
		this.workingCapitalLimitBasedProjSales = workingCapitalLimitBasedProjSales;
	}

	public Double getBankFinanceBasedCashFlow() {
		return bankFinanceBasedCashFlow;
	}

	public void setBankFinanceBasedCashFlow(Double bankFinanceBasedCashFlow) {
		this.bankFinanceBasedCashFlow = bankFinanceBasedCashFlow;
	}

	public Double getManufacturing() {
		return manufacturing;
	}

	public void setManufacturing(Double manufacturing) {
		this.manufacturing = manufacturing;
	}

	public Double getService() {
		return service;
	}

	public void setService(Double service) {
		this.service = service;
	}

	public Double getTrading() {
		return trading;
	}

	public void setTrading(Double trading) {
		this.trading = trading;
	}

	public Integer getLoanArrangeMentFpSelectionType() {
		return loanArrangeMentFpSelectionType;
	}

	public void setLoanArrangeMentFpSelectionType(Integer loanArrangeMentFpSelectionType) {
		this.loanArrangeMentFpSelectionType = loanArrangeMentFpSelectionType;
	}

	public Double getProposedLoanAmountAdditional() {
		return proposedLoanAmountAdditional;
	}

	public void setProposedLoanAmountAdditional(Double proposedLoanAmountAdditional) {
		this.proposedLoanAmountAdditional = proposedLoanAmountAdditional;
	}

	public Double getLowerOfAmountRTAndU() {
		return lowerOfAmountRTAndU;
	}

	public void setLowerOfAmountRTAndU(Double lowerOfAmountRTAndU) {
		this.lowerOfAmountRTAndU = lowerOfAmountRTAndU;
	}

	public Double getAvailableCashAccuralsperMonth() {
		return availableCashAccuralsperMonth;
	}

	public void setAvailableCashAccuralsperMonth(Double availableCashAccuralsperMonth) {
		this.availableCashAccuralsperMonth = availableCashAccuralsperMonth;
	}

	public Double getBankFinanceExistingLoan() {
		return bankFinanceExistingLoan;
	}

	public void setBankFinanceExistingLoan(Double bankFinanceExistingLoan) {
		this.bankFinanceExistingLoan = bankFinanceExistingLoan;
	}

	public Double getBankFinanceAdditionalLoan() {
		return bankFinanceAdditionalLoan;
	}

	public void setBankFinanceAdditionalLoan(Double bankFinanceAdditionalLoan) {
		this.bankFinanceAdditionalLoan = bankFinanceAdditionalLoan;
	}

	public Double getNetEligibleBankFinanceExistingLoan() {
		return netEligibleBankFinanceExistingLoan;
	}

	public void setNetEligibleBankFinanceExistingLoan(Double netEligibleBankFinanceExistingLoan) {
		this.netEligibleBankFinanceExistingLoan = netEligibleBankFinanceExistingLoan;
	}

	public Double getNetEligibleBankFianceAdditionalLoan() {
		return netEligibleBankFianceAdditionalLoan;
	}

	public void setNetEligibleBankFianceAdditionalLoan(Double netEligibleBankFianceAdditionalLoan) {
		this.netEligibleBankFianceAdditionalLoan = netEligibleBankFianceAdditionalLoan;
	}

	public Double getBankFinanceBasedOnCashFlow() {
		return bankFinanceBasedOnCashFlow;
	}

	public void setBankFinanceBasedOnCashFlow(Double bankFinanceBasedOnCashFlow) {
		this.bankFinanceBasedOnCashFlow = bankFinanceBasedOnCashFlow;
	}

	public Double getAvailableCashAccrualsPerMonth() {
		return availableCashAccrualsPerMonth;
	}

	public void setAvailableCashAccrualsPerMonth(Double availableCashAccrualsPerMonth) {
		this.availableCashAccrualsPerMonth = availableCashAccrualsPerMonth;
	}

	public Double getLowerOfLOAndM() {
		return lowerOfLOAndM;
	}

	public void setLowerOfLOAndM(Double lowerOfLOAndM) {
		this.lowerOfLOAndM = lowerOfLOAndM;
	}

	public Double getFinalAdditionalLoanAmount() {
		return finalAdditionalLoanAmount;
	}

	public void setFinalAdditionalLoanAmount(Double finalAdditionalLoanAmount) {
		this.finalAdditionalLoanAmount = finalAdditionalLoanAmount;
	}

	public Double getCibilExistingLimit() {
		return cibilExistingLimit;
	}

	public void setCibilExistingLimit(Double cibilExistingLimit) {
		this.cibilExistingLimit = cibilExistingLimit;
	}

	public Double getComputedIncrementalMarginBasedExistingMargin() {
		return computedIncrementalMarginBasedExistingMargin;
	}

	public void setComputedIncrementalMarginBasedExistingMargin(Double computedIncrementalMarginBasedExistingMargin) {
		this.computedIncrementalMarginBasedExistingMargin = computedIncrementalMarginBasedExistingMargin;
	}

	public Double getLowerOfAmountWYAndZ() {
		return lowerOfAmountWYAndZ;
	}

	public void setLowerOfAmountWYAndZ(Double lowerOfAmountWYAndZ) {
		this.lowerOfAmountWYAndZ = lowerOfAmountWYAndZ;
	}

	public Double getLowerOfWZndX() {
		return lowerOfWZndX;
	}

	public void setLowerOfWZndX(Double lowerOfWZndX) {
		this.lowerOfWZndX = lowerOfWZndX;
	}

	public Double getLowerOfVYndW() {
		return lowerOfVYndW;
	}

	public void setLowerOfVYndW(Double lowerOfVYndW) {
		this.lowerOfVYndW = lowerOfVYndW;
	}

	public Double getLowerOfAmountVXAndY() {
		return lowerOfAmountVXAndY;
	}

	public void setLowerOfAmountVXAndY(Double lowerOfAmountVXAndY) {
		this.lowerOfAmountVXAndY = lowerOfAmountVXAndY;
	}

	public Double getLowerOfRUndS() {
		return lowerOfRUndS;
	}

	public void setLowerOfRUndS(Double lowerOfRUndS) {
		this.lowerOfRUndS = lowerOfRUndS;
	}

	public Double getSalesdataDomesticAndExport() {
		return salesdataDomesticAndExport;
	}

	public void setSalesdataDomesticAndExport(Double salesdataDomesticAndExport) {
		this.salesdataDomesticAndExport = salesdataDomesticAndExport;
	}

	public Double getDebtors() {
		return debtors;
	}

	public void setDebtors(Double debtors) {
		this.debtors = debtors;
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

	//On changes on 12/08/2019 for updates on rahul meena
	public Double getMaximumTotalLimitSetLender() {
		return maximumTotalLimitSetLender;
	}

	public void setMaximumTotalLimitSetLender(Double maximumTotalLimitSetLender) {
		this.maximumTotalLimitSetLender = maximumTotalLimitSetLender;
	}

	public Double getFinalExisitingWorkingCapitalLimit() {
		return finalExisitingWorkingCapitalLimit;
	}

	public void setFinalExisitingWorkingCapitalLimit(Double finalExisitingWorkingCapitalLimit) {
		this.finalExisitingWorkingCapitalLimit = finalExisitingWorkingCapitalLimit;
	}

	public Double getTotalWorkingCapitalLimit() {
		return totalWorkingCapitalLimit;
	}

	public void setTotalWorkingCapitalLimit(Double totalWorkingCapitalLimit) {
		this.totalWorkingCapitalLimit = totalWorkingCapitalLimit;
	}

	public Double getAdditionalLimit() {
		return additionalLimit;
	}

	public void setAdditionalLimit(Double additionalLimit) {
		this.additionalLimit = additionalLimit;
	}

	public Double getProposedLoanAmountFsAdditional() {
		return proposedLoanAmountFsAdditional;
	}

	public void setProposedLoanAmountFsAdditional(Double proposedLoanAmountFsAdditional) {
		this.proposedLoanAmountFsAdditional = proposedLoanAmountFsAdditional;
	}

	public Double getExistingAndAdditionalLoanMaxAmount() {
		return existingAndAdditionalLoanMaxAmount;
	}

	public void setExistingAndAdditionalLoanMaxAmount(Double existingAndAdditionalLoanMaxAmount) {
		this.existingAndAdditionalLoanMaxAmount = existingAndAdditionalLoanMaxAmount;
	}

	public Double getEligibleTotalWorkingLimit() {
		return eligibleTotalWorkingLimit;
	}

	public void setEligibleTotalWorkingLimit(Double eligibleTotalWorkingLimit) {
		this.eligibleTotalWorkingLimit = eligibleTotalWorkingLimit;
	}

	public Double getFinalExistingLimit() {
		return finalExistingLimit;
	}

	public void setFinalExistingLimit(Double finalExistingLimit) {
		this.finalExistingLimit = finalExistingLimit;
	}

	public Double getFinalAdditionalWorkingCapitalLimit() {
		return finalAdditionalWorkingCapitalLimit;
	}

	public void setFinalAdditionalWorkingCapitalLimit(Double finalAdditionalWorkingCapitalLimit) {
		this.finalAdditionalWorkingCapitalLimit = finalAdditionalWorkingCapitalLimit;
	}

	public Double getFinalTotalWorkingCapitalLimit() {
		return finalTotalWorkingCapitalLimit;
	}

	public void setFinalTotalWorkingCapitalLimit(Double finalTotalWorkingCapitalLimit) {
		this.finalTotalWorkingCapitalLimit = finalTotalWorkingCapitalLimit;
	}

	public Double getFinalAdditionalLimit() {
		return finalAdditionalLimit;
	}

	public void setFinalAdditionalLimit(Double finalAdditionalLimit) {
		this.finalAdditionalLimit = finalAdditionalLimit;
	}

	public Double getTotalWCLimitBasedOnCashFlow() {
		return totalWCLimitBasedOnCashFlow;
	}

	public void setTotalWCLimitBasedOnCashFlow(Double totalWCLimitBasedOnCashFlow) {
		this.totalWCLimitBasedOnCashFlow = totalWCLimitBasedOnCashFlow;
	}

	public Double getFinalAdditionalTermLoanAmount() {
		return finalAdditionalTermLoanAmount;
	}

	public void setFinalAdditionalTermLoanAmount(Double finalAdditionalTermLoanAmount) {
		this.finalAdditionalTermLoanAmount = finalAdditionalTermLoanAmount;
	}

	public Double getFinalTotalTermLoanAmount() {
		return finalTotalTermLoanAmount;
	}

	public void setFinalTotalTermLoanAmount(Double finalTotalTermLoanAmount) {
		this.finalTotalTermLoanAmount = finalTotalTermLoanAmount;
	}

	public Double getAdditionalWorkingCapitalLimit() {
		return additionalWorkingCapitalLimit;
	}

	public void setAdditionalWorkingCapitalLimit(Double additionalWorkingCapitalLimit) {
		this.additionalWorkingCapitalLimit = additionalWorkingCapitalLimit;
	}

	public Double getTermLoanBasedOnCashFlow() {
		return termLoanBasedOnCashFlow;
	}

	public void setTermLoanBasedOnCashFlow(Double termLoanBasedOnCashFlow) {
		this.termLoanBasedOnCashFlow = termLoanBasedOnCashFlow;
	}

	public String getFpAssessmentName() {
		return fpAssessmentName;
	}

	public void setFpAssessmentName(String fpAssessmentName) {
		this.fpAssessmentName = fpAssessmentName;
	}

	
}
