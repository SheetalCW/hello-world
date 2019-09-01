package com.capitaworld.mfi.integration.domain.oneform;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "applicant_details")
public class MFiApplicantDetails extends Auditor {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "application_Id")
	private Long applicationId;

	@Column(name = "is_co_applicant")
	private Boolean isCoApplicant;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "middle_name")
	private String middleName;

	private Integer mobile;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "birth_date")
	private Date birthDate;

	@Column(name = "gender")
	private String gender;

	@Column(name = "marital_status")
	private Integer maritalStatus;

	/** ref of DocumentDetails.cwDocId */
	@Column(name = "address_proof_img_1")
	private Long addressProofImg1;
	
	/** ref of DocumentDetails.cwDocId */
	@Column(name = "address_proof_img_2")
	private Long addressProofImg2;

	/** ref of DocumentDetails.cwDocId */
	@Column(name = "profileImg")
	private Long profileImg;

	@Column(name = "aadhar_pincode")
	private String aadharPincode;

	@Column(name = "aadhar_state")
	private String aadharState;

	@Column(name = "aadhar_district")
	private String aadharDistrict;

	@Column(name = "aadhar_vtc")
	private String aadharVtc;

	@Column(name = "aadhar_house")
	private String aadharHouse;

	@Column(name = "aadhar_landmark")
	private String aadharLandmark;

	@Column(name = "aadhar_location")
	private String aadharLocation;

	@Column(name = "address_proof_type")
	private Integer addressProofType;

	@Column(name = "father_name")
	private String fatherName;

	@Column(name = "mother_name")
	private String motherName;

	@Column(name = "spouse_name")
	private String spouseName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "spouse_birth_date")
	private Date spouseBirthDate;

	@Column(name = "spouse_mobile")
	private String spouseMobile;

	@Column(name = "no_dependent")
	private Integer noDependent;

	@Column(name = "nominee_name")
	private String nomineeName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "nominee_birth_date")
	private Date nomineeBirthDate;

	@Column(name = "relation_with_nominee")
	private String relationWithNominee;

	@Column(name = "nominee_pincode")
	private String nomineePincode;

	@Column(name = "nominee_state")
	private String nomineeState;

	@Column(name = "nominee_city")
	private String nomineeCity;

	@Column(name = "nominee_district")
	private String nomineeDistrict;

	@Column(name = "nominee_location")
	private String nomineeLocation;

	@Column(name = "nominee_house_no")
	private String nomineeHouseNo;

	@Column(name = "nominee_landmark")
	private String nomineeLandmark;

	@Column(name = "religion")
	private String religion;

	@Column(name = "education_qualification")
	private String educationQualification;

	@Column(name = "academic_caste")
	private String academicCaste;

	@Column(name = "is_academic_life_insurance")
	private String isAcademicLifeInsurance;

	@Column(name = "academic_sum_insured")
	private Double academicSumInsured;

	@Column(name = "land_holding")
	private Double landHolding;

	@Column(name = "name_of_firm")
	private String nameOfFirm;

	@Column(name = "business_type")
	private String businessType;

	@Column(name = "house_type")
	private String houseType;

	@Column(name = "loan_amount_required")
	private Double loanAmountRequired;

	@Column(name = "cost_of_equipment")
	private Double costOfEquipment;

	@Column(name = "working_cap_of_equipment")
	private Double workingCapOfEquipment;

	@Column(name = "total_cost_equipment")
	private Double totalCostEquipment;

	@Column(name = "promoter_contribution")
	private Double promoterContribution;

	@Column(name = "loan_required_from_sidbi")
	private Double loanRequiredFromSidbi;

	@Column(name = "repayment_frequency")
	private Integer repaymentFrequency;

	@Column(name = "insurence_required")
	private Boolean insurenceRequired;

	@Column(name = "insurence_company_name")
	private String insurenceCompanyName;

	@Column(name = "insurence_premium")
	private Double insurencePremium;

	@Column(name = "house_ownership")
	private String houseOwnership;

	@Column(name = "area_type")
	private String areaType;

	@Column(name = "business_premises")
	private String businessPremises;

	@Column(name = "exp_in_same_line")
	private Integer expInSameLine;

	@Column(name = "ppi_no_family_member")
	private Integer ppiNoFamilyMember;

	@Column(name = "ppi_acadamic_head_family")
	private String ppiAcadamicHeadFamily;
	@Column(name = "ppi_rafrigerator_in_family")
	private String ppiRafrigeratorInFamily;
	@Column(name = "ppi_stove_in_family")
	private String ppiStoveInFamily;
	@Column(name = "ppi_pressure_cooker_in_family")
	private String ppiPressureCookerInFamily;
	@Column(name = "ppi_tv_in_family")
	private String ppiTvInFamily;
	@Column(name = "ppi_fan_in_family")
	private String ppiFanInFamily;
	@Column(name = "ppi_vehicle_in_family")
	private String ppiVehicleInFamily;
	@Column(name = "ppi_dressing_table_in_family")
	private String ppiDressingTableInFamily;
	@Column(name = "ppi_other_table_in_family")
	private String ppiOtherTableInFamily;

	@Column(name = "loan_type")
	private String loanType;

	@Column(name = "purpose_of_loan")
	private String purposeOfLoan;

	@Column(name = "loan_tenure")
	private String loanTenure;

	@Column(name = "client_type")
	private String clientType;

	@Column(name = "is_business_premise_visited")
	private Boolean isBusinessPremiseVisited;

	@Column(name = "repayment_track")
	private Integer repaymentTrack;

	@Column(name = "creadit_worthiness")
	private Integer creaditWorthiness;

	@Column(name = "loan_liability_ratio")
	private Double loanLiabilityRatio;

	@Column(name = "competition")
	private Integer competition;

	/** ref of DocumentDetails.cwDocId */
	@Column(name = "consent_form_img_1")
	private Long consentFormImg1;
	
	/** ref of DocumentDetails.cwDocId */
	@Column(name = "consent_form_img_2")
	private Long consentFormImg2;

	@Column(name = "loan_amount_recomandation")
	private Double loanAmountRecomandation;

	@Column(name = "tenure_recomandation")
	private Integer tenureRecomandation;

	@Column(name = "moratorium_recomandation")
	private Integer moratoriumRecomandation;

	@Column(name = "interest_rate_recomandation")
	private Double interestRateRecomandation;

	@Column(name = "installment_recomandation")
	private Integer installmentRecomandation;

	/*
	 * private BankDetailsRequest bankDetails; private
	 * CurrentFinancialArrangementsDetailsRequest currFinArrangementsDetails;
	 * private ExpenseExpectedIncomeDetailsRequest expenseExpectedIncomeDetails;
	 * 
	 * private IncomeDetailsRequest incomeDetailsList; private AssetsDetailsRequest
	 * assetsDetailsList;
	 */

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

	public Boolean getIsCoApplicant() {
		return isCoApplicant;
	}

	public void setIsCoApplicant(Boolean isCoApplicant) {
		this.isCoApplicant = isCoApplicant;
	}

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


	public Long getAddressProofImg1() {
		return addressProofImg1;
	}

	public void setAddressProofImg1(Long addressProofImg1) {
		this.addressProofImg1 = addressProofImg1;
	}

	public Long getAddressProofImg2() {
		return addressProofImg2;
	}

	public void setAddressProofImg2(Long addressProofImg2) {
		this.addressProofImg2 = addressProofImg2;
	}

	public Long getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(Long profileImg) {
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


	public Long getConsentFormImg1() {
		return consentFormImg1;
	}

	public void setConsentFormImg1(Long consentFormImg1) {
		this.consentFormImg1 = consentFormImg1;
	}

	public Long getConsentFormImg2() {
		return consentFormImg2;
	}

	public void setConsentFormImg2(Long consentFormImg2) {
		this.consentFormImg2 = consentFormImg2;
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

}