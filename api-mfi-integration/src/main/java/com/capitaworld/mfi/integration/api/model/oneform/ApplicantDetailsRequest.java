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
	private String maritalStatus;
	private String addressProofImg;
	private String profileImg;
	private String aadharPincode;
	private String aadharState;
	private String aadharDistrict;
	private String aadharVtc;
	private String aadharHouse;
	private String aadharLocation;
	private String aadharLandmark;
	private Integer addressProofType;
	private String fatherName;
	private String motherName;
	private String spouseName;
	private Date spouseBirthDate;
	private String spouseMobile;
	private Integer noDependent;
	private String nomineeName;
	private Integer relationWithNomineeId;
	private Date nomineeBirthDate;
	private String nomineePincode;
	private String nomineeState;
	private String nomineeDistrict;
	private String nomineeCity;
	private String nomineeHouseNo;
	private String nomineeLocation;
	private String nomineeLandmark;
	private Integer educationQualification;
	private Integer religion;
	private Integer academicCaste;
	private Integer isAcademicLifeInsurance;
	private Double academicSumInsured;
	private Double landHolding;
	private Integer areaType;
	private Integer houseType;
	private Integer houseOwnership;
	private String nameOfFirm;
	private Integer businessType;
	private Integer businessPremises;
	private Integer expInSameLine;
	private Boolean isBusinessPremiseVisited;
	private Integer ppiNoFamilyMember;
	private Integer ppiAcadamicHeadFamily;
	private Integer ppiRafrigeratorInFamily;
	private Integer ppiStoveInFamily;
	private Integer ppiPressureCookerInFamily;
	private Integer ppiTvInFamily;
	private Integer ppiFanInFamily;
	private Integer ppiDressingTableInFamily;
	private Integer ppiOtherTableInFamily;
	private Integer ppiVehicleInFamily;
	private Integer loanType;
	private Integer purposeOfLoan;
	private Double loanAmountRequired;
	private Integer loanTenure;
	private Double costOfEquipment;
	private Double workingCapOfEquipment;
	private Double promoterContribution;
	private Double loanRequiredFromSidbi;
	private Integer repaymentFrequency;
	private Boolean insurenceRequired;
	private String insurenceCompanyName;
	private Double insurencePremium;
	private Integer clientType;
	private Integer repaymentTrack;
	private Integer competition;
	private String consentFormImg;
	private Integer creaditWorthiness;
	private Double loanLiabilityRatio;
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

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
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

	public String getAadharLocation() {
		return aadharLocation;
	}

	public void setAadharLocation(String aadharLocation) {
		this.aadharLocation = aadharLocation;
	}

	public String getAadharLandmark() {
		return aadharLandmark;
	}

	public void setAadharLandmark(String aadharLandmark) {
		this.aadharLandmark = aadharLandmark;
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

	public Integer getRelationWithNomineeId() {
		return relationWithNomineeId;
	}

	public void setRelationWithNomineeId(Integer relationWithNomineeId) {
		this.relationWithNomineeId = relationWithNomineeId;
	}

	public Date getNomineeBirthDate() {
		return nomineeBirthDate;
	}

	public void setNomineeBirthDate(Date nomineeBirthDate) {
		this.nomineeBirthDate = nomineeBirthDate;
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

	public String getNomineeDistrict() {
		return nomineeDistrict;
	}

	public void setNomineeDistrict(String nomineeDistrict) {
		this.nomineeDistrict = nomineeDistrict;
	}

	public String getNomineeCity() {
		return nomineeCity;
	}

	public void setNomineeCity(String nomineeCity) {
		this.nomineeCity = nomineeCity;
	}

	public String getNomineeHouseNo() {
		return nomineeHouseNo;
	}

	public void setNomineeHouseNo(String nomineeHouseNo) {
		this.nomineeHouseNo = nomineeHouseNo;
	}

	public String getNomineeLocation() {
		return nomineeLocation;
	}

	public void setNomineeLocation(String nomineeLocation) {
		this.nomineeLocation = nomineeLocation;
	}

	public String getNomineeLandmark() {
		return nomineeLandmark;
	}

	public void setNomineeLandmark(String nomineeLandmark) {
		this.nomineeLandmark = nomineeLandmark;
	}

	public Integer getEducationQualification() {
		return educationQualification;
	}

	public void setEducationQualification(Integer educationQualification) {
		this.educationQualification = educationQualification;
	}

	public Integer getReligion() {
		return religion;
	}

	public void setReligion(Integer religion) {
		this.religion = religion;
	}

	public Integer getAcademicCaste() {
		return academicCaste;
	}

	public void setAcademicCaste(Integer academicCaste) {
		this.academicCaste = academicCaste;
	}

	public Integer getIsAcademicLifeInsurance() {
		return isAcademicLifeInsurance;
	}

	public void setIsAcademicLifeInsurance(Integer isAcademicLifeInsurance) {
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

	public Integer getAreaType() {
		return areaType;
	}

	public void setAreaType(Integer areaType) {
		this.areaType = areaType;
	}

	public Integer getHouseType() {
		return houseType;
	}

	public void setHouseType(Integer houseType) {
		this.houseType = houseType;
	}

	public Integer getHouseOwnership() {
		return houseOwnership;
	}

	public void setHouseOwnership(Integer houseOwnership) {
		this.houseOwnership = houseOwnership;
	}

	public String getNameOfFirm() {
		return nameOfFirm;
	}

	public void setNameOfFirm(String nameOfFirm) {
		this.nameOfFirm = nameOfFirm;
	}

	public Integer getBusinessType() {
		return businessType;
	}

	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
	}

	public Integer getBusinessPremises() {
		return businessPremises;
	}

	public void setBusinessPremises(Integer businessPremises) {
		this.businessPremises = businessPremises;
	}

	public Integer getExpInSameLine() {
		return expInSameLine;
	}

	public void setExpInSameLine(Integer expInSameLine) {
		this.expInSameLine = expInSameLine;
	}

	public Boolean getIsBusinessPremiseVisited() {
		return isBusinessPremiseVisited;
	}

	public void setIsBusinessPremiseVisited(Boolean isBusinessPremiseVisited) {
		this.isBusinessPremiseVisited = isBusinessPremiseVisited;
	}

	public Integer getPpiNoFamilyMember() {
		return ppiNoFamilyMember;
	}

	public void setPpiNoFamilyMember(Integer ppiNoFamilyMember) {
		this.ppiNoFamilyMember = ppiNoFamilyMember;
	}

	public Integer getPpiAcadamicHeadFamily() {
		return ppiAcadamicHeadFamily;
	}

	public void setPpiAcadamicHeadFamily(Integer ppiAcadamicHeadFamily) {
		this.ppiAcadamicHeadFamily = ppiAcadamicHeadFamily;
	}

	public Integer getPpiRafrigeratorInFamily() {
		return ppiRafrigeratorInFamily;
	}

	public void setPpiRafrigeratorInFamily(Integer ppiRafrigeratorInFamily) {
		this.ppiRafrigeratorInFamily = ppiRafrigeratorInFamily;
	}

	public Integer getPpiStoveInFamily() {
		return ppiStoveInFamily;
	}

	public void setPpiStoveInFamily(Integer ppiStoveInFamily) {
		this.ppiStoveInFamily = ppiStoveInFamily;
	}

	public Integer getPpiPressureCookerInFamily() {
		return ppiPressureCookerInFamily;
	}

	public void setPpiPressureCookerInFamily(Integer ppiPressureCookerInFamily) {
		this.ppiPressureCookerInFamily = ppiPressureCookerInFamily;
	}

	public Integer getPpiTvInFamily() {
		return ppiTvInFamily;
	}

	public void setPpiTvInFamily(Integer ppiTvInFamily) {
		this.ppiTvInFamily = ppiTvInFamily;
	}

	public Integer getPpiFanInFamily() {
		return ppiFanInFamily;
	}

	public void setPpiFanInFamily(Integer ppiFanInFamily) {
		this.ppiFanInFamily = ppiFanInFamily;
	}

	public Integer getPpiDressingTableInFamily() {
		return ppiDressingTableInFamily;
	}

	public void setPpiDressingTableInFamily(Integer ppiDressingTableInFamily) {
		this.ppiDressingTableInFamily = ppiDressingTableInFamily;
	}

	public Integer getPpiOtherTableInFamily() {
		return ppiOtherTableInFamily;
	}

	public void setPpiOtherTableInFamily(Integer ppiOtherTableInFamily) {
		this.ppiOtherTableInFamily = ppiOtherTableInFamily;
	}

	public Integer getPpiVehicleInFamily() {
		return ppiVehicleInFamily;
	}

	public void setPpiVehicleInFamily(Integer ppiVehicleInFamily) {
		this.ppiVehicleInFamily = ppiVehicleInFamily;
	}

	public Integer getLoanType() {
		return loanType;
	}

	public void setLoanType(Integer loanType) {
		this.loanType = loanType;
	}

	public Integer getPurposeOfLoan() {
		return purposeOfLoan;
	}

	public void setPurposeOfLoan(Integer purposeOfLoan) {
		this.purposeOfLoan = purposeOfLoan;
	}

	public Double getLoanAmountRequired() {
		return loanAmountRequired;
	}

	public void setLoanAmountRequired(Double loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}

	public Integer getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(Integer loanTenure) {
		this.loanTenure = loanTenure;
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

	public Integer getClientType() {
		return clientType;
	}

	public void setClientType(Integer clientType) {
		this.clientType = clientType;
	}

	public Integer getRepaymentTrack() {
		return repaymentTrack;
	}

	public void setRepaymentTrack(Integer repaymentTrack) {
		this.repaymentTrack = repaymentTrack;
	}

	public Integer getCompetition() {
		return competition;
	}

	public void setCompetition(Integer competition) {
		this.competition = competition;
	}

	public String getConsentFormImg() {
		return consentFormImg;
	}

	public void setConsentFormImg(String consentFormImg) {
		this.consentFormImg = consentFormImg;
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
