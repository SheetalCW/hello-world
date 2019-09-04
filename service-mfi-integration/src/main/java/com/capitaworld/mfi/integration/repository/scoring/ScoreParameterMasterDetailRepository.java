package com.capitaworld.mfi.integration.repository.scoring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.capitaworld.mfi.integration.domain.scoring.ScoreParameterMasterDetail;


public interface ScoreParameterMasterDetailRepository extends JpaRepository<ScoreParameterMasterDetail , Long> {

	public List<ScoreParameterMasterDetail> findByApplicationIdAndScoreParameterMasterIdIdAndIsActiveIsTrue(Long applicationId , Long scoreParameterMasterId);
	
	public ScoreParameterMasterDetail findByApplicationIdAndParameterNameAndIsActiveIsTrue(Long applicationId , String parameterName);
	
	public ScoreParameterMasterDetail findByApplicationIdAndCwCoApplicantIdAndParameterNameAndIsActiveIsTrue(Long applicationId ,Long cwCoApplicantId , String parameterName);
	
	@Transactional(noRollbackFor = Exception.class)
	@Modifying
	@Query("DELETE FROM ScoreParameterMasterDetail  WHERE applicationId =:applicationId AND scoreParameterMasterId.id = :scoreParameterMasterId AND isActive = true ")
	public Integer deleteOldScoreParameterDetailByApplicationIdAndScoreParameterId(@Param("applicationId")Long applicationId , @Param("scoreParameterMasterId")  Long scoreParameterMasterId);
	
	
}
