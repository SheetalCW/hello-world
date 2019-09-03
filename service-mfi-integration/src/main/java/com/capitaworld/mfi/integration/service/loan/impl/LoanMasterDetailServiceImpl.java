package com.capitaworld.mfi.integration.service.loan.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capitaworld.mfi.integration.api.model.loan.LoanMasterRequest;
import com.capitaworld.mfi.integration.domain.eligibility.MFIEligibilityDetails;
import com.capitaworld.mfi.integration.domain.loan.MFILoanMasterDetail;
import com.capitaworld.mfi.integration.repository.loan.MFILoanMasterDetailRepository;
import com.capitaworld.mfi.integration.service.loan.LoanMasterDetailService;
import com.capitaworld.mfi.integration.utils.CommonUtils;

@Service
public class LoanMasterDetailServiceImpl implements LoanMasterDetailService {

	private static final Logger logger = LoggerFactory.getLogger(LoanMasterDetailServiceImpl.class);
	
	@Autowired
	private MFILoanMasterDetailRepository loanMasterDetailRepository;

	
	@Transactional
	public String saveLoanMasterDetail(LoanMasterRequest loanMasterDetailRequest){
		
		Long applicationId = loanMasterDetailRequest.getApplicationId();
		
		MFILoanMasterDetail loanMasterDetail = loanMasterDetailRepository.findByApplicationIdAndIsActiveIsTrue(applicationId);
		loanMasterDetail = CommonUtils.setAuditDetail(loanMasterDetailRequest, loanMasterDetail, MFILoanMasterDetail::new);
		loanMasterDetail.setApplicationId(applicationId);
		loanMasterDetailRepository.save(loanMasterDetail);
		
		logger.info("--------- save saveLoanMasterDetail ------------ ");
		logger.info("============== Exit from  saveLoanMasterDetail ====================  ");
		return null;
	
	}

	
	
}
