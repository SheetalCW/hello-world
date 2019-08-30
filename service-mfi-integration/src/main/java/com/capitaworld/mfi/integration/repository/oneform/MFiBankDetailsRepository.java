package com.capitaworld.mfi.integration.repository.oneform;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitaworld.mfi.integration.domain.oneform.MFiBankDetails;


public interface MFiBankDetailsRepository extends JpaRepository<MFiBankDetails, Long> {
	
	
	List<MFiBankDetails> findByApplicantDetailIdAndIsActiveIsTrue(Long applicantDetailId);

}
