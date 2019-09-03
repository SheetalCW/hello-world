package com.capitaworld.mfi.integration.domain.oneform;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.capitaworld.mfi.integration.domain.common.Auditor;

/** Save any document file
 * @author dharmendra.chudasama
 */
/**
 * @author dharmendra.chudasama
 *
 */
@Entity
@Table(name = "doc_detail")
public class DocumentDetail extends Auditor {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "application_Id")
	private Long applicationId;
	
	/** Which type of document */
	@Column(name = "document_type")
	private Integer documentType;

	@Column(name = "cw_doc_id")
	private Long cwDocId;

	@Lob
	@Column(name = "document_data")
	private byte[] documentData;

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

	public Integer getDocumentType() {
		return documentType;
	}

	public void setDocumentType(Integer documentType) {
		this.documentType = documentType;
	}

	public Long getCwDocId() {
		return cwDocId;
	}

	public void setCwDocId(Long cwDocId) {
		this.cwDocId = cwDocId;
	}

	public byte[] getDocumentData() {
		return documentData;
	}

	public void setDocumentData(byte[] documentData) {
		this.documentData = documentData;
	}
	
}
