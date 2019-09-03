package com.capitaworld.mfi.integration.repository.oneform;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitaworld.mfi.integration.domain.oneform.MFIEligibilityDetails;


public interface MFIEligibilityDetailsRepository extends JpaRepository<MFIEligibilityDetails, Long> {
	MFIEligibilityDetails findByApplicationIdAndIsActiveIsTrue(Long applicationId);
}
