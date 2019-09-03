package com.capitaworld.mfi.integration.service.token.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capitaworld.api.common.lib.model.common.GenerateTokenRequest;
import com.capitaworld.api.common.lib.utils.CommonUtils;
import com.capitaworld.mfi.integration.domain.token.TokenDetail;
import com.capitaworld.mfi.integration.repository.token.TokenRepository;
import com.capitaworld.mfi.integration.service.token.TokenService;


@Service
@Transactional
public class TokenServiceImpl implements TokenService {

	private static final Logger logger = LoggerFactory.getLogger(TokenServiceImpl.class);

	@Autowired
	private TokenRepository tokenRepository;

	@Value("${capitaworld.mfi.integration.token.expire.time}")
	private Long tokenExpireTime;

	@Override
	public String getToken(GenerateTokenRequest generateTokenRequest) {
		logger.info("=================Enter in getToken() ======================== applicationId ==> {} " ,   generateTokenRequest.getApplicationId());
		String token = null;
		if (!CommonUtils.isObjectNullOrEmpty(generateTokenRequest.getApplicationId())
				&& !CommonUtils.isObjectNullOrEmpty(generateTokenRequest.getPassword())) {
			logger.info("-------------------Start Generating token  --------------------");
			token = CommonUtils.generateToken(generateTokenRequest.getApplicationId(),
					generateTokenRequest.getPassword());
			logger.info("------------------End Generating token ---------------------");
			if (!CommonUtils.isObjectNullOrEmpty(token)) {
				generateTokenRequest.setToken(token);
				logger.info("--------------------- Saving... Generated token ----------------------");
				saveToken(generateTokenRequest);
				logger.info("-------------------- Successfully saved Generated token --------------------");
			}
		}
		logger.info("=================Exist from  getToken() ======================");
		return token;

	}

	public void saveToken(GenerateTokenRequest generateTokenRequest) {
		logger.info("=================Enter in saveToken()  ======================");
		tokenRepository.inActive(generateTokenRequest.getApplicationId());
		TokenDetail tokenDetail = new TokenDetail();
		tokenDetail.setApplicationId(generateTokenRequest.getApplicationId());
		tokenDetail.setCreatedDate(new Date());
		tokenDetail.setIsExpired(false);
		tokenDetail.setToken(generateTokenRequest.getToken());
		tokenDetail.setIsActive(true);
		tokenRepository.save(tokenDetail);
		logger.info(
				"=================Exist from saveToken()  ======================  tokenDetail ==> {} " , tokenDetail);

	}

	@Override
	public String checkTokenExpiration(String tokenString,Long applicationId) {
		logger.info("=================Enter in checkTokenExpiration() ====================== applicationId ==>{} ", applicationId);
		System.out.println(tokenExpireTime);
		TokenDetail tokenDetail = tokenRepository.getTokenByApplicationId(tokenString,applicationId);
		if (tokenDetail == null) {
			logger.info("No Token Details FOund FOr token=====>{}",tokenString);
			return null;
		}
		Long dateDifference = CommonUtils.getDateDifference(tokenDetail.getCreatedDate(), new Date(), CommonUtils.DateDiffType.MINUTES);
		logger.info("Date Diff in Minutes-=====>{}",dateDifference);
		logger.info("Token Expiry Time-=====>{}",tokenExpireTime);
		
		if (dateDifference > tokenExpireTime) {
			logger.info("-------------------token is expired . Start saving... checkTokenExpiration() ------------------------");
			tokenRepository.updateTokenAsExpired(tokenString);
			logger.info("-------------------End Successfully  update expired token... checkTokenExpiration()  ------------------------");
			return null;
		}
		logger.info("=================Exist from checkTokenExpiration() ====================== ");
		return tokenDetail.getToken();
	}

	@Override
	public Boolean setTokenAsExpired(GenerateTokenRequest generateTokenRequest) {
		logger.info("=================Enter in setTokenAsExpired ====================== ");

		logger.info(
				"-------------------token is expired . Start saving... checkTokenExpiration()  ------------------------");
		tokenRepository.inActive(generateTokenRequest.getApplicationId());
		logger.info(
				"-------------------End Successfully  update expired token... checkTokenExpiration()  ------------------------");

		logger.info("=================Exist from setTokenAsExpired () ====================== ");
		return true;
	}

}
