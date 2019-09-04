package com.capitaworld.mfi.integration.domain.matches;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.capitaworld.mfi.integration.domain.common.Auditor;


/**
 * @author ankit.gupta
 *
 */
@Entity
@Table(name = "matches_parameter_detail")
public class MatchParameterDetailsRetail extends Auditor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1870494426184005798L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "matches_parameter_detail_seq")
	private Long id;

	@Column(name = "application_id")
	private Long applicationId;

	@Column(name = "fp_product_id")
	private Long fpProductId;

	@Column(name = "parameter_name", length = 1000)
	private String parameterName;

	@Column(name = "fp_value")
	@Type(type = "text")
	private String fpValue;

	@Column(name = "fs_value", length = 500)
	private String fsValue;

	@Column(name = "is_display")
	private Boolean isDisplay;

	@Column(name = "is_mandatory")
	private Boolean isMandatory;

	@Column(name = "is_matched")
	private Boolean isMatched;

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

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public String getFpValue() {
		return fpValue;
	}

	public void setFpValue(String fpValue) {
		this.fpValue = fpValue;
	}

	public String getFsValue() {
		return fsValue;
	}

	public void setFsValue(String fsValue) {
		this.fsValue = fsValue;
	}

	public Boolean getIsDisplay() {
		return isDisplay;
	}

	public void setIsDisplay(Boolean isDisplay) {
		this.isDisplay = isDisplay;
	}

	public Boolean getIsMandatory() {
		return isMandatory;
	}

	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public Boolean getIsMatched() {
		return isMatched;
	}

	public void setIsMatched(Boolean isMatched) {
		this.isMatched = isMatched;
	}

}
