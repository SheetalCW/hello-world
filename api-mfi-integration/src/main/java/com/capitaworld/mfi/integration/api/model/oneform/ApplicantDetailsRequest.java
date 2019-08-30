package com.capitaworld.mfi.integration.api.model.oneform;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicantDetailsRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	private String firstName;

	private String lastName;

	private String middleName;

	private Integer mobile;

	private Date birthDate;

	private String gender;

	private Integer maritalStatus;

	private String addressProofImg;

	private String profileImg;

	private String aadharPincode;

	private String aadharState;

	private String aadharDistrict;

	private String aadharVtc;

	private String aadharHouse;

	private String aadharLandmark;

	private String aadharLocation;

	private Integer addressProofType;

	private String fatherName;

	private String motherName;

	private String spouseName;

	private Date spouseBirthDate;

	private String spouseMobile;

	private Integer noDependent;

	private String nomineeName;

	private Date nomineeBirthDate;

	private String relationWithNominee;

	private String nomineePincode;

	private String nomineeState;

	private String nomineeCity;

	private String nomineeDistrict;

	private String nomineeLocation;

	private String nomineeHouseNo;

	private String nomineeLandmark;

	private String religion;

	private String educationQualification;

	private String academicCaste;

	private String isAcademicLifeInsurance;

	private Double academicSumInsured;

	private Double landHolding;

	private String nameOfFirm;
	
	private String businessType;

	private String houseType;

	private Double loanAmountRequired;

	private Double costOfEquipment;

	private Double workingCapOfEquipment;

	private Double totalCostEquipment;

	private Double promoterContribution;

	private Double loanRequiredFromSidbi;

	private Integer repaymentFrequency;

	private Boolean insurenceRequired;

	private String insurenceCompanyName;

	private Double insurencePremium;

	private String houseOwnership;

	private String areaType;

	private String businessPremises;

	private Integer expInSameLine;

	private Integer ppiNoFamilyMember;
	
	private String ppiAcadamicHeadFamily;
	
	private String ppiRafrigeratorInFamily;
	
	private String ppiStoveInFamily;
	
	private String ppiPressureCookerInFamily;

	private String ppiTvInFamily;
	
	private String ppiFanInFamily;
	
	private String ppiVehicleInFamily;
	
	private String ppiDressingTableInFamily;
	
	private String ppiOtherTableInFamily;
	
	private String loanType;

	private String purposeOfLoan;
	
	private String loanTenure;
	
	private String clientType;
	
	private Boolean isBusinessPremiseVisited;
	
	private Integer repaymentTrack;

	private Integer creaditWorthiness;

	private Double loanLiabilityRatio;
	
	private Integer competition;
	
	private Integer consentFormImg;
	
	
	private Double loanAmountRecomandation;
	
	private Integer tenureRecomandation;
	
	private Integer moratoriumRecomandation;
	
	private Double interestRateRecomandation;
	
	private Integer installmentRecomandation;

	private BankDetailsRequest bankDetails;
	private List<CurrentFinancialArrangementsDetailsRequest> currFinArrangementsDetailList;
	private ExpenseExpectedIncomeDetailsRequest expenseExpectedIncomeDetails;

	private List<IncomeDetailsRequest> incomeDetailsList;
	private List<AssetsDetailsRequest> assetsDetailsList;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(Integer maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getAddressProofImg() {
		return addressProofImg;
	}
	public void setAddressProofImg(String addressProofImg) {
		this.addressProofImg = addressProofImg;
	}
	public String getProfileImg() {
		return profileImg;
	}
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	public String getAadharPincode() {
		return aadharPincode;
	}
	public void setAadharPincode(String aadharPincode) {
		this.aadharPincode = aadharPincode;
	}
	public String getAadharState() {
		return aadharState;
	}
	public void setAadharState(String aadharState) {
		this.aadharState = aadharState;
	}
	public String getAadharDistrict() {
		return aadharDistrict;
	}
	public void setAadharDistrict(String aadharDistrict) {
		this.aadharDistrict = aadharDistrict;
	}
	public String getAadharVtc() {
		return aadharVtc;
	}
	public void setAadharVtc(String aadharVtc) {
		this.aadharVtc = aadharVtc;
	}
	public String getAadharHouse() {
		return aadharHouse;
	}
	public void setAadharHouse(String aadharHouse) {
		this.aadharHouse = aadharHouse;
	}
	public String getAadharLandmark() {
		return aadharLandmark;
	}
	public void setAadharLandmark(String aadharLandmark) {
		this.aadharLandmark = aadharLandmark;
	}
	public String getAadharLocation() {
		return aadharLocation;
	}
	public void setAadharLocation(String aadharLocation) {
		this.aadharLocation = aadharLocation;
	}
	public Integer getAddressProofType() {
		return addressProofType;
	}
	public void setAddressProofType(Integer addressProofType) {
		this.addressProofType = addressProofType;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public Date getSpouseBirthDate() {
		return spouseBirthDate;
	}
	public void setSpouseBirthDate(Date spouseBirthDate) {
		this.spouseBirthDate = spouseBirthDate;
	}
	public String getSpouseMobile() {
		return spouseMobile;
	}
	public void setSpouseMobile(String spouseMobile) {
		this.spouseMobile = spouseMobile;
	}
	public Integer getNoDependent() {
		return noDependent;
	}
	public void setNoDependent(Integer noDependent) {
		this.noDependent = noDependent;
	}
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public Date getNomineeBirthDate() {
		return nomineeBirthDate;
	}
	public void setNomineeBirthDate(Date nomineeBirthDate) {
		this.nomineeBirthDate = nomineeBirthDate;
	}
	public String getRelationWithNominee() {
		return relationWithNominee;
	}
	public void setRelationWithNominee(String relationWithNominee) {
		this.relationWithNominee = relationWithNominee;
	}
	public String getNomineePincode() {
		return nomineePincode;
	}
	public void setNomineePincode(String nomineePincode) {
		this.nomineePincode = nomineePincode;
	}
	public String getNomineeState() {
		return nomineeState;
	}
	public void setNomineeState(String nomineeState) {
		this.nomineeState = nomineeState;
	}
	public String getNomineeCity() {
		return nomineeCity;
	}
	public void setNomineeCity(String nomineeCity) {
		this.nomineeCity = nomineeCity;
	}
	public String getNomineeDistrict() {
		return nomineeDistrict;
	}
	public void setNomineeDistrict(String nomineeDistrict) {
		this.nomineeDistrict = nomineeDistrict;
	}
	public String getNomineeLocation() {
		return nomineeLocation;
	}
	public void setNomineeLocation(String nomineeLocation) {
		this.nomineeLocation = nomineeLocation;
	}
	public String getNomineeHouseNo() {
		return nomineeHouseNo;
	}
	public void setNomineeHouseNo(String nomineeHouseNo) {
		this.nomineeHouseNo = nomineeHouseNo;
	}
	public String getNomineeLandmark() {
		return nomineeLandmark;
	}
	public void setNomineeLandmark(String nomineeLandmark) {
		this.nomineeLandmark = nomineeLandmark;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getEducationQualification() {
		return educationQualification;
	}
	public void setEducationQualification(String educationQualification) {
		this.educationQualification = educationQualification;
	}
	public String getAcademicCaste() {
		return academicCaste;
	}
	public void setAcademicCaste(String academicCaste) {
		this.academicCaste = academicCaste;
	}
	public String getIsAcademicLifeInsurance() {
		return isAcademicLifeInsurance;
	}
	public void setIsAcademicLifeInsurance(String isAcademicLifeInsurance) {
		this.isAcademicLifeInsurance = isAcademicLifeInsurance;
	}
	public Double getAcademicSumInsured() {
		return academicSumInsured;
	}
	public void setAcademicSumInsured(Double academicSumInsured) {
		this.academicSumInsured = academicSumInsured;
	}
	public Double getLandHolding() {
		return landHolding;
	}
	public void setLandHolding(Double landHolding) {
		this.landHolding = landHolding;
	}
	public String getNameOfFirm() {
		return nameOfFirm;
	}
	public void setNameOfFirm(String nameOfFirm) {
		this.nameOfFirm = nameOfFirm;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getHouseType() {
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	public Double getLoanAmountRequired() {
		return loanAmountRequired;
	}
	public void setLoanAmountRequired(Double loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}
	public Double getCostOfEquipment() {
		return costOfEquipment;
	}
	public void setCostOfEquipment(Double costOfEquipment) {
		this.costOfEquipment = costOfEquipment;
	}
	public Double getWorkingCapOfEquipment() {
		return workingCapOfEquipment;
	}
	public void setWorkingCapOfEquipment(Double workingCapOfEquipment) {
		this.workingCapOfEquipment = workingCapOfEquipment;
	}
	public Double getTotalCostEquipment() {
		return totalCostEquipment;
	}
	public void setTotalCostEquipment(Double totalCostEquipment) {
		this.totalCostEquipment = totalCostEquipment;
	}
	public Double getPromoterContribution() {
		return promoterContribution;
	}
	public void setPromoterContribution(Double promoterContribution) {
		this.promoterContribution = promoterContribution;
	}
	public Double getLoanRequiredFromSidbi() {
		return loanRequiredFromSidbi;
	}
	public void setLoanRequiredFromSidbi(Double loanRequiredFromSidbi) {
		this.loanRequiredFromSidbi = loanRequiredFromSidbi;
	}
	public Integer getRepaymentFrequency() {
		return repaymentFrequency;
	}
	public void setRepaymentFrequency(Integer repaymentFrequency) {
		this.repaymentFrequency = repaymentFrequency;
	}
	public Boolean getInsurenceRequired() {
		return insurenceRequired;
	}
	public void setInsurenceRequired(Boolean insurenceRequired) {
		this.insurenceRequired = insurenceRequired;
	}
	public String getInsurenceCompanyName() {
		return insurenceCompanyName;
	}
	public void setInsurenceCompanyName(String insurenceCompanyName) {
		this.insurenceCompanyName = insurenceCompanyName;
	}
	public Double getInsurencePremium() {
		return insurencePremium;
	}
	public void setInsurencePremium(Double insurencePremium) {
		this.insurencePremium = insurencePremium;
	}
	public String getHouseOwnership() {
		return houseOwnership;
	}
	public void setHouseOwnership(String houseOwnership) {
		this.houseOwnership = houseOwnership;
	}
	public String getAreaType() {
		return areaType;
	}
	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}
	public String getBusinessPremises() {
		return businessPremises;
	}
	public void setBusinessPremises(String businessPremises) {
		this.businessPremises = businessPremises;
	}
	public Integer getExpInSameLine() {
		return expInSameLine;
	}
	public void setExpInSameLine(Integer expInSameLine) {
		this.expInSameLine = expInSameLine;
	}
	public Integer getPpiNoFamilyMember() {
		return ppiNoFamilyMember;
	}
	public void setPpiNoFamilyMember(Integer ppiNoFamilyMember) {
		this.ppiNoFamilyMember = ppiNoFamilyMember;
	}
	public String getPpiAcadamicHeadFamily() {
		return ppiAcadamicHeadFamily;
	}
	public void setPpiAcadamicHeadFamily(String ppiAcadamicHeadFamily) {
		this.ppiAcadamicHeadFamily = ppiAcadamicHeadFamily;
	}
	public String getPpiRafrigeratorInFamily() {
		return ppiRafrigeratorInFamily;
	}
	public void setPpiRafrigeratorInFamily(String ppiRafrigeratorInFamily) {
		this.ppiRafrigeratorInFamily = ppiRafrigeratorInFamily;
	}
	public String getPpiStoveInFamily() {
		return ppiStoveInFamily;
	}
	public void setPpiStoveInFamily(String ppiStoveInFamily) {
		this.ppiStoveInFamily = ppiStoveInFamily;
	}
	public String getPpiPressureCookerInFamily() {
		return ppiPressureCookerInFamily;
	}
	public void setPpiPressureCookerInFamily(String ppiPressureCookerInFamily) {
		this.ppiPressureCookerInFamily = ppiPressureCookerInFamily;
	}
	public String getPpiTvInFamily() {
		return ppiTvInFamily;
	}
	public void setPpiTvInFamily(String ppiTvInFamily) {
		this.ppiTvInFamily = ppiTvInFamily;
	}
	public String getPpiFanInFamily() {
		return ppiFanInFamily;
	}
	public void setPpiFanInFamily(String ppiFanInFamily) {
		this.ppiFanInFamily = ppiFanInFamily;
	}
	public String getPpiVehicleInFamily() {
		return ppiVehicleInFamily;
	}
	public void setPpiVehicleInFamily(String ppiVehicleInFamily) {
		this.ppiVehicleInFamily = ppiVehicleInFamily;
	}
	public String getPpiDressingTableInFamily() {
		return ppiDressingTableInFamily;
	}
	public void setPpiDressingTableInFamily(String ppiDressingTableInFamily) {
		this.ppiDressingTableInFamily = ppiDressingTableInFamily;
	}
	public String getPpiOtherTableInFamily() {
		return ppiOtherTableInFamily;
	}
	public void setPpiOtherTableInFamily(String ppiOtherTableInFamily) {
		this.ppiOtherTableInFamily = ppiOtherTableInFamily;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getPurposeOfLoan() {
		return purposeOfLoan;
	}
	public void setPurposeOfLoan(String purposeOfLoan) {
		this.purposeOfLoan = purposeOfLoan;
	}
	public String getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(String loanTenure) {
		this.loanTenure = loanTenure;
	}
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public Boolean getIsBusinessPremiseVisited() {
		return isBusinessPremiseVisited;
	}
	public void setIsBusinessPremiseVisited(Boolean isBusinessPremiseVisited) {
		this.isBusinessPremiseVisited = isBusinessPremiseVisited;
	}
	public Integer getRepaymentTrack() {
		return repaymentTrack;
	}
	public void setRepaymentTrack(Integer repaymentTrack) {
		this.repaymentTrack = repaymentTrack;
	}
	public Integer getCreaditWorthiness() {
		return creaditWorthiness;
	}
	public void setCreaditWorthiness(Integer creaditWorthiness) {
		this.creaditWorthiness = creaditWorthiness;
	}
	public Double getLoanLiabilityRatio() {
		return loanLiabilityRatio;
	}
	public void setLoanLiabilityRatio(Double loanLiabilityRatio) {
		this.loanLiabilityRatio = loanLiabilityRatio;
	}
	public Integer getCompetition() {
		return competition;
	}
	public void setCompetition(Integer competition) {
		this.competition = competition;
	}
	public Integer getConsentFormImg() {
		return consentFormImg;
	}
	public void setConsentFormImg(Integer consentFormImg) {
		this.consentFormImg = consentFormImg;
	}
	public Double getLoanAmountRecomandation() {
		return loanAmountRecomandation;
	}
	public void setLoanAmountRecomandation(Double loanAmountRecomandation) {
		this.loanAmountRecomandation = loanAmountRecomandation;
	}
	public Integer getTenureRecomandation() {
		return tenureRecomandation;
	}
	public void setTenureRecomandation(Integer tenureRecomandation) {
		this.tenureRecomandation = tenureRecomandation;
	}
	public Integer getMoratoriumRecomandation() {
		return moratoriumRecomandation;
	}
	public void setMoratoriumRecomandation(Integer moratoriumRecomandation) {
		this.moratoriumRecomandation = moratoriumRecomandation;
	}
	public Double getInterestRateRecomandation() {
		return interestRateRecomandation;
	}
	public void setInterestRateRecomandation(Double interestRateRecomandation) {
		this.interestRateRecomandation = interestRateRecomandation;
	}
	public Integer getInstallmentRecomandation() {
		return installmentRecomandation;
	}
	public void setInstallmentRecomandation(Integer installmentRecomandation) {
		this.installmentRecomandation = installmentRecomandation;
	}
	public BankDetailsRequest getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetailsRequest bankDetails) {
		this.bankDetails = bankDetails;
	}
	public List<CurrentFinancialArrangementsDetailsRequest> getCurrFinArrangementsDetailList() {
		return currFinArrangementsDetailList;
	}
	public void setCurrFinArrangementsDetailList(
			List<CurrentFinancialArrangementsDetailsRequest> currFinArrangementsDetailList) {
		this.currFinArrangementsDetailList = currFinArrangementsDetailList;
	}
	public ExpenseExpectedIncomeDetailsRequest getExpenseExpectedIncomeDetails() {
		return expenseExpectedIncomeDetails;
	}
	public void setExpenseExpectedIncomeDetails(ExpenseExpectedIncomeDetailsRequest expenseExpectedIncomeDetails) {
		this.expenseExpectedIncomeDetails = expenseExpectedIncomeDetails;
	}
	public List<IncomeDetailsRequest> getIncomeDetailsList() {
		return incomeDetailsList;
	}
	public void setIncomeDetailsList(List<IncomeDetailsRequest> incomeDetailsList) {
		this.incomeDetailsList = incomeDetailsList;
	}
	public List<AssetsDetailsRequest> getAssetsDetailsList() {
		return assetsDetailsList;
	}
	public void setAssetsDetailsList(List<AssetsDetailsRequest> assetsDetailsList) {
		this.assetsDetailsList = assetsDetailsList;
	}
	
	

}