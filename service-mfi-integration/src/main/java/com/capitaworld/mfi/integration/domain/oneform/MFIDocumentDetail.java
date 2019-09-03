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
public class MFIDocumentDetail extends Auditor {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "application_Id")
	private Long applicationId;
	
	@Column(name = "ref_Id")
	private Long refId;
	
	@Column(name = "table_Name")
	private String tableName;
	
	/** Which type of document, refer from ENUM */
	@Column(name = "document_type_id")
	private Integer documentTypeId;

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
	

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}


	public Integer getDocumentTypeId() {
		return documentTypeId;
	}

	public void setDocumentTypeId(Integer documentTypeId) {
		this.documentTypeId = documentTypeId;
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

	public Long getRefId() {
		return refId;
	}

	public void setRefId(Long refId) {
		this.refId = refId;
	}
	
}
