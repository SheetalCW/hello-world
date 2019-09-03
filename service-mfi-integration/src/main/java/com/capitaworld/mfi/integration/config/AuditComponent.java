package com.capitaworld.mfi.integration.config;

import java.sql.SQLException;
import java.util.Date;

import javax.sql.rowset.serial.SerialBlob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.capitaworld.api.common.lib.utils.CommonUtils;
import com.capitaworld.mfi.integration.domain.common.AuditMaster;
import com.capitaworld.mfi.integration.repository.audit.AuditMasterRepository;

@Component
public class AuditComponent {

	public static final int PRELIM_INFO = 1;
	public static final int DETAILED_INFO = 2;
	public static final int SCORING_DETAILS = 3;
	public static final int IRR_DETAILS = 4;
	public static final int DDR_DETAILS = 5;
	public static final int BANK_STATEMENT = 6;
	public static final int MATCHES_PARAMETER = 7;
	public static final int ELIGIBILITY = 8;
	public static final int FINANCIAL_DETAILS = 9;
	public static final int GENERATING_TOKEN = 10;
	public static final int TOKEN_AS_EXPIRED = 11;
	public static final int CMA_DETAIL = 12;
	public static final int LOGIC_DETAIL = 13;
	public static final int COMMERCIAL_CIBIL = 14;
	public static final int SANCTION_AND_DISBURSEMENT = 15;
	public static final int UPDATE_PROPOSAL_STATUS_LOAN_MASTER = 16;

	public static final int CGTMSE_DETAIL = 21;
	public static final int GST_DETAIL = 22;
	public static final int FINAL_DISPLAY = 24;
	public static final int ADDITIONAL_DETAIL = 25;
	public static final int SAVE_ONE_FORM_DETAILS = 26;

	@Autowired
	private AuditMasterRepository auditMasterRepository;

	private static final Logger logger = LoggerFactory.getLogger(AuditComponent.class);

	@Async
	public void updateAudit(String request, Integer type, Long applicationId, Long userId, String reason,
			Boolean isSuccess) {
		AuditMaster auditMaster = new AuditMaster();
		auditMaster.setApplicationId(applicationId);
		auditMaster.setUserId(userId);
		auditMaster.setType(type);
		auditMaster.setCreatedBy(userId);
		auditMaster.setCreatedDate(new Date());
		auditMaster.setIsActive(true);
		auditMaster.setFailureReason(reason);
		auditMaster.setIsSuccess(isSuccess);
		if (!CommonUtils.isObjectNullOrEmpty(request)) {
			try {
				auditMaster.setRequest(new SerialBlob(request.getBytes()));
			} catch (SQLException e) {
				logger.info(" error while convert String into blob ----> ");
				logger.info("Error===>{}", e.getMessage());
			}
		}
		auditMasterRepository.save(auditMaster);
		logger.info("SUCCESSFULLY UPADATE AUDIT DATE-----------------TYPE-->" + type + "------Application-----> "
				+ applicationId);
	}

}
