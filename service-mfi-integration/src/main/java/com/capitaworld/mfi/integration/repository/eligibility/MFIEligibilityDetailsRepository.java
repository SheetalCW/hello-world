package com.capitaworld.mfi.integration.repository.eligibility;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitaworld.mfi.integration.domain.eligibility.MFIEligibilityDetails;

public interface MFIEligibilityDetailsRepository extends JpaRepository<MFIEligibilityDetails, Long> {
	public MFIEligibilityDetails findByApplicationIdAndIsActiveIsTrue(Long applicationId);
}
