package com.capitaworld.mfi.integration.repository.oneform;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitaworld.mfi.integration.domain.oneform.DocumentDetail;

public interface DocumentDetailRepository extends JpaRepository<DocumentDetail, Long> {
	
	DocumentDetail findByCwDocIdAndIsActiveIsTrue(Long cwDocId);
//	MFiBankDetails findByApplicantDetailIdAndIsActiveIsTrue(Long applicantDetailId);

}
