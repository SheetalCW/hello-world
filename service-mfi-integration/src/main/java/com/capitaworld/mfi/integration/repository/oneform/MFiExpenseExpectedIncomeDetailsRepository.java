package com.capitaworld.mfi.integration.repository.oneform;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitaworld.mfi.integration.domain.oneform.MFiExpenseExpectedIncomeDetails;

public interface MFiExpenseExpectedIncomeDetailsRepository
		extends JpaRepository<MFiExpenseExpectedIncomeDetails, Long> {
	
	
	MFiExpenseExpectedIncomeDetails findByApplicantDetailIdAndIsActiveIsTrue(Long applicantDetailId);

}
