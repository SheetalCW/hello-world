package com.capitaworld.mfi.integration.service.loan;

import com.capitaworld.mfi.integration.api.model.loan.LoanMasterRequest;

public interface LoanMasterDetailService {
	/**
	 * @param loanMasterDetailRequest
	 * @return <code>null</code>=success, or error message
	 */
	public String saveLoanMasterDetail(LoanMasterRequest loanMasterDetailRequest);
	
}
