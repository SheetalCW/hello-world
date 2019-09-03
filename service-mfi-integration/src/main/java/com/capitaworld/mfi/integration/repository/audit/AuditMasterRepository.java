package com.capitaworld.mfi.integration.repository.audit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitaworld.mfi.integration.domain.common.AuditMaster;

public interface AuditMasterRepository extends JpaRepository<AuditMaster, Long> {

	public List<AuditMaster> findByApplicationId(Long applicationId);
}
