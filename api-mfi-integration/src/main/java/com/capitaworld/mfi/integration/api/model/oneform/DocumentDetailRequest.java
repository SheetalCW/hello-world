package com.capitaworld.mfi.integration.api.model.oneform;

import java.io.Serializable;

public class DocumentDetailRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long cwDocId;
	private byte[] documentData;
	
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
