package com.capitaworld.mfi.integration.repository.scoring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitaworld.mfi.integration.domain.scoring.MFIScoreParameterDetails;

public interface MFIScoreParameterDetailsRepository extends JpaRepository<MFIScoreParameterDetails,Long> {

    public MFIScoreParameterDetails findByApplicationIdAndIsActiveIsTrue(Long applicationId);
}
