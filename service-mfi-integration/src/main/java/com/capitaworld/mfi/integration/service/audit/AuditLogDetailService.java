package com.capitaworld.mfi.integration.service.audit;

import java.sql.SQLException;

import com.capitaworld.api.common.lib.model.reverse_api.sanction_disbursed.RequiredDetailRequest;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface AuditLogDetailService {

	public String getAudit(RequiredDetailRequest requiredDetailRequest) throws JsonProcessingException , SQLException ;
}
