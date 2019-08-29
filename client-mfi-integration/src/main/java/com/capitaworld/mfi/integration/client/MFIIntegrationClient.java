package com.capitaworld.mfi.integration.client;

/**
 * @author dharmendra.chudasama
 * @deprecated after added in service module
 */
public class MFIIntegrationClient {
	/*
	 * 
	 * private String integrationBaseUrl; private RestTemplate restTemplate;
	 * 
	 *//**
		 * Improved constructor which can replace {{@link #SidbiIntegrationClient(int)}}
		 * and {@link #setIntegrationBaseUrl(String)}
		 * 
		 * @param restTemplate
		 * @param integrationBaseUrl
		 * @author dharmendra.chudasama
		 */
	/*
	 * public MFIIntegrationClient(RestTemplate restTemplate, String
	 * integrationBaseUrl) { this.restTemplate = restTemplate;
	 * this.integrationBaseUrl = integrationBaseUrl; }
	 * 
	 * @Deprecated //for test only public MFIIntegrationClient(int
	 * sidbiPushPullApiRequestTimeout) { this.restTemplate = new RestTemplate();
	 * SimpleClientHttpRequestFactory factory = (SimpleClientHttpRequestFactory)
	 * restTemplate.getRequestFactory();
	 * factory.setConnectTimeout(sidbiPushPullApiRequestTimeout * 1000);
	 * factory.setReadTimeout(Integer.valueOf(sidbiPushPullApiRequestTimeout) *
	 * 1000); }
	 * 
	 * 
	 * public String getToken(GenerateTokenRequest generateTokenRequest, Integer
	 * langCode) throws UnsupportedEncodingException, JsonProcessingException,
	 * GeneralSecurityException{ String url =
	 * integrationBaseUrl.concat(CommonConstants.URL_GET_TOKEN);
	 * 
	 * ResponseEntity<String> responseEntity = restTemplate.exchange(url,
	 * HttpMethod.POST, getHttpHeader(generateTokenRequest, null, langCode),
	 * String.class); if(responseEntity.getHeaders().getFirst("is_valid_token") ==
	 * null) { throw new
	 * SidbiIntegrationException("Unable to fetch token: "+responseEntity.getBody())
	 * ; } return responseEntity.getBody();
	 * 
	 * }
	 * 
	 * public String setTokenAsExpired(GenerateTokenRequest generateTokenRequest,
	 * Integer langCode)throws UnsupportedEncodingException,
	 * JsonProcessingException, GeneralSecurityException { String url =
	 * integrationBaseUrl.concat(CommonConstants.URL_SET_TOKEN_AS_EXPIRED);
	 * 
	 * return restTemplate.exchange(url, HttpMethod.POST,
	 * getHttpHeader(generateTokenRequest, generateTokenRequest, langCode),
	 * String.class).getBody(); }
	 * 
	 * private HttpEntity<Object> getHttpHeaderWithRequiredDetail(Object request,
	 * GenerateTokenRequest generateTokenRequest, Integer langCode,
	 * RequiredDetailRequest requiredDetailRequest) throws JsonProcessingException,
	 * UnsupportedEncodingException, GeneralSecurityException { HttpHeaders headers
	 * = new HttpHeaders(); headers.set("req_auth", "true");
	 * headers.setContentType(MediaType.TEXT_PLAIN); headers.set("token",
	 * generateTokenRequest.getToken());
	 * 
	 * if (generateTokenRequest.getBankToken() != null) { headers.set("banktoken",
	 * generateTokenRequest.getBankToken()); }
	 * 
	 * if (CommonUtils.isObjectNullOrEmpty(request)) { return new
	 * HttpEntity<>(request, headers); } if (requiredDetailRequest != null) {
	 * headers.set("requiredDetailRequest",MultipleJSONObjectHelper.
	 * getStringfromObject(requiredDetailRequest)); }
	 * 
	 * request = MultipleJSONObjectHelper.getEncryptedStringfromObject(request,
	 * langCode);
	 * 
	 * return new HttpEntity<>(request, headers); }
	 * 
	 * private HttpEntity<Object> getHttpHeader(Object request, GenerateTokenRequest
	 * generateTokenRequest , Integer langCode) throws UnsupportedEncodingException,
	 * JsonProcessingException, GeneralSecurityException{ HttpHeaders headers = new
	 * HttpHeaders(); headers.set("req_auth", "true");
	 * headers.setContentType(MediaType.TEXT_PLAIN);
	 * 
	 * if(generateTokenRequest != null) { headers.set("token",
	 * generateTokenRequest.getToken());
	 * 
	 * if (generateTokenRequest.getBankToken() != null) headers.set("banktoken",
	 * generateTokenRequest.getBankToken()); }
	 * 
	 * if (CommonUtils.isObjectNullOrEmpty(request)) { return new
	 * HttpEntity<>(request, headers); } request =
	 * MultipleJSONObjectHelper.getEncryptedStringfromObject(request, langCode);
	 * 
	 * return new HttpEntity<>(request, headers); }
	 */}
