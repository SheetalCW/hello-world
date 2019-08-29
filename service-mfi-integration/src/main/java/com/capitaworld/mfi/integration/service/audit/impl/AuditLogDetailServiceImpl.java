package com.capitaworld.mfi.integration.service.audit.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capitaworld.api.common.lib.model.common.AuditMasterRequest;
import com.capitaworld.api.common.lib.model.reverse_api.sanction_disbursed.RequiredDetailRequest;
import com.capitaworld.api.common.lib.utils.MultipleJSONObjectHelper;
import com.capitaworld.mfi.integration.domain.oneform.AuditMaster;
import com.capitaworld.mfi.integration.repository.audit.AuditMasterRepository;
import com.capitaworld.mfi.integration.service.audit.AuditLogDetailService;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service 
@Transactional
public class AuditLogDetailServiceImpl implements AuditLogDetailService {

	private static final Logger logger = LoggerFactory.getLogger(AuditLogDetailServiceImpl.class);
	
	@Autowired
	private AuditMasterRepository auditMasterRepository;
	
	/*
	 * @Autowired private BankProposalAuditLogRepository
	 * bankProposalAuditLogRepository;
	 */
	
	public String getAudit(RequiredDetailRequest requiredDetailRequest) throws JsonProcessingException, SQLException {
		logger.info("============ Enter in getAudit() ============= applicationId ==> {} " ,requiredDetailRequest.getApplicationId() );
		if(requiredDetailRequest.isGetAuditMasterLog()) {
			List<AuditMaster> auditMasterList = auditMasterRepository.findByApplicationId(requiredDetailRequest.getApplicationId());
			List<AuditMasterRequest> auditMasterRequestList = new ArrayList<AuditMasterRequest>();
			AuditMasterRequest auditMasterRequest = null  ;
			for(AuditMaster auditMaster : auditMasterList ) {
				auditMasterRequest = new AuditMasterRequest();
				BeanUtils.copyProperties(auditMaster, auditMasterRequest);
				if(auditMaster.getRequest() != null && auditMaster.getRequest().length() > 1) {
					byte[] bytes = auditMaster.getRequest().getBytes(1l, (int) auditMaster.getRequest().length());
					String request = new String(bytes);
					auditMasterRequest.setRequest(request);
				}
				auditMasterRequestList.add(auditMasterRequest);
			}
			return MultipleJSONObjectHelper.getStringfromObject(auditMasterRequestList);
		
		} else if(requiredDetailRequest.isGetBankCurrentProposalAuditLog()) {
			
			/*
			 * List<BankProposalAuditLog> bankProposalAuditLogList =
			 * bankProposalAuditLogRepository.findByApplicationId(requiredDetailRequest.
			 * getApplicationId()); return
			 * MultipleJSONObjectHelper.getStringfromObject(bankProposalAuditLogList);
			 */
		}
		return "{}";
		
	}
	
}
