package com.capitaworld.mfi.integration.domain.oneform;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "audit_master")
@NamedQuery(name = "AuditMaster.findAll", query = "SELECT a FROM AuditMaster a")
public class AuditMaster extends Auditor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "audit_master_seq")
	private Long id;

	private Integer type;

	@Column(name = "application_id")
	private Long applicationId;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "failure_reason", length = 3000)
	private String failureReason;

	@Column(name = "is_success")
	private Boolean isSuccess = false;

	@Column(name = "request")
	private Blob request;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Blob getRequest() {
		return request;
	}

	public void setRequest(Blob request) {
		this.request = request;
	}

	@Override
	public String toString() {
		return "AuditMaster [id=" + id + ", type=" + type + ", applicationId=" + applicationId + ", userId=" + userId
				+ ", failureReason=" + failureReason + ", isSuccess=" + isSuccess + ", request=" + request + "]";
	}
}
