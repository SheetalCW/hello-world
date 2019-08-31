package com.capitaworld.mfi.integration.repository.oneform;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.capitaworld.mfi.integration.domain.oneform.MFiCurrentFinancialArrangementsDetails;

public interface MFiCurrentFinancialArrangementsDetailsRepository
		extends JpaRepository<MFiCurrentFinancialArrangementsDetails, Long> {

	
	@Transactional 
	@Modifying
	@Query("UPDATE MFiCurrentFinancialArrangementsDetails SET isActive = false, modifiedDate = SYSDATE() WHERE applicantDetailId =:applicantDetailId AND isActive = true")
	public int inactive(@Param("applicantDetailId") Long applicantDetailId);
}
