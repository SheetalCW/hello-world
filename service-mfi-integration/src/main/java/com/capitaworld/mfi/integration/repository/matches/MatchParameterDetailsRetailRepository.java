package com.capitaworld.mfi.integration.repository.matches;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.capitaworld.mfi.integration.domain.matches.MatchParameterDetailsRetail;


public interface MatchParameterDetailsRetailRepository extends JpaRepository<MatchParameterDetailsRetail, Long> {

	public MatchParameterDetailsRetail findByApplicationIdAndIsActive(Long applicationId , Boolean isActive);
	
	public MatchParameterDetailsRetail findByApplicationIdAndParameterNameAndIsActiveIsTrue(Long applicationId , String parameterName);
	
	@Transactional(noRollbackFor = Exception.class)
	@Modifying
	@Query("DELETE FROM MatchParameterDetailsRetail mpdr WHERE mpdr.applicationId =:applicationId AND mpdr.fpProductId =:fpProductId AND mpdr.isActive = true ")
	public Integer deleteOldMatchParameterDetailsByApplication(@Param("applicationId")Long applicationId , @Param("fpProductId")Long fpProductId);
	
	@Transactional(noRollbackFor = Exception.class)
	@Modifying
	@Query(" UPDATE MatchParameterDetailsRetail bcf SET bcf.isActive =:isAtive , bcf.modifiedDate = sysdate() WHERE bcf.applicationId =:applicationId AND bcf.fpProductId =:fpProductId AND bcf.isActive = true ") 
	public Integer inActive(@Param("applicationId")Long applicationId ,@Param("fpProductId") Long fpProductId, @Param("isAtive") Boolean iActive );  
}
