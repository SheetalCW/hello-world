package com.capitaworld.mfi.integration.domain.bankscore;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.capitaworld.mfi.integration.domain.oneform.Auditor;


@Entity
@Table(name = "score_parameter_master_det")
public class ScoreParameterMasterDetail extends Auditor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3400310344696777562L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "score_parameter_master_det_seq")
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "score_parameter_id")
	private ScoreParameterMaster scoreParameterMasterId;

	@Column(name = "application_id")
	private Long applicationId;

	@Column(name = "cw_co_applicant_id")
	private Long cwCoApplicantId;

	@Column(name = "parameter_name", length = 500)
	private String parameterName;

	@Column(name = "parameter_option", length = 1000)
	private String parameterOption;

	@Column(name = "answer", length = 1000)
	private String answer;

	@Column(name = "obtained_score")
	private Double obtainedScore;

	@Column(name = "max_score")
	private Double maxScore;

	@Column(name = "code")
	private String code;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ScoreParameterMaster getScoreParameterMasterId() {
		return scoreParameterMasterId;
	}

	public void setScoreParameterMasterId(ScoreParameterMaster scoreParameterMasterId) {
		this.scoreParameterMasterId = scoreParameterMasterId;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getCwCoApplicantId() {
		return cwCoApplicantId;
	}

	public void setCwCoApplicantId(Long cwCoApplicantId) {
		this.cwCoApplicantId = cwCoApplicantId;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public String getParameterOption() {
		return parameterOption;
	}

	public void setParameterOption(String parameterOption) {
		this.parameterOption = parameterOption;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Double getObtainedScore() {
		return obtainedScore;
	}

	public void setObtainedScore(Double obtainedScore) {
		this.obtainedScore = obtainedScore;
	}

	public Double getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(Double maxScore) {
		this.maxScore = maxScore;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
