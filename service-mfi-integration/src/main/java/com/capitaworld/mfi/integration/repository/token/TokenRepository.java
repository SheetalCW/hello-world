package com.capitaworld.mfi.integration.repository.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.capitaworld.mfi.integration.domain.token.TokenDetail;

public interface TokenRepository extends JpaRepository<TokenDetail, Long> {

	@Query(value = "select td from TokenDetail td WHERE td.token =:token AND td.isExpired = 0 AND td.isActive = 1 and td.applicationId =:applicationId")
	public TokenDetail getTokenByApplicationId(@Param("token") String tokenString,
			@Param("applicationId") Long applicationId);

	@Transactional(noRollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
	@Modifying
	@Query("UPDATE TokenDetail td SET td.isExpired = true , td.isActive = false , td.modifiedDate = SYSDATE() WHERE td.applicationId =:applicationId AND td.isActive = true ")
	public void inActive(@Param("applicationId") Long applicationId);

	@Transactional(noRollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
	@Modifying
	@Query("UPDATE TokenDetail td SET td.isExpired = true , td.isActive = false ,  td.modifiedDate = SYSDATE() WHERE td.token =:token  AND  td.isActive = true  ") // AND
																																									// isActive
																																									// =
																																									// false
																																									// ")
	public void updateTokenAsExpired(@Param("token") String tokenString);
}
