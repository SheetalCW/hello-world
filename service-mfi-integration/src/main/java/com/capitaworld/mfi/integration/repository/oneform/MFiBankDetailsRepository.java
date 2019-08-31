package com.capitaworld.mfi.integration.repository.oneform;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitaworld.mfi.integration.domain.oneform.MFiBankDetails;


public interface MFiBankDetailsRepository extends JpaRepository<MFiBankDetails, Long> {
	
	MFiBankDetails findByApplicantDetailIdAndIsActiveIsTrue(Long applicantDetailId);

}
