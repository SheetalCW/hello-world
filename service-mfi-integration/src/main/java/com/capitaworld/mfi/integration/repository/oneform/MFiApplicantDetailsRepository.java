package com.capitaworld.mfi.integration.repository.oneform;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitaworld.mfi.integration.domain.oneform.MFiApplicantDetails;

public interface MFiApplicantDetailsRepository extends JpaRepository<MFiApplicantDetails, Long> {

	List<MFiApplicantDetails> findByApplicationIdAndIsCoApplicantDetailsAndIsActiveIsTrue(Long applicationId,
			Boolean isCoApplicantDetails);

}
