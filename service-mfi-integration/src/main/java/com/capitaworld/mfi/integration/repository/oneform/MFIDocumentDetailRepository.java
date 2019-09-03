package com.capitaworld.mfi.integration.repository.oneform;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitaworld.mfi.integration.domain.oneform.MFIDocumentDetail;

public interface MFIDocumentDetailRepository extends JpaRepository<MFIDocumentDetail, Long> {
	
	public MFIDocumentDetail findByCwDocIdAndIsActiveIsTrue(Long cwDocId);

}
