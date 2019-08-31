package com.capitaworld.mfi.integration.repository.oneform;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.capitaworld.mfi.integration.domain.oneform.MFiApplicantDetails;

public interface MFiApplicantDetailsRepository extends JpaRepository<MFiApplicantDetails, Long> {
	
	/** Fetch Applicant detail
	 * @param applicationId
	 * @return applicant detail or <code>null</code> if not exists
	 */
	MFiApplicantDetails findByApplicationIdAndIsCoApplicantIsFalseAndIsActiveIsTrue(Long applicationId);

	@Transactional 
	@Modifying
	@Query("UPDATE MFiApplicantDetails SET isActive = false, modifiedDate = SYSDATE() WHERE applicationId =:applicationId AND isCoApplicant = true AND isActive = true")
	public int inactiveCoApplicants(@Param("applicationId") Long applicationId);

}
