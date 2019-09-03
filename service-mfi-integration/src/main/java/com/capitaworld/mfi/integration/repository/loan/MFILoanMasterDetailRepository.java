package com.capitaworld.mfi.integration.repository.loan;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitaworld.mfi.integration.domain.loan.MFILoanMasterDetail;


public interface MFILoanMasterDetailRepository extends JpaRepository<MFILoanMasterDetail, Long>{

	public MFILoanMasterDetail findByApplicationIdAndIsActiveIsTrue(Long applicationId);
	
}
