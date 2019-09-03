package com.capitaworld.mfi.integration.repository.matches;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitaworld.mfi.integration.domain.matches.MFIMatchesParameterDetail;


public interface MFIMatchesRepository extends JpaRepository<MFIMatchesParameterDetail, Long>{

	public MFIMatchesParameterDetail findByApplicationIdAndIsActiveIsTrue(Long applicationId); 
	
}
