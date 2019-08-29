package com.capitaworld.mfi.integration.service.token;

import com.capitaworld.api.common.lib.model.common.GenerateTokenRequest;

public interface TokenService {
	public String getToken(GenerateTokenRequest generateTokenRequest);
	
	public String checkTokenExpiration(String tokenString,Long applicationId); 
	
	public Boolean setTokenAsExpired(GenerateTokenRequest generateTokenRequest) ;
}
