package com.capitaworld.mfi.integration.repository.scoring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.capitaworld.mfi.integration.domain.scoring.ScoreParameterMaster;


public interface ScoreParameterMasterRepository extends JpaRepository<ScoreParameterMaster, Long> {

	public ScoreParameterMaster findByApplicationIdAndCwCoApplicantIdAndIsActiveIsTrue(Long applicatinId , Long cwCoApplicantId);
	
	@Transactional(noRollbackFor = Exception.class)
	@Modifying
	@Query(" UPDATE ScoreParameterMaster spm SET spm.isActive =:isAtive , spm.modifiedDate = sysdate() WHERE spm.applicationId =:applicationId AND spm.fpProductId =:fpProductId spm.isActive = true ") 
	public Integer inActive(@Param("applicationId")Long applicationId ,@Param("fpProductId") Long fpProductId, @Param("isAtive") Boolean iActive );  
}
