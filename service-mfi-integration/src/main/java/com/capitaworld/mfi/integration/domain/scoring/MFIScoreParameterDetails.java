package com.capitaworld.mfi.integration.domain.scoring;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.capitaworld.mfi.integration.domain.common.Auditor;

@Entity
@Table(name = "sco_par_det")
@NamedQuery(name = "ScoreParameterDetails.findAll", query = "SELECT sd FROM ScoreParameterDetails sd")
public class MFIScoreParameterDetails extends Auditor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7138938444754599775L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "sco_par_det_seq")
	@Column(name = "id")
	private Long id;

	@Column(name = "application_id")
	private Long applicationId;
	@Column(name = "fp_product_id")
	private Long fpProductId;
	@Column(name = "scoring_model_id")
	private Long scoringModelId;

	//////////

	@Column(name = "combined_networth_text")
	private String combinedNetworth_text;
	@Column(name = "cust_associate_concern_text")
	private String customerAssociateConcern_text;
	@Column(name = "cibil_transunion_scr_txt")
	private String cibilTransunionScore_text;
	@Column(name = "debt_equity_ratio_text")
	private String debtEquityRatio_text;
	@Column(name = "tol_tnw_text")
	private String tolTnw_text;
	@Column(name = "avg_cur_ratio_txt")
	private String avgCurruntRatio_text;
	@Column(name = "wc_cycle_text")
	private String workingCapitalCycle_text;
	@Column(name = "avg_growth_gross_cash_txt")
	private String avgAnnualGrowthGrossCash_text;
	@Column(name = "avg_growth_net_sale_txt")
	private String avgAnnualGrowthNetSale_text;
	@Column(name = "avg_ebidta_text")
	private String avgEbidta_text;
	@Column(name = "avg_cash_accurals_txt")
	private String avgAnnualGrossCashAccurals_text;
	@Column(name = "avg_int_cov_ratio_txt")
	private String avgInterestCovRatio_text;
	@Column(name = "no_of_customer_text")
	private String noOfCustomer_text;
	@Column(name = "concentration_cust_txt")
	private String concentrationCustomer_text;
	@Column(name = "experience_in_business_text")
	private String experienceInBusiness_text;
	@Column(name = "credit_summation_text")
	private String creditSummation_text;

	@Column(name = "age_text")
	public String age_text;
	@Column(name = "no_children_text")
	public String noOfChildren_text;
	@Column(name = "owning_house_text")
	public String owningHouse_text;
	@Column(name = "academic_quali_text")
	public String academicQUalification_text;
	@Column(name = "experience_line_text")
	public String experienceInTheLineOfTrade_text;
	@Column(name = "spouse_details_text")
	public String spouseDetails_text;
	@Column(name = "assessed_income_text")
	public String assessedForIncomeTax_text;
	@Column(name = "have_life_inc_policy_text")
	public String haveLifeInsurancePolicy_text;
	@Column(name = "years_in_business_text")
	public String yearsInBusiness_text;
	@Column(name = "repayment_period_text")
	public String repaymentPeriod_text;
	@Column(name = "continuous_net_profit_text")
	public String continuousNetProfit_text;
	@Column(name = "quality_receivables_text")
	public String qualityOfReceivables_text;
	@Column(name = "quality_finished_text")
	public String qualityOfFinishedGoodsInventory_text;
	@Column(name = "know_how_text")
	public String knowHow_text;
	@Column(name = "line_activity_text")
	public String lineOfActivity_text;
	@Column(name = "competition_text")
	public String competition_text;
	@Column(name = "factory_premises_text")
	public String factoryPremises_text;
	@Column(name = "sales_show_text")
	public String salesShowARisingTrend_text;

	///////////////////

	// Descrition Code

	@Column(name = "combined_networth_code")
	private String combinedNetworth_code;
	@Column(name = "cust_associate_concern_code")
	private String customerAssociateConcern_code;
	@Column(name = "cibil_transunion_scr_code")
	private String cibilTransunionScore_code;
	@Column(name = "debt_equity_ratio_code")
	private String debtEquityRatio_code;
	@Column(name = "tol_tnw_code")
	private String tolTnw_code;
	@Column(name = "avg_cur_ratio_code")
	private String avgCurruntRatio_code;
	@Column(name = "wc_cycle_code")
	private String workingCapitalCycle_code;
	@Column(name = "avg_growth_gross_cash_code")
	private String avgAnnualGrowthGrossCash_code;
	@Column(name = "avg_growth_net_sale_code")
	private String avgAnnualGrowthNetSale_code;
	@Column(name = "avg_ebidta_code")
	private String avgEbidta_code;
	@Column(name = "avg_cash_accurals_code")
	private String avgAnnualGrossCashAccurals_code;
	@Column(name = "avg_int_cov_ratio_code")
	private String avgInterestCovRatio_code;
	@Column(name = "no_of_customer_code")
	private String noOfCustomer_code;
	@Column(name = "concentration_cust_code")
	private String concentrationCustomer_code;
	@Column(name = "experience_in_business_code")
	private String experienceInBusiness_code;
	@Column(name = "credit_summation_code")
	private String creditSummation_code;

	@Column(name = "age_code")
	public String age_code;
	@Column(name = "no_children_code")
	public String noOfChildren_code;
	@Column(name = "owning_house_code")
	public String owningHouse_code;
	@Column(name = "academic_quali_code")
	public String academicQUalification_code;
	@Column(name = "experience_line_code")
	public String experienceInTheLineOfTrade_code;
	@Column(name = "spouse_details_code")
	public String spouseDetails_code;
	@Column(name = "assessed_income_code")
	public String assessedForIncomeTax_code;
	@Column(name = "have_life_inc_policy_code")
	public String haveLifeInsurancePolicy_code;
	@Column(name = "years_in_business_code")
	public String yearsInBusiness_code;
	@Column(name = "repayment_period_code")
	public String repaymentPeriod_code;
	@Column(name = "continuous_net_profit_code")
	public String continuousNetProfit_code;
	@Column(name = "quality_receivables_code")
	public String qualityOfReceivables_code;
	@Column(name = "quality_finished_code")
	public String qualityOfFinishedGoodsInventory_code;
	@Column(name = "know_how_code")
	public String knowHow_code;
	@Column(name = "line_activity_code")
	public String lineOfActivity_code;
	@Column(name = "competition_code")
	public String competition_code;
	@Column(name = "factory_premises_code")
	public String factoryPremises_code;
	@Column(name = "sales_show_code")
	public String salesShowARisingTrend_code;

	// End

	///////////

	@Column(name = "com_networth_obtained_scr")
	private Double combinedNetworth_obtained_score;
	@Column(name = "cust_ass_obtained_scr")
	private Double customerAssociateConcern_obtained_score;
	@Column(name = "cibil_trn_scr")
	private Double cibilTransunionScore_obtained_score;
	@Column(name = "debt_eq_ratio_scr")
	private Double debtEquityRatio_obtained_score;
	@Column(name = "tol_tnw_obtained_score")
	private Double tolTnw_obtained_score;
	@Column(name = "avg_cur_ratio_scr")
	private Double avgCurruntRatio_obtained_score;
	@Column(name = "wc_cycle_obtained_scr")
	private Double workingCapitalCycle_obtained_score;
	@Column(name = "gross_cash_obt_scr")
	private Double avgAnnualGrowthGrossCash_obtained_score;
	@Column(name = "net_sale_obt_scr")
	private Double avgAnnualGrowthNetSale_obtained_score;
	@Column(name = "avg_ebidta_obtained_score")
	private Double avgEbidta_obtained_score;
	@Column(name = "cash_accurals_obt_scr")
	private Double avgAnnualGrossCashAccurals_obtained_score;
	@Column(name = "avg_intr_ratio_obt_scr")
	private Double avgInterestCovRatio_obtained_score;
	@Column(name = "no_of_cust_obt_scr")
	private Double noOfCustomer_obtained_score;
	@Column(name = "concentration_cust_obt_scr")
	private Double concentrationCustomer_obtained_score;
	@Column(name = "experience_bus_obt_scr")
	private Double experienceInBusiness_obtained_score;
	@Column(name = "credit_summation_obt_scr")
	private Double creditSummation_obtained_score;

	@Column(name = "age_obt_scr")
	public Double age_obtained_score;
	@Column(name = "no_of_child_obt_scr")
	public Double noOfChildren_obtained_score;
	@Column(name = "owning_house_obt_scr")
	public Double owningHouse_obtained_score;
	@Column(name = "academic_qua_obt_scr")
	public Double academicQUalification_obtained_score;
	@Column(name = "exp_in_busi_obt_scr")
	public Double experienceInTheLineOfTrade_obtained_score;
	@Column(name = "spouse_detail_obt_scr")
	public Double spouseDetails_obtained_score;
	@Column(name = "assessed_income_obt_scr")
	public Double assessedForIncomeTax_obtained_score;
	@Column(name = "have_life_ins_obt_scr")
	public Double haveLifeInsurancePolicy_obtained_score;
	@Column(name = "years_in_bus_obt_scr")
	public Double yearsInBusiness_obtained_score;
	@Column(name = "repayment_per_obt_scr")
	public Double repaymentPeriod_obtained_score;
	@Column(name = "continuous_prof_obt_scr")
	public Double continuousNetProfit_obtained_score;
	@Column(name = "quality_receivable_obt_scr")
	public Double qualityOfReceivables_obtained_score;
	@Column(name = "quality_finished_obt_scr")
	public Double qualityOfFinishedGoodsInventory_obtained_score;
	@Column(name = "know_how_obt_scr")
	public Double knowHow_obtained_score;
	@Column(name = "line_activity_obt_scr")
	public Double lineOfActivity_obtained_score;
	@Column(name = "competition_obt_scr")
	public Double competition_obtained_score;
	@Column(name = "factory_premi_obt_scr")
	public Double factoryPremises_obtained_score;
	@Column(name = "sales_show_obt_scr")
	public Double salesShowARisingTrend_obtained_score;

	//////////////

	@Column(name = "com_networth_max_scr")
	private Double combinedNetworth_max_score;
	@Column(name = "cust_ass_concern_max_scr")
	private Double customerAssociateConcern_max_score;
	@Column(name = "cibil_tran_scr_max_scr")
	private Double cibilTransunionScore_max_score;
	@Column(name = "debt_equity_ratio_max_score")
	private Double debtEquityRatio_max_score;
	@Column(name = "tol_tnw_max_score")
	private Double tolTnw_max_score;
	@Column(name = "avg_currunt_ratio_max_score")
	private Double avgCurruntRatio_max_score;
	@Column(name = "wc_cycle_max_scr")
	private Double workingCapitalCycle_max_score;
	@Column(name = "avg_ann_growth_grs_scr")
	private Double avgAnnualGrowthGrossCash_max_score;
	@Column(name = "avg_ann_net_sale_scr")
	private Double avgAnnualGrowthNetSale_max_score;
	@Column(name = "avg_ebidta_max_score")
	private Double avgEbidta_max_score;
	@Column(name = "grs_cash_accurals_scr")
	private Double avgAnnualGrossCashAccurals_max_score;
	@Column(name = "avg_intr_cov_ratio_scr")
	private Double avgInterestCovRatio_max_score;
	@Column(name = "no_of_customer_max_score")
	private Double noOfCustomer_max_score;
	@Column(name = "concentration_cust_scr")
	private Double concentrationCustomer_max_score;
	@Column(name = "expr_in_bus_max_scr")
	private Double experienceInBusiness_max_score;
	@Column(name = "credit_summation_max_score")
	private Double creditSummation_max_score;

	@Column(name = "age_max_scr")
	public Double age_max_score;
	@Column(name = "no_child_max_scr")
	public Double noOfChildren_max_score;
	@Column(name = "owning_house_max_scr")
	public Double owningHouse_max_score;
	@Column(name = "academic_quali_max_scr")
	public Double academicQUalification_max_score;
	@Column(name = "exp_line_max_scr")
	public Double experienceInTheLineOfTrade_max_score;
	@Column(name = "souse_det_max_scr")
	public Double spouseDetails_max_score;
	@Column(name = "assessed_income_max_scr")
	public Double assessedForIncomeTax_max_score;
	@Column(name = "have_life_poli_max_scr")
	public Double haveLifeInsurancePolicy_max_score;
	@Column(name = "years_in_bus_max_scr")
	public Double yearsInBusiness_max_score;
	@Column(name = "repayment_per_max_scr")
	public Double repaymentPeriod_max_score;
	@Column(name = "continuos_profi_max_scr")
	public Double continuousNetProfit_max_score;
	@Column(name = "quality_rece_max_scr")
	public Double qualityOfReceivables_max_score;
	@Column(name = "quality_finished_max_scr")
	public Double qualityOfFinishedGoodsInventory_max_score;
	@Column(name = "know__how_max_scr")
	public Double knowHow_max_score;
	@Column(name = "line_activity_max_scr")
	public Double lineOfActivity_max_score;
	@Column(name = "competition_max_scr")
	public Double competition_max_score;
	@Column(name = "factory_prem_max_scr")
	public Double factoryPremises_max_score;
	@Column(name = "sale_rising_max_scr")
	public Double salesShowARisingTrend_max_score;

	/////////////

	@Column(name = "mang_score_with_risk_wg")
	private Double managementScoreWithRiskWeight;
	@Column(name = "fin_score_with_risk_wg")
	private Double financialScoreWithRiskWeight;
	@Column(name = "bus_score_with_risk_wg")
	private Double businessScoreWithRiskWeight;

	@Column(name = "management_risk_weight")
	private Double managementRiskWeight;
	@Column(name = "financial_risk_weight")
	private Double financialRiskWeight;
	@Column(name = "business_risk_weight")
	private Double businessRiskWeight;

	@Column(name = "man_risk_obt_scr")
	private Double managementRiskObtainScore;
	@Column(name = "fin_risk_obt_scr")
	private Double financialRiskObtainScore;
	@Column(name = "bus_risk_obt_scr")
	private Double businessRiskObtainScore;

	@Column(name = "total_score")
	private Double totalScore;
	@Column(name = "interpretation")
	private String interpretation;

	// new 3-05-2019
	@Column(name = "past_year_turn_over_text")
	private String pastYearTurnOver_text;

	@Column(name = "past_tear_turn_over_code")
	private String pastYearTurnOver_code;

	@Column(name = "past_year_turn_over_obt_scr")
	private Double pastYearTurnOver_obtained_score;

	@Column(name = "past_year_turn_over_max_scr")
	private Double pastYearTurnOver_max_score;
	
	@Column(name = "debt_EBITAD_text")
	private String debt_EBITAD_text;

	@Column(name = "debt_EBITAD_code")
	private String debt_EBITAD_code;

	@Column(name = "debt_EBITAD_obtained_score")
	private Double debt_EBITAD_obtained_score;

	@Column(name = "debt_EBITAD_max_score")
	private Double debt_EBITAD_max_score;
	@Column(name = "turnover_ATNW_text")
	private String turnover_ATNW_text;

	@Column(name = "turnover_ATNW_code")
	private String turnover_ATNW_code;

	@Column(name = "turnover_ATNW_obtained_score")
	private Double turnover_ATNW_obtained_score;

	@Column(name = "turnover_ATNW_max_score")
	private Double turnover_ATNW_max_score;
	@Column(name = "no_of_cheques_bounced_text")
	private String no_of_cheques_bounced_text;

	@Column(name = "no_of_cheques_bounced_code")
	private String no_of_cheques_bounced_code;

	@Column(name = "no_of_cheques_bounced_obtd_scr")
	private Double no_of_cheques_bounced_obtained_score;

	@Column(name = "no_of_cheques_bounced_max_scr")
	private Double no_of_cheques_bounced_max_score;
	
	@Column(name = "no_cheq_bounc_last_six_mon_txt")
	private String no_of_cheques_bounced_last_six_month_text;

	@Column(name = "no_cheq_bounc_last_six_mon_cod")
	private String no_of_cheques_bounced_last_six_month_code;

	@Column(name = "no_chq_bnc_lst_six_mon_obt_scr")
	private Double no_of_cheques_bounced_last_six_month_obtained_score;

	@Column(name = "no_chq_bnc_lst_six_mon_max_scr")
	private Double no_of_cheques_bounced_last_six_month_max_score;

	@Column(name = "collateral_coverage_text")
	private String collateral_coverage_text;

	@Column(name = "collateral_coverage_code")
	private String collateral_coverage_code;

	@Column(name = "collateral_coverage_score")
	private Double collateral_coverage_score;

	@Column(name = "collateral_coverage_max_score")
	private Double collateral_coverage_max_score;

	@Column(name = "debt_service_coverag_ratio_txt")
	private String debt_service_coverage_ratio_text;

	@Column(name = "debt_service_coverag_ratio_cod")
	private String debt_service_coverage_ratio_code;

	@Column(name = "debt_service_coverag_ratio_scr")
	private Double debt_service_coverage_ratio_score;

	@Column(name = "debt_servc_covrg_ratio_max_scr")
	private Double debt_service_coverage_ratio_max_score;

	@Column(name = "utilisation_percentage_text")
	private String utilisation_percentage_text;

	@Column(name = "utilisation_percentage_code")
	private String utilisation_percentage_code;

	@Column(name = "utilisation_percentage_score")
	private Double utilisation_percentage_score;

	@Column(name = "utilisation_percentage_max_scr")
	private Double utilisation_percentage_max_score;

	@Column(name = "turnovr_to_limit_ratio_text")
	private String turnover_to_limit_ratio_text;

	@Column(name = "turnovr_to_limit_ratio_code")
	private String turnover_to_limit_ratio_code;

	@Column(name = "turnovr_to_limit_ratio_score")
	private Double turnover_to_limit_ratio_score;

	@Column(name = "turnovr_to_limit_ratio_max_scr")
	private Double turnover_to_limit_ratio_max_score;

	public String getYearsInBusiness_text() {
		return yearsInBusiness_text;
	}

	public void setYearsInBusiness_text(String yearsInBusiness_text) {
		this.yearsInBusiness_text = yearsInBusiness_text;
	}

	public Double getYearsInBusiness_obtained_score() {
		return yearsInBusiness_obtained_score;
	}

	public void setYearsInBusiness_obtained_score(Double yearsInBusiness_obtained_score) {
		this.yearsInBusiness_obtained_score = yearsInBusiness_obtained_score;
	}

	public Double getYearsInBusiness_max_score() {
		return yearsInBusiness_max_score;
	}

	public void setYearsInBusiness_max_score(Double yearsInBusiness_max_score) {
		this.yearsInBusiness_max_score = yearsInBusiness_max_score;
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

	public Long getFpProductId() {
		return fpProductId;
	}

	public void setFpProductId(Long fpProductId) {
		this.fpProductId = fpProductId;
	}

	public Long getScoringModelId() {
		return scoringModelId;
	}

	public void setScoringModelId(Long scoringModelId) {
		this.scoringModelId = scoringModelId;
	}

	public String getCombinedNetworth_text() {
		return combinedNetworth_text;
	}

	public void setCombinedNetworth_text(String combinedNetworth_text) {
		this.combinedNetworth_text = combinedNetworth_text;
	}

	public String getCustomerAssociateConcern_text() {
		return customerAssociateConcern_text;
	}

	public void setCustomerAssociateConcern_text(String customerAssociateConcern_text) {
		this.customerAssociateConcern_text = customerAssociateConcern_text;
	}

	public String getCibilTransunionScore_text() {
		return cibilTransunionScore_text;
	}

	public void setCibilTransunionScore_text(String cibilTransunionScore_text) {
		this.cibilTransunionScore_text = cibilTransunionScore_text;
	}

	public String getDebtEquityRatio_text() {
		return debtEquityRatio_text;
	}

	public void setDebtEquityRatio_text(String debtEquityRatio_text) {
		this.debtEquityRatio_text = debtEquityRatio_text;
	}

	public String getTolTnw_text() {
		return tolTnw_text;
	}

	public void setTolTnw_text(String tolTnw_text) {
		this.tolTnw_text = tolTnw_text;
	}

	public String getAvgCurruntRatio_text() {
		return avgCurruntRatio_text;
	}

	public void setAvgCurruntRatio_text(String avgCurruntRatio_text) {
		this.avgCurruntRatio_text = avgCurruntRatio_text;
	}

	public String getWorkingCapitalCycle_text() {
		return workingCapitalCycle_text;
	}

	public void setWorkingCapitalCycle_text(String workingCapitalCycle_text) {
		this.workingCapitalCycle_text = workingCapitalCycle_text;
	}

	public String getAvgAnnualGrowthGrossCash_text() {
		return avgAnnualGrowthGrossCash_text;
	}

	public void setAvgAnnualGrowthGrossCash_text(String avgAnnualGrowthGrossCash_text) {
		this.avgAnnualGrowthGrossCash_text = avgAnnualGrowthGrossCash_text;
	}

	public String getAvgAnnualGrowthNetSale_text() {
		return avgAnnualGrowthNetSale_text;
	}

	public void setAvgAnnualGrowthNetSale_text(String avgAnnualGrowthNetSale_text) {
		this.avgAnnualGrowthNetSale_text = avgAnnualGrowthNetSale_text;
	}

	public String getAvgEbidta_text() {
		return avgEbidta_text;
	}

	public void setAvgEbidta_text(String avgEbidta_text) {
		this.avgEbidta_text = avgEbidta_text;
	}

	public String getAvgAnnualGrossCashAccurals_text() {
		return avgAnnualGrossCashAccurals_text;
	}

	public void setAvgAnnualGrossCashAccurals_text(String avgAnnualGrossCashAccurals_text) {
		this.avgAnnualGrossCashAccurals_text = avgAnnualGrossCashAccurals_text;
	}

	public String getAvgInterestCovRatio_text() {
		return avgInterestCovRatio_text;
	}

	public void setAvgInterestCovRatio_text(String avgInterestCovRatio_text) {
		this.avgInterestCovRatio_text = avgInterestCovRatio_text;
	}

	public String getNoOfCustomer_text() {
		return noOfCustomer_text;
	}

	public void setNoOfCustomer_text(String noOfCustomer_text) {
		this.noOfCustomer_text = noOfCustomer_text;
	}

	public String getConcentrationCustomer_text() {
		return concentrationCustomer_text;
	}

	public void setConcentrationCustomer_text(String concentrationCustomer_text) {
		this.concentrationCustomer_text = concentrationCustomer_text;
	}

	public String getExperienceInBusiness_text() {
		return experienceInBusiness_text;
	}

	public void setExperienceInBusiness_text(String experienceInBusiness_text) {
		this.experienceInBusiness_text = experienceInBusiness_text;
	}

	public String getCreditSummation_text() {
		return creditSummation_text;
	}

	public void setCreditSummation_text(String creditSummation_text) {
		this.creditSummation_text = creditSummation_text;
	}

	public Double getCombinedNetworth_obtained_score() {
		return combinedNetworth_obtained_score;
	}

	public void setCombinedNetworth_obtained_score(Double combinedNetworth_obtained_score) {
		this.combinedNetworth_obtained_score = combinedNetworth_obtained_score;
	}

	public Double getCustomerAssociateConcern_obtained_score() {
		return customerAssociateConcern_obtained_score;
	}

	public void setCustomerAssociateConcern_obtained_score(Double customerAssociateConcern_obtained_score) {
		this.customerAssociateConcern_obtained_score = customerAssociateConcern_obtained_score;
	}

	public Double getCibilTransunionScore_obtained_score() {
		return cibilTransunionScore_obtained_score;
	}

	public void setCibilTransunionScore_obtained_score(Double cibilTransunionScore_obtained_score) {
		this.cibilTransunionScore_obtained_score = cibilTransunionScore_obtained_score;
	}

	public Double getDebtEquityRatio_obtained_score() {
		return debtEquityRatio_obtained_score;
	}

	public void setDebtEquityRatio_obtained_score(Double debtEquityRatio_obtained_score) {
		this.debtEquityRatio_obtained_score = debtEquityRatio_obtained_score;
	}

	public Double getTolTnw_obtained_score() {
		return tolTnw_obtained_score;
	}

	public void setTolTnw_obtained_score(Double tolTnw_obtained_score) {
		this.tolTnw_obtained_score = tolTnw_obtained_score;
	}

	public Double getAvgCurruntRatio_obtained_score() {
		return avgCurruntRatio_obtained_score;
	}

	public void setAvgCurruntRatio_obtained_score(Double avgCurruntRatio_obtained_score) {
		this.avgCurruntRatio_obtained_score = avgCurruntRatio_obtained_score;
	}

	public Double getWorkingCapitalCycle_obtained_score() {
		return workingCapitalCycle_obtained_score;
	}

	public void setWorkingCapitalCycle_obtained_score(Double workingCapitalCycle_obtained_score) {
		this.workingCapitalCycle_obtained_score = workingCapitalCycle_obtained_score;
	}

	public Double getAvgAnnualGrowthGrossCash_obtained_score() {
		return avgAnnualGrowthGrossCash_obtained_score;
	}

	public void setAvgAnnualGrowthGrossCash_obtained_score(Double avgAnnualGrowthGrossCash_obtained_score) {
		this.avgAnnualGrowthGrossCash_obtained_score = avgAnnualGrowthGrossCash_obtained_score;
	}

	public Double getAvgAnnualGrowthNetSale_obtained_score() {
		return avgAnnualGrowthNetSale_obtained_score;
	}

	public void setAvgAnnualGrowthNetSale_obtained_score(Double avgAnnualGrowthNetSale_obtained_score) {
		this.avgAnnualGrowthNetSale_obtained_score = avgAnnualGrowthNetSale_obtained_score;
	}

	public Double getAvgEbidta_obtained_score() {
		return avgEbidta_obtained_score;
	}

	public void setAvgEbidta_obtained_score(Double avgEbidta_obtained_score) {
		this.avgEbidta_obtained_score = avgEbidta_obtained_score;
	}

	public Double getAvgAnnualGrossCashAccurals_obtained_score() {
		return avgAnnualGrossCashAccurals_obtained_score;
	}

	public void setAvgAnnualGrossCashAccurals_obtained_score(Double avgAnnualGrossCashAccurals_obtained_score) {
		this.avgAnnualGrossCashAccurals_obtained_score = avgAnnualGrossCashAccurals_obtained_score;
	}

	public Double getAvgInterestCovRatio_obtained_score() {
		return avgInterestCovRatio_obtained_score;
	}

	public void setAvgInterestCovRatio_obtained_score(Double avgInterestCovRatio_obtained_score) {
		this.avgInterestCovRatio_obtained_score = avgInterestCovRatio_obtained_score;
	}

	public Double getNoOfCustomer_obtained_score() {
		return noOfCustomer_obtained_score;
	}

	public void setNoOfCustomer_obtained_score(Double noOfCustomer_obtained_score) {
		this.noOfCustomer_obtained_score = noOfCustomer_obtained_score;
	}

	public Double getConcentrationCustomer_obtained_score() {
		return concentrationCustomer_obtained_score;
	}

	public void setConcentrationCustomer_obtained_score(Double concentrationCustomer_obtained_score) {
		this.concentrationCustomer_obtained_score = concentrationCustomer_obtained_score;
	}

	public Double getExperienceInBusiness_obtained_score() {
		return experienceInBusiness_obtained_score;
	}

	public void setExperienceInBusiness_obtained_score(Double experienceInBusiness_obtained_score) {
		this.experienceInBusiness_obtained_score = experienceInBusiness_obtained_score;
	}

	public Double getCreditSummation_obtained_score() {
		return creditSummation_obtained_score;
	}

	public void setCreditSummation_obtained_score(Double creditSummation_obtained_score) {
		this.creditSummation_obtained_score = creditSummation_obtained_score;
	}

	public Double getCombinedNetworth_max_score() {
		return combinedNetworth_max_score;
	}

	public void setCombinedNetworth_max_score(Double combinedNetworth_max_score) {
		this.combinedNetworth_max_score = combinedNetworth_max_score;
	}

	public Double getCustomerAssociateConcern_max_score() {
		return customerAssociateConcern_max_score;
	}

	public void setCustomerAssociateConcern_max_score(Double customerAssociateConcern_max_score) {
		this.customerAssociateConcern_max_score = customerAssociateConcern_max_score;
	}

	public Double getCibilTransunionScore_max_score() {
		return cibilTransunionScore_max_score;
	}

	public void setCibilTransunionScore_max_score(Double cibilTransunionScore_max_score) {
		this.cibilTransunionScore_max_score = cibilTransunionScore_max_score;
	}

	public Double getDebtEquityRatio_max_score() {
		return debtEquityRatio_max_score;
	}

	public void setDebtEquityRatio_max_score(Double debtEquityRatio_max_score) {
		this.debtEquityRatio_max_score = debtEquityRatio_max_score;
	}

	public Double getTolTnw_max_score() {
		return tolTnw_max_score;
	}

	public void setTolTnw_max_score(Double tolTnw_max_score) {
		this.tolTnw_max_score = tolTnw_max_score;
	}

	public Double getAvgCurruntRatio_max_score() {
		return avgCurruntRatio_max_score;
	}

	public void setAvgCurruntRatio_max_score(Double avgCurruntRatio_max_score) {
		this.avgCurruntRatio_max_score = avgCurruntRatio_max_score;
	}

	public Double getWorkingCapitalCycle_max_score() {
		return workingCapitalCycle_max_score;
	}

	public void setWorkingCapitalCycle_max_score(Double workingCapitalCycle_max_score) {
		this.workingCapitalCycle_max_score = workingCapitalCycle_max_score;
	}

	public Double getAvgAnnualGrowthGrossCash_max_score() {
		return avgAnnualGrowthGrossCash_max_score;
	}

	public void setAvgAnnualGrowthGrossCash_max_score(Double avgAnnualGrowthGrossCash_max_score) {
		this.avgAnnualGrowthGrossCash_max_score = avgAnnualGrowthGrossCash_max_score;
	}

	public Double getAvgAnnualGrowthNetSale_max_score() {
		return avgAnnualGrowthNetSale_max_score;
	}

	public void setAvgAnnualGrowthNetSale_max_score(Double avgAnnualGrowthNetSale_max_score) {
		this.avgAnnualGrowthNetSale_max_score = avgAnnualGrowthNetSale_max_score;
	}

	public Double getAvgEbidta_max_score() {
		return avgEbidta_max_score;
	}

	public void setAvgEbidta_max_score(Double avgEbidta_max_score) {
		this.avgEbidta_max_score = avgEbidta_max_score;
	}

	public Double getAvgAnnualGrossCashAccurals_max_score() {
		return avgAnnualGrossCashAccurals_max_score;
	}

	public void setAvgAnnualGrossCashAccurals_max_score(Double avgAnnualGrossCashAccurals_max_score) {
		this.avgAnnualGrossCashAccurals_max_score = avgAnnualGrossCashAccurals_max_score;
	}

	public Double getAvgInterestCovRatio_max_score() {
		return avgInterestCovRatio_max_score;
	}

	public void setAvgInterestCovRatio_max_score(Double avgInterestCovRatio_max_score) {
		this.avgInterestCovRatio_max_score = avgInterestCovRatio_max_score;
	}

	public Double getNoOfCustomer_max_score() {
		return noOfCustomer_max_score;
	}

	public void setNoOfCustomer_max_score(Double noOfCustomer_max_score) {
		this.noOfCustomer_max_score = noOfCustomer_max_score;
	}

	public Double getConcentrationCustomer_max_score() {
		return concentrationCustomer_max_score;
	}

	public void setConcentrationCustomer_max_score(Double concentrationCustomer_max_score) {
		this.concentrationCustomer_max_score = concentrationCustomer_max_score;
	}

	public Double getExperienceInBusiness_max_score() {
		return experienceInBusiness_max_score;
	}

	public void setExperienceInBusiness_max_score(Double experienceInBusiness_max_score) {
		this.experienceInBusiness_max_score = experienceInBusiness_max_score;
	}

	public Double getCreditSummation_max_score() {
		return creditSummation_max_score;
	}

	public void setCreditSummation_max_score(Double creditSummation_max_score) {
		this.creditSummation_max_score = creditSummation_max_score;
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

	public Double getManagementRiskObtainScore() {
		return managementRiskObtainScore;
	}

	public void setManagementRiskObtainScore(Double managementRiskObtainScore) {
		this.managementRiskObtainScore = managementRiskObtainScore;
	}

	public Double getFinancialRiskObtainScore() {
		return financialRiskObtainScore;
	}

	public void setFinancialRiskObtainScore(Double financialRiskObtainScore) {
		this.financialRiskObtainScore = financialRiskObtainScore;
	}

	public Double getBusinessRiskObtainScore() {
		return businessRiskObtainScore;
	}

	public void setBusinessRiskObtainScore(Double businessRiskObtainScore) {
		this.businessRiskObtainScore = businessRiskObtainScore;
	}

	public Double getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Double totalScore) {
		this.totalScore = totalScore;
	}

	public String getInterpretation() {
		return interpretation;
	}

	public void setInterpretation(String interpretation) {
		this.interpretation = interpretation;
	}

	public String getAge_text() {
		return age_text;
	}

	public void setAge_text(String age_text) {
		this.age_text = age_text;
	}

	public String getNoOfChildren_text() {
		return noOfChildren_text;
	}

	public void setNoOfChildren_text(String noOfChildren_text) {
		this.noOfChildren_text = noOfChildren_text;
	}

	public String getOwningHouse_text() {
		return owningHouse_text;
	}

	public void setOwningHouse_text(String owningHouse_text) {
		this.owningHouse_text = owningHouse_text;
	}

	public String getAcademicQUalification_text() {
		return academicQUalification_text;
	}

	public void setAcademicQUalification_text(String academicQUalification_text) {
		this.academicQUalification_text = academicQUalification_text;
	}

	public String getExperienceInTheLineOfTrade_text() {
		return experienceInTheLineOfTrade_text;
	}

	public void setExperienceInTheLineOfTrade_text(String experienceInTheLineOfTrade_text) {
		this.experienceInTheLineOfTrade_text = experienceInTheLineOfTrade_text;
	}

	public String getSpouseDetails_text() {
		return spouseDetails_text;
	}

	public void setSpouseDetails_text(String spouseDetails_text) {
		this.spouseDetails_text = spouseDetails_text;
	}

	public String getAssessedForIncomeTax_text() {
		return assessedForIncomeTax_text;
	}

	public void setAssessedForIncomeTax_text(String assessedForIncomeTax_text) {
		this.assessedForIncomeTax_text = assessedForIncomeTax_text;
	}

	public String getHaveLifeInsurancePolicy_text() {
		return haveLifeInsurancePolicy_text;
	}

	public void setHaveLifeInsurancePolicy_text(String haveLifeInsurancePolicy_text) {
		this.haveLifeInsurancePolicy_text = haveLifeInsurancePolicy_text;
	}

	public String getRepaymentPeriod_text() {
		return repaymentPeriod_text;
	}

	public void setRepaymentPeriod_text(String repaymentPeriod_text) {
		this.repaymentPeriod_text = repaymentPeriod_text;
	}

	public String getContinuousNetProfit_text() {
		return continuousNetProfit_text;
	}

	public void setContinuousNetProfit_text(String continuousNetProfit_text) {
		this.continuousNetProfit_text = continuousNetProfit_text;
	}

	public String getQualityOfReceivables_text() {
		return qualityOfReceivables_text;
	}

	public void setQualityOfReceivables_text(String qualityOfReceivables_text) {
		this.qualityOfReceivables_text = qualityOfReceivables_text;
	}

	public String getQualityOfFinishedGoodsInventory_text() {
		return qualityOfFinishedGoodsInventory_text;
	}

	public void setQualityOfFinishedGoodsInventory_text(String qualityOfFinishedGoodsInventory_text) {
		this.qualityOfFinishedGoodsInventory_text = qualityOfFinishedGoodsInventory_text;
	}

	public String getKnowHow_text() {
		return knowHow_text;
	}

	public void setKnowHow_text(String knowHow_text) {
		this.knowHow_text = knowHow_text;
	}

	public String getLineOfActivity_text() {
		return lineOfActivity_text;
	}

	public void setLineOfActivity_text(String lineOfActivity_text) {
		this.lineOfActivity_text = lineOfActivity_text;
	}

	public String getCompetition_text() {
		return competition_text;
	}

	public void setCompetition_text(String competition_text) {
		this.competition_text = competition_text;
	}

	public String getFactoryPremises_text() {
		return factoryPremises_text;
	}

	public void setFactoryPremises_text(String factoryPremises_text) {
		this.factoryPremises_text = factoryPremises_text;
	}

	public String getSalesShowARisingTrend_text() {
		return salesShowARisingTrend_text;
	}

	public void setSalesShowARisingTrend_text(String salesShowARisingTrend_text) {
		this.salesShowARisingTrend_text = salesShowARisingTrend_text;
	}

	public Double getAge_obtained_score() {
		return age_obtained_score;
	}

	public void setAge_obtained_score(Double age_obtained_score) {
		this.age_obtained_score = age_obtained_score;
	}

	public Double getNoOfChildren_obtained_score() {
		return noOfChildren_obtained_score;
	}

	public void setNoOfChildren_obtained_score(Double noOfChildren_obtained_score) {
		this.noOfChildren_obtained_score = noOfChildren_obtained_score;
	}

	public Double getOwningHouse_obtained_score() {
		return owningHouse_obtained_score;
	}

	public void setOwningHouse_obtained_score(Double owningHouse_obtained_score) {
		this.owningHouse_obtained_score = owningHouse_obtained_score;
	}

	public Double getAcademicQUalification_obtained_score() {
		return academicQUalification_obtained_score;
	}

	public void setAcademicQUalification_obtained_score(Double academicQUalification_obtained_score) {
		this.academicQUalification_obtained_score = academicQUalification_obtained_score;
	}

	public Double getExperienceInTheLineOfTrade_obtained_score() {
		return experienceInTheLineOfTrade_obtained_score;
	}

	public void setExperienceInTheLineOfTrade_obtained_score(Double experienceInTheLineOfTrade_obtained_score) {
		this.experienceInTheLineOfTrade_obtained_score = experienceInTheLineOfTrade_obtained_score;
	}

	public Double getSpouseDetails_obtained_score() {
		return spouseDetails_obtained_score;
	}

	public void setSpouseDetails_obtained_score(Double spouseDetails_obtained_score) {
		this.spouseDetails_obtained_score = spouseDetails_obtained_score;
	}

	public Double getAssessedForIncomeTax_obtained_score() {
		return assessedForIncomeTax_obtained_score;
	}

	public void setAssessedForIncomeTax_obtained_score(Double assessedForIncomeTax_obtained_score) {
		this.assessedForIncomeTax_obtained_score = assessedForIncomeTax_obtained_score;
	}

	public Double getHaveLifeInsurancePolicy_obtained_score() {
		return haveLifeInsurancePolicy_obtained_score;
	}

	public void setHaveLifeInsurancePolicy_obtained_score(Double haveLifeInsurancePolicy_obtained_score) {
		this.haveLifeInsurancePolicy_obtained_score = haveLifeInsurancePolicy_obtained_score;
	}

	public Double getRepaymentPeriod_obtained_score() {
		return repaymentPeriod_obtained_score;
	}

	public void setRepaymentPeriod_obtained_score(Double repaymentPeriod_obtained_score) {
		this.repaymentPeriod_obtained_score = repaymentPeriod_obtained_score;
	}

	public Double getContinuousNetProfit_obtained_score() {
		return continuousNetProfit_obtained_score;
	}

	public void setContinuousNetProfit_obtained_score(Double continuousNetProfit_obtained_score) {
		this.continuousNetProfit_obtained_score = continuousNetProfit_obtained_score;
	}

	public Double getQualityOfReceivables_obtained_score() {
		return qualityOfReceivables_obtained_score;
	}

	public void setQualityOfReceivables_obtained_score(Double qualityOfReceivables_obtained_score) {
		this.qualityOfReceivables_obtained_score = qualityOfReceivables_obtained_score;
	}

	public Double getQualityOfFinishedGoodsInventory_obtained_score() {
		return qualityOfFinishedGoodsInventory_obtained_score;
	}

	public void setQualityOfFinishedGoodsInventory_obtained_score(
			Double qualityOfFinishedGoodsInventory_obtained_score) {
		this.qualityOfFinishedGoodsInventory_obtained_score = qualityOfFinishedGoodsInventory_obtained_score;
	}

	public Double getKnowHow_obtained_score() {
		return knowHow_obtained_score;
	}

	public void setKnowHow_obtained_score(Double knowHow_obtained_score) {
		this.knowHow_obtained_score = knowHow_obtained_score;
	}

	public Double getLineOfActivity_obtained_score() {
		return lineOfActivity_obtained_score;
	}

	public void setLineOfActivity_obtained_score(Double lineOfActivity_obtained_score) {
		this.lineOfActivity_obtained_score = lineOfActivity_obtained_score;
	}

	public Double getCompetition_obtained_score() {
		return competition_obtained_score;
	}

	public void setCompetition_obtained_score(Double competition_obtained_score) {
		this.competition_obtained_score = competition_obtained_score;
	}

	public Double getFactoryPremises_obtained_score() {
		return factoryPremises_obtained_score;
	}

	public void setFactoryPremises_obtained_score(Double factoryPremises_obtained_score) {
		this.factoryPremises_obtained_score = factoryPremises_obtained_score;
	}

	public Double getSalesShowARisingTrend_obtained_score() {
		return salesShowARisingTrend_obtained_score;
	}

	public void setSalesShowARisingTrend_obtained_score(Double salesShowARisingTrend_obtained_score) {
		this.salesShowARisingTrend_obtained_score = salesShowARisingTrend_obtained_score;
	}

	public Double getAge_max_score() {
		return age_max_score;
	}

	public void setAge_max_score(Double age_max_score) {
		this.age_max_score = age_max_score;
	}

	public Double getNoOfChildren_max_score() {
		return noOfChildren_max_score;
	}

	public void setNoOfChildren_max_score(Double noOfChildren_max_score) {
		this.noOfChildren_max_score = noOfChildren_max_score;
	}

	public Double getOwningHouse_max_score() {
		return owningHouse_max_score;
	}

	public void setOwningHouse_max_score(Double owningHouse_max_score) {
		this.owningHouse_max_score = owningHouse_max_score;
	}

	public Double getAcademicQUalification_max_score() {
		return academicQUalification_max_score;
	}

	public void setAcademicQUalification_max_score(Double academicQUalification_max_score) {
		this.academicQUalification_max_score = academicQUalification_max_score;
	}

	public Double getExperienceInTheLineOfTrade_max_score() {
		return experienceInTheLineOfTrade_max_score;
	}

	public void setExperienceInTheLineOfTrade_max_score(Double experienceInTheLineOfTrade_max_score) {
		this.experienceInTheLineOfTrade_max_score = experienceInTheLineOfTrade_max_score;
	}

	public Double getSpouseDetails_max_score() {
		return spouseDetails_max_score;
	}

	public void setSpouseDetails_max_score(Double spouseDetails_max_score) {
		this.spouseDetails_max_score = spouseDetails_max_score;
	}

	public Double getAssessedForIncomeTax_max_score() {
		return assessedForIncomeTax_max_score;
	}

	public void setAssessedForIncomeTax_max_score(Double assessedForIncomeTax_max_score) {
		this.assessedForIncomeTax_max_score = assessedForIncomeTax_max_score;
	}

	public Double getHaveLifeInsurancePolicy_max_score() {
		return haveLifeInsurancePolicy_max_score;
	}

	public void setHaveLifeInsurancePolicy_max_score(Double haveLifeInsurancePolicy_max_score) {
		this.haveLifeInsurancePolicy_max_score = haveLifeInsurancePolicy_max_score;
	}

	public Double getRepaymentPeriod_max_score() {
		return repaymentPeriod_max_score;
	}

	public void setRepaymentPeriod_max_score(Double repaymentPeriod_max_score) {
		this.repaymentPeriod_max_score = repaymentPeriod_max_score;
	}

	public Double getContinuousNetProfit_max_score() {
		return continuousNetProfit_max_score;
	}

	public void setContinuousNetProfit_max_score(Double continuousNetProfit_max_score) {
		this.continuousNetProfit_max_score = continuousNetProfit_max_score;
	}

	public Double getQualityOfReceivables_max_score() {
		return qualityOfReceivables_max_score;
	}

	public void setQualityOfReceivables_max_score(Double qualityOfReceivables_max_score) {
		this.qualityOfReceivables_max_score = qualityOfReceivables_max_score;
	}

	public Double getQualityOfFinishedGoodsInventory_max_score() {
		return qualityOfFinishedGoodsInventory_max_score;
	}

	public void setQualityOfFinishedGoodsInventory_max_score(Double qualityOfFinishedGoodsInventory_max_score) {
		this.qualityOfFinishedGoodsInventory_max_score = qualityOfFinishedGoodsInventory_max_score;
	}

	public Double getKnowHow_max_score() {
		return knowHow_max_score;
	}

	public void setKnowHow_max_score(Double knowHow_max_score) {
		this.knowHow_max_score = knowHow_max_score;
	}

	public Double getLineOfActivity_max_score() {
		return lineOfActivity_max_score;
	}

	public void setLineOfActivity_max_score(Double lineOfActivity_max_score) {
		this.lineOfActivity_max_score = lineOfActivity_max_score;
	}

	public Double getCompetition_max_score() {
		return competition_max_score;
	}

	public void setCompetition_max_score(Double competition_max_score) {
		this.competition_max_score = competition_max_score;
	}

	public Double getFactoryPremises_max_score() {
		return factoryPremises_max_score;
	}

	public void setFactoryPremises_max_score(Double factoryPremises_max_score) {
		this.factoryPremises_max_score = factoryPremises_max_score;
	}

	public Double getSalesShowARisingTrend_max_score() {
		return salesShowARisingTrend_max_score;
	}

	public void setSalesShowARisingTrend_max_score(Double salesShowARisingTrend_max_score) {
		this.salesShowARisingTrend_max_score = salesShowARisingTrend_max_score;
	}

	// descryption code
	public String getCombinedNetworth_code() {
		return combinedNetworth_code;
	}

	public void setCombinedNetworth_code(String combinedNetworth_code) {
		this.combinedNetworth_code = combinedNetworth_code;
	}

	public String getCustomerAssociateConcern_code() {
		return customerAssociateConcern_code;
	}

	public void setCustomerAssociateConcern_code(String customerAssociateConcern_code) {
		this.customerAssociateConcern_code = customerAssociateConcern_code;
	}

	public String getCibilTransunionScore_code() {
		return cibilTransunionScore_code;
	}

	public void setCibilTransunionScore_code(String cibilTransunionScore_code) {
		this.cibilTransunionScore_code = cibilTransunionScore_code;
	}

	public String getDebtEquityRatio_code() {
		return debtEquityRatio_code;
	}

	public void setDebtEquityRatio_code(String debtEquityRatio_code) {
		this.debtEquityRatio_code = debtEquityRatio_code;
	}

	public String getTolTnw_code() {
		return tolTnw_code;
	}

	public void setTolTnw_code(String tolTnw_code) {
		this.tolTnw_code = tolTnw_code;
	}

	public String getAvgCurruntRatio_code() {
		return avgCurruntRatio_code;
	}

	public void setAvgCurruntRatio_code(String avgCurruntRatio_code) {
		this.avgCurruntRatio_code = avgCurruntRatio_code;
	}

	public String getWorkingCapitalCycle_code() {
		return workingCapitalCycle_code;
	}

	public void setWorkingCapitalCycle_code(String workingCapitalCycle_code) {
		this.workingCapitalCycle_code = workingCapitalCycle_code;
	}

	public String getAvgAnnualGrowthGrossCash_code() {
		return avgAnnualGrowthGrossCash_code;
	}

	public void setAvgAnnualGrowthGrossCash_code(String avgAnnualGrowthGrossCash_code) {
		this.avgAnnualGrowthGrossCash_code = avgAnnualGrowthGrossCash_code;
	}

	public String getAvgAnnualGrowthNetSale_code() {
		return avgAnnualGrowthNetSale_code;
	}

	public void setAvgAnnualGrowthNetSale_code(String avgAnnualGrowthNetSale_code) {
		this.avgAnnualGrowthNetSale_code = avgAnnualGrowthNetSale_code;
	}

	public String getAvgEbidta_code() {
		return avgEbidta_code;
	}

	public void setAvgEbidta_code(String avgEbidta_code) {
		this.avgEbidta_code = avgEbidta_code;
	}

	public String getAvgAnnualGrossCashAccurals_code() {
		return avgAnnualGrossCashAccurals_code;
	}

	public void setAvgAnnualGrossCashAccurals_code(String avgAnnualGrossCashAccurals_code) {
		this.avgAnnualGrossCashAccurals_code = avgAnnualGrossCashAccurals_code;
	}

	public String getAvgInterestCovRatio_code() {
		return avgInterestCovRatio_code;
	}

	public void setAvgInterestCovRatio_code(String avgInterestCovRatio_code) {
		this.avgInterestCovRatio_code = avgInterestCovRatio_code;
	}

	public String getNoOfCustomer_code() {
		return noOfCustomer_code;
	}

	public void setNoOfCustomer_code(String noOfCustomer_code) {
		this.noOfCustomer_code = noOfCustomer_code;
	}

	public String getConcentrationCustomer_code() {
		return concentrationCustomer_code;
	}

	public void setConcentrationCustomer_code(String concentrationCustomer_code) {
		this.concentrationCustomer_code = concentrationCustomer_code;
	}

	public String getExperienceInBusiness_code() {
		return experienceInBusiness_code;
	}

	public void setExperienceInBusiness_code(String experienceInBusiness_code) {
		this.experienceInBusiness_code = experienceInBusiness_code;
	}

	public String getCreditSummation_code() {
		return creditSummation_code;
	}

	public void setCreditSummation_code(String creditSummation_code) {
		this.creditSummation_code = creditSummation_code;
	}

	public String getAge_code() {
		return age_code;
	}

	public void setAge_code(String age_code) {
		this.age_code = age_code;
	}

	public String getNoOfChildren_code() {
		return noOfChildren_code;
	}

	public void setNoOfChildren_code(String noOfChildren_code) {
		this.noOfChildren_code = noOfChildren_code;
	}

	public String getOwningHouse_code() {
		return owningHouse_code;
	}

	public void setOwningHouse_code(String owningHouse_code) {
		this.owningHouse_code = owningHouse_code;
	}

	public String getAcademicQUalification_code() {
		return academicQUalification_code;
	}

	public void setAcademicQUalification_code(String academicQUalification_code) {
		this.academicQUalification_code = academicQUalification_code;
	}

	public String getExperienceInTheLineOfTrade_code() {
		return experienceInTheLineOfTrade_code;
	}

	public void setExperienceInTheLineOfTrade_code(String experienceInTheLineOfTrade_code) {
		this.experienceInTheLineOfTrade_code = experienceInTheLineOfTrade_code;
	}

	public String getSpouseDetails_code() {
		return spouseDetails_code;
	}

	public void setSpouseDetails_code(String spouseDetails_code) {
		this.spouseDetails_code = spouseDetails_code;
	}

	public String getAssessedForIncomeTax_code() {
		return assessedForIncomeTax_code;
	}

	public void setAssessedForIncomeTax_code(String assessedForIncomeTax_code) {
		this.assessedForIncomeTax_code = assessedForIncomeTax_code;
	}

	public String getHaveLifeInsurancePolicy_code() {
		return haveLifeInsurancePolicy_code;
	}

	public void setHaveLifeInsurancePolicy_code(String haveLifeInsurancePolicy_code) {
		this.haveLifeInsurancePolicy_code = haveLifeInsurancePolicy_code;
	}

	public String getYearsInBusiness_code() {
		return yearsInBusiness_code;
	}

	public void setYearsInBusiness_code(String yearsInBusiness_code) {
		this.yearsInBusiness_code = yearsInBusiness_code;
	}

	public String getRepaymentPeriod_code() {
		return repaymentPeriod_code;
	}

	public void setRepaymentPeriod_code(String repaymentPeriod_code) {
		this.repaymentPeriod_code = repaymentPeriod_code;
	}

	public String getContinuousNetProfit_code() {
		return continuousNetProfit_code;
	}

	public void setContinuousNetProfit_code(String continuousNetProfit_code) {
		this.continuousNetProfit_code = continuousNetProfit_code;
	}

	public String getQualityOfReceivables_code() {
		return qualityOfReceivables_code;
	}

	public void setQualityOfReceivables_code(String qualityOfReceivables_code) {
		this.qualityOfReceivables_code = qualityOfReceivables_code;
	}

	public String getQualityOfFinishedGoodsInventory_code() {
		return qualityOfFinishedGoodsInventory_code;
	}

	public void setQualityOfFinishedGoodsInventory_code(String qualityOfFinishedGoodsInventory_code) {
		this.qualityOfFinishedGoodsInventory_code = qualityOfFinishedGoodsInventory_code;
	}

	public String getKnowHow_code() {
		return knowHow_code;
	}

	public void setKnowHow_code(String knowHow_code) {
		this.knowHow_code = knowHow_code;
	}

	public String getLineOfActivity_code() {
		return lineOfActivity_code;
	}

	public void setLineOfActivity_code(String lineOfActivity_code) {
		this.lineOfActivity_code = lineOfActivity_code;
	}

	public String getCompetition_code() {
		return competition_code;
	}

	public void setCompetition_code(String competition_code) {
		this.competition_code = competition_code;
	}

	public String getFactoryPremises_code() {
		return factoryPremises_code;
	}

	public void setFactoryPremises_code(String factoryPremises_code) {
		this.factoryPremises_code = factoryPremises_code;
	}

	public String getSalesShowARisingTrend_code() {
		return salesShowARisingTrend_code;
	}

	public void setSalesShowARisingTrend_code(String salesShowARisingTrend_code) {
		this.salesShowARisingTrend_code = salesShowARisingTrend_code;
	}

	public String getPastYearTurnOver_text() {
		return pastYearTurnOver_text;
	}

	public void setPastYearTurnOver_text(String pastYearTurnOver_text) {
		this.pastYearTurnOver_text = pastYearTurnOver_text;
	}

	public String getPastYearTurnOver_code() {
		return pastYearTurnOver_code;
	}

	public void setPastYearTurnOver_code(String pastYearTurnOver_code) {
		this.pastYearTurnOver_code = pastYearTurnOver_code;
	}

	public Double getPastYearTurnOver_obtained_score() {
		return pastYearTurnOver_obtained_score;
	}

	public void setPastYearTurnOver_obtained_score(Double pastYearTurnOver_obtained_score) {
		this.pastYearTurnOver_obtained_score = pastYearTurnOver_obtained_score;
	}

	public Double getPastYearTurnOver_max_score() {
		return pastYearTurnOver_max_score;
	}

	public void setPastYearTurnOver_max_score(Double pastYearTurnOver_max_score) {
		this.pastYearTurnOver_max_score = pastYearTurnOver_max_score;
	}

	public String getDebt_EBITAD_text() {
		return debt_EBITAD_text;
	}

	public void setDebt_EBITAD_text(String debt_EBITAD_text) {
		this.debt_EBITAD_text = debt_EBITAD_text;
	}

	public String getDebt_EBITAD_code() {
		return debt_EBITAD_code;
	}

	public void setDebt_EBITAD_code(String debt_EBITAD_code) {
		this.debt_EBITAD_code = debt_EBITAD_code;
	}

	public Double getDebt_EBITAD_obtained_score() {
		return debt_EBITAD_obtained_score;
	}

	public void setDebt_EBITAD_obtained_score(Double debt_EBITAD_obtained_score) {
		this.debt_EBITAD_obtained_score = debt_EBITAD_obtained_score;
	}

	public Double getDebt_EBITAD_max_score() {
		return debt_EBITAD_max_score;
	}

	public void setDebt_EBITAD_max_score(Double debt_EBITAD_max_score) {
		this.debt_EBITAD_max_score = debt_EBITAD_max_score;
	}

	public String getTurnover_ATNW_text() {
		return turnover_ATNW_text;
	}

	public void setTurnover_ATNW_text(String turnover_ATNW_text) {
		this.turnover_ATNW_text = turnover_ATNW_text;
	}

	public String getTurnover_ATNW_code() {
		return turnover_ATNW_code;
	}

	public void setTurnover_ATNW_code(String turnover_ATNW_code) {
		this.turnover_ATNW_code = turnover_ATNW_code;
	}

	public Double getTurnover_ATNW_obtained_score() {
		return turnover_ATNW_obtained_score;
	}

	public void setTurnover_ATNW_obtained_score(Double turnover_ATNW_obtained_score) {
		this.turnover_ATNW_obtained_score = turnover_ATNW_obtained_score;
	}

	public Double getTurnover_ATNW_max_score() {
		return turnover_ATNW_max_score;
	}

	public void setTurnover_ATNW_max_score(Double turnover_ATNW_max_score) {
		this.turnover_ATNW_max_score = turnover_ATNW_max_score;
	}

	public String getNo_of_cheques_bounced_text() {
		return no_of_cheques_bounced_text;
	}

	public void setNo_of_cheques_bounced_text(String no_of_cheques_bounced_text) {
		this.no_of_cheques_bounced_text = no_of_cheques_bounced_text;
	}

	public String getNo_of_cheques_bounced_code() {
		return no_of_cheques_bounced_code;
	}

	public void setNo_of_cheques_bounced_code(String no_of_cheques_bounced_code) {
		this.no_of_cheques_bounced_code = no_of_cheques_bounced_code;
	}

	public Double getNo_of_cheques_bounced_obtained_score() {
		return no_of_cheques_bounced_obtained_score;
	}

	public void setNo_of_cheques_bounced_obtained_score(Double no_of_cheques_bounced_obtained_score) {
		this.no_of_cheques_bounced_obtained_score = no_of_cheques_bounced_obtained_score;
	}

	public Double getNo_of_cheques_bounced_max_score() {
		return no_of_cheques_bounced_max_score;
	}

	public void setNo_of_cheques_bounced_max_score(Double no_of_cheques_bounced_max_score) {
		this.no_of_cheques_bounced_max_score = no_of_cheques_bounced_max_score;
	}

	public String getNo_of_cheques_bounced_last_six_month_text() {
		return no_of_cheques_bounced_last_six_month_text;
	}

	public void setNo_of_cheques_bounced_last_six_month_text(String no_of_cheques_bounced_last_six_month_text) {
		this.no_of_cheques_bounced_last_six_month_text = no_of_cheques_bounced_last_six_month_text;
	}

	public String getNo_of_cheques_bounced_last_six_month_code() {
		return no_of_cheques_bounced_last_six_month_code;
	}

	public void setNo_of_cheques_bounced_last_six_month_code(String no_of_cheques_bounced_last_six_month_code) {
		this.no_of_cheques_bounced_last_six_month_code = no_of_cheques_bounced_last_six_month_code;
	}

	public Double getNo_of_cheques_bounced_last_six_month_obtained_score() {
		return no_of_cheques_bounced_last_six_month_obtained_score;
	}

	public void setNo_of_cheques_bounced_last_six_month_obtained_score(
			Double no_of_cheques_bounced_last_six_month_obtained_score) {
		this.no_of_cheques_bounced_last_six_month_obtained_score = no_of_cheques_bounced_last_six_month_obtained_score;
	}

	public Double getNo_of_cheques_bounced_last_six_month_max_score() {
		return no_of_cheques_bounced_last_six_month_max_score;
	}

	public void setNo_of_cheques_bounced_last_six_month_max_score(
			Double no_of_cheques_bounced_last_six_month_max_score) {
		this.no_of_cheques_bounced_last_six_month_max_score = no_of_cheques_bounced_last_six_month_max_score;
	}

	public String getCollateral_coverage_text() {
		return collateral_coverage_text;
	}

	public void setCollateral_coverage_text(String collateral_coverage_text) {
		this.collateral_coverage_text = collateral_coverage_text;
	}

	public String getCollateral_coverage_code() {
		return collateral_coverage_code;
	}

	public void setCollateral_coverage_code(String collateral_coverage_code) {
		this.collateral_coverage_code = collateral_coverage_code;
	}

	public Double getCollateral_coverage_score() {
		return collateral_coverage_score;
	}

	public void setCollateral_coverage_score(Double collateral_coverage_score) {
		this.collateral_coverage_score = collateral_coverage_score;
	}

	public Double getCollateral_coverage_max_score() {
		return collateral_coverage_max_score;
	}

	public void setCollateral_coverage_max_score(Double collateral_coverage_max_score) {
		this.collateral_coverage_max_score = collateral_coverage_max_score;
	}

	public String getDebt_service_coverage_ratio_text() {
		return debt_service_coverage_ratio_text;
	}

	public void setDebt_service_coverage_ratio_text(String debt_service_coverage_ratio_text) {
		this.debt_service_coverage_ratio_text = debt_service_coverage_ratio_text;
	}

	public String getDebt_service_coverage_ratio_code() {
		return debt_service_coverage_ratio_code;
	}

	public void setDebt_service_coverage_ratio_code(String debt_service_coverage_ratio_code) {
		this.debt_service_coverage_ratio_code = debt_service_coverage_ratio_code;
	}

	public Double getDebt_service_coverage_ratio_score() {
		return debt_service_coverage_ratio_score;
	}

	public void setDebt_service_coverage_ratio_score(Double debt_service_coverage_ratio_score) {
		this.debt_service_coverage_ratio_score = debt_service_coverage_ratio_score;
	}

	public Double getDebt_service_coverage_ratio_max_score() {
		return debt_service_coverage_ratio_max_score;
	}

	public void setDebt_service_coverage_ratio_max_score(Double debt_service_coverage_ratio_max_score) {
		this.debt_service_coverage_ratio_max_score = debt_service_coverage_ratio_max_score;
	}

	public String getUtilisation_percentage_text() {
		return utilisation_percentage_text;
	}

	public void setUtilisation_percentage_text(String utilisation_percentage_text) {
		this.utilisation_percentage_text = utilisation_percentage_text;
	}

	public String getUtilisation_percentage_code() {
		return utilisation_percentage_code;
	}

	public void setUtilisation_percentage_code(String utilisation_percentage_code) {
		this.utilisation_percentage_code = utilisation_percentage_code;
	}

	public Double getUtilisation_percentage_score() {
		return utilisation_percentage_score;
	}

	public void setUtilisation_percentage_score(Double utilisation_percentage_score) {
		this.utilisation_percentage_score = utilisation_percentage_score;
	}

	public Double getUtilisation_percentage_max_score() {
		return utilisation_percentage_max_score;
	}

	public void setUtilisation_percentage_max_score(Double utilisation_percentage_max_score) {
		this.utilisation_percentage_max_score = utilisation_percentage_max_score;
	}

	public String getTurnover_to_limit_ratio_text() {
		return turnover_to_limit_ratio_text;
	}

	public void setTurnover_to_limit_ratio_text(String turnover_to_limit_ratio_text) {
		this.turnover_to_limit_ratio_text = turnover_to_limit_ratio_text;
	}

	public String getTurnover_to_limit_ratio_code() {
		return turnover_to_limit_ratio_code;
	}

	public void setTurnover_to_limit_ratio_code(String turnover_to_limit_ratio_code) {
		this.turnover_to_limit_ratio_code = turnover_to_limit_ratio_code;
	}

	public Double getTurnover_to_limit_ratio_score() {
		return turnover_to_limit_ratio_score;
	}

	public void setTurnover_to_limit_ratio_score(Double turnover_to_limit_ratio_score) {
		this.turnover_to_limit_ratio_score = turnover_to_limit_ratio_score;
	}

	public Double getTurnover_to_limit_ratio_max_score() {
		return turnover_to_limit_ratio_max_score;
	}

	public void setTurnover_to_limit_ratio_max_score(Double turnover_to_limit_ratio_max_score) {
		this.turnover_to_limit_ratio_max_score = turnover_to_limit_ratio_max_score;
	}

	
}
