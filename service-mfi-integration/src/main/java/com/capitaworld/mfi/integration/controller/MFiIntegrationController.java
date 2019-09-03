package com.capitaworld.mfi.integration.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capitaworld.api.common.lib.ecryption.AESEncryptionUtilitySBI;
import com.capitaworld.api.common.lib.model.common.AuthRequest;
import com.capitaworld.api.common.lib.model.common.GenerateTokenRequest;
import com.capitaworld.api.common.lib.model.reverse_api.sanction_disbursed.RequiredDetailRequest;
import com.capitaworld.api.common.lib.utils.MultipleJSONObjectHelper;
import com.capitaworld.mfi.integration.api.api_url_and_constants.CommonConstants;
import com.capitaworld.mfi.integration.api.api_url_and_constants.MFIApiBaseUrl;
import com.capitaworld.mfi.integration.api.model.eligibility.EligibilityDetailsRequest;
import com.capitaworld.mfi.integration.api.model.matches.MatchesParameterRequest;
import com.capitaworld.mfi.integration.api.model.oneform.OneFormRequest;
import com.capitaworld.mfi.integration.api.model.scoring.ScoreParameterDetailsRequest;
import com.capitaworld.mfi.integration.config.AuditComponent;
import com.capitaworld.mfi.integration.exception.MFIIntegrationException;
import com.capitaworld.mfi.integration.service.audit.AuditLogDetailService;
import com.capitaworld.mfi.integration.service.eligibility.EligibilityService;
import com.capitaworld.mfi.integration.service.matches.MatchesService;
import com.capitaworld.mfi.integration.service.oneform.OneFormService;
import com.capitaworld.mfi.integration.service.scoring.ScoreParameterDetailsService;
import com.capitaworld.mfi.integration.service.token.TokenService;
import com.capitaworld.mfi.integration.utils.CommonUtils;




@RestController
public class MFiIntegrationController {

	private static final Logger logger = LoggerFactory.getLogger(MFiIntegrationController.class);

	@Autowired
	private TokenService tokenService;

	@Autowired
	private OneFormService oneFormService;
	
	@Autowired
	private EligibilityService eligibilityService;
	
	@Autowired
	private ScoreParameterDetailsService scoreParameterDetailsService;
	
	@Autowired
	private MatchesService matchesService;

	@Autowired
	private Environment environment;

	@Autowired
	private AuditComponent auditComponent;

	private static final String TOKEN = "token";
	private static final String TOKEN_IS_NULL = "Token is null";

	public static final String CURRENT_API_VERSION = CommonConstants.CURRENT_API_VERSION;

	private static final String TOKEN_EXPIRED = "Token is Expired";
	private static final String APPLICATION_EMPTY_MSG = "ApplicationId is null or empty ";
	private static final String UNAUTHORIZED = "Invalid bank username and password";
	private static final String EMPTY_DATA_FOUND = "Empty Data Found !!";
	private static final String EXCEPTION = "Error while Descrypt or Converting String to Object MSG ==> {} ";
	private static final String REQUIRED_DETAIL_REQ_HEADER_KEY = "requiredDetailRequest";

	@Value("${capitaworld.mfi.integration.username}") private String usertName;
	@Value("${capitaworld.mfi.integration.password}") private String password;

	@Autowired private AuditLogDetailService auditLogDetailService;

	@GetMapping(value = MFIApiBaseUrl.PING)
	public String getPing() {
		logger.info("Ping success");
		return CommonConstants.CURRENT_API_VERSION + " Ping Succeed ";
	}

	@GetMapping(value = MFIApiBaseUrl.LOG_FILE, produces = MediaType.MULTIPART_FORM_DATA_VALUE)
	public void logFile(HttpServletRequest httpServletRequest, HttpServletResponse response) {

		/**
		 * String tokenString =httpServletRequest.getHeader(TOEKN);
		 * if(CommonUtils.isObjectNullOrEmpty(tokenString)) {
		 * httpServletRequest.setAttribute("res",CommonUtils.CURRENT_API_VERSION
		 * .concat(" Token is null ")); }
		 * if(CommonUtils.isObjectNullOrEmpty(tokenService.checkTokenExpiration(tokenString,-1l)))
		 * {
		 * 
		 * httpServletRequest.setAttribute("res",CommonUtils.CURRENT_API_VERSION
		 * .concat("Token is Expired")); }
		 */

		File file = new File(environment.getProperty("logging.path") + "service-sidbi-integration.log");

		try {
			if (!file.exists()) {
				file = new File("./nohup.log");
			}
		} catch (Exception e) {
			logger.info("Ecpotion MSG ==> {} ", e);
		}
		if (file.exists()) {
			// get the mimetype
			String mimeType = URLConnection.guessContentTypeFromName(file.getName());
			if (mimeType == null) {
				// unknown mimetype so set the mimetype to application/octet-stream
				mimeType = "application/octet-stream";
			}
			response.setContentType(mimeType);
			/**
			 * In a regular HTTP response, the Content-Disposition response header is a
			 * header indicating if the content is expected to be displayed inline in the
			 * browser, that is, as a Web page or as part of a Web page, or as an
			 * attachment, that is downloaded and saved locally.
			 * 
			 */
			/**
			 * Here we have mentioned it to show inline
			 */
			response.setHeader("Content-Disposition", String.format("inline; filename=\"" + file.getName() + "\""));
			/**
			 * Here we have mentioned it to show as attachment
			 * response.setHeader("Content-Disposition", String.format("attachment;
			 * filename=\"" + file.getName() + "\""));
			 */
			response.setContentLength((int) file.length());
			InputStream inputStream;
			try {
				inputStream = new BufferedInputStream(new FileInputStream(file));
				FileCopyUtils.copy(inputStream, response.getOutputStream());
			} catch (IOException e) {
				logger.error("Error/Exception while dowload excel fiel MSG ==> {} ", e);

			} /**
				 * finally {
				 * 
				 * inputStream.close();
				 * 
				 * }
				 */
		}
	}

	@PostMapping(value = MFIApiBaseUrl.SAVE_ONE_FORM_DETAILS)
	public String saveOneFormDetails(@RequestBody String encryptedString, HttpServletRequest httpServletRequest) {

		String reason = null;
		Boolean isSuccess = false;
		logger.info("Application Id in Save saveOneFormDetails =============>");
		Long applicationId = null;

		try {
			OneFormRequest oneFormRequest = verifyToken(httpServletRequest, encryptedString, OneFormRequest.class);
			String errMsg = oneFormService.saveOneFormInfo(oneFormRequest);
			isSuccess = errMsg == null;
			logger.info("saveOneFormDetails==========> res ==> {} ", isSuccess);

			return CommonConstants.CURRENT_API_VERSION + isSuccess;
		} catch (MFIIntegrationException e) {
			reason = MultipleJSONObjectHelper.getStackTrace(e);
			throw e;

		} catch (Exception e) {
			String exp = MultipleJSONObjectHelper.getStackTrace(e);
			logger.info("Error while Saving saveOneFormDetails=====> {} MSG ==> {} ", e);
			reason = "Error while Saving saveOneFormDetails=====> Exception ==> Msg==> " + exp;

			return CommonConstants.CURRENT_API_VERSION + reason;
		} finally {
			auditComponent.updateAudit(encryptedString, AuditComponent.SAVE_ONE_FORM_DETAILS, applicationId, -1L, reason, isSuccess);
		}
	}
	
	@PostMapping(value = MFIApiBaseUrl.SAVE_ELIGIBILITY_DETAILS)
	public String saveEligibilityDetails(@RequestBody String encryptedString, HttpServletRequest httpServletRequest) {

		String reason = null;
		Boolean isSuccess = false;
		logger.info("Application Id in Save saveEligibilityDetails =============>");
		Long applicationId = null;

		try {
			EligibilityDetailsRequest eligibilityRequest = verifyToken(httpServletRequest, encryptedString, EligibilityDetailsRequest.class);
			String errMsg = eligibilityService.saveEligibilityInfo(eligibilityRequest);
			isSuccess = errMsg == null;
			logger.info("saveEligibilityDetails==========> res ==> {} ", isSuccess);

			return CommonConstants.CURRENT_API_VERSION + isSuccess;
		} catch (MFIIntegrationException e) {
			reason = MultipleJSONObjectHelper.getStackTrace(e);
			throw e;

		} catch (Exception e) {
			String exp = MultipleJSONObjectHelper.getStackTrace(e);
			logger.info("Error while Saving saveEligibilityDetails=====> {} MSG ==> {} ", e);
			reason = "Error while Saving saveEligibilityDetails=====> Exception ==> Msg==> " + exp;

			return CommonConstants.CURRENT_API_VERSION + reason;
		} finally {
			auditComponent.updateAudit(encryptedString, AuditComponent.ELIGIBILITY, applicationId, -1L, reason, isSuccess);
		}
	}
	
	@PostMapping(value = MFIApiBaseUrl.SAVE_MATCHES_PARAMETER, consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveMatchesParameter(@RequestBody String encryptedString , HttpServletRequest httpServletRequest) {
		logger.info("Enter in saveMatchesParameter()  -----------------> ");
		MatchesParameterRequest matchesParameterRequest = null;
		String reason = null;
		Boolean isSuccess = false;
		Long applicationId = null;
		try {
			matchesParameterRequest = verifyToken(httpServletRequest, encryptedString, MatchesParameterRequest.class);
			logger.info("Start Saving MatchesParameter in saveMatchesParameter() ------------------APPID-----> {} "  ,  applicationId);
			String errMsg = matchesService.saveMatchesParameter(matchesParameterRequest);
			isSuccess = errMsg == null;
			logger.info("Successully Saving MatchesParameter in saveMatchesParameter() ------------------APPID-----> {} ",  applicationId);
			
			return new ResponseEntity<>(CURRENT_API_VERSION + isSuccess, HttpStatus.OK);
		} catch (MFIIntegrationException  e) {
			reason = MultipleJSONObjectHelper.getStackTrace(e);
			throw e;
		} catch (Exception e) {
			String exp = MultipleJSONObjectHelper.getStackTrace(e);
			logger.info("Exception while  Saving MatchesParameter in saveMatchesParameter() -----------------Msg----> {} " , e);
			reason = "Exception while  Saving BMatchesParameter  -----------------Msg---->" + exp;
			
			return new ResponseEntity<>(CURRENT_API_VERSION + reason, HttpStatus.OK);
		} finally {
			auditComponent.updateAudit( encryptedString , AuditComponent.MATCHES_PARAMETER, applicationId, -1L, reason, isSuccess);

		}
	}
	
	@PostMapping(value = MFIApiBaseUrl.SAVE_SCORING_DETAILS,  consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveScoringInfo(@RequestBody String encryptedString , HttpServletRequest httpServletRequest) {
		logger.info("Application Id in Save ScoringInfo =============>");	
		ScoreParameterDetailsRequest scoreParameterDetailsRequest = null;
		String reason = null;
		Boolean isSuccess = false;
		Long applicationId = null;
		try {
			scoreParameterDetailsRequest = verifyToken(httpServletRequest, encryptedString, ScoreParameterDetailsRequest.class);
			String errMsg = scoreParameterDetailsService.saveScoreParameterDetails(scoreParameterDetailsRequest);
			isSuccess = errMsg == null;
			logger.info("Scoring Details Parameters saved->");
			return new ResponseEntity<>(CURRENT_API_VERSION + isSuccess, HttpStatus.OK);
		} catch (MFIIntegrationException  e) {
			reason = MultipleJSONObjectHelper.getStackTrace(e);
			throw e;
		} catch (Exception e) {
			String exp = MultipleJSONObjectHelper.getStackTrace(e);
			logger.info("Error while Saving Scoring Details Info=====> {}" , e);
			
			reason = "Error while Saving Scoring Details Info=====> msg ==> {} " + exp;
			return new ResponseEntity<>(CURRENT_API_VERSION + reason, HttpStatus.OK);
		} finally {
			auditComponent.updateAudit( encryptedString ,AuditComponent.SCORING_DETAILS, applicationId, -1L, reason, isSuccess);
		}
	}
	
	@PostMapping(value = MFIApiBaseUrl.GET_TOKEN, produces = MediaType.TEXT_PLAIN_VALUE)
	public String getToken(@RequestBody String encryptedString , HttpServletResponse httpServletResponse) {
		GenerateTokenRequest  generateTokenRequest = null;
		String reason=null;
		Boolean isSuccess = false;
		Long applicationId= null;
		String decrypt =null;
		try {

			try {
				decrypt = AESEncryptionUtilitySBI.decrypt(encryptedString);
				
				generateTokenRequest = MultipleJSONObjectHelper.getObjectFromString(decrypt, GenerateTokenRequest .class);
			} catch (Exception e) {
				
				String exp = MultipleJSONObjectHelper.getStackTrace(e);
				logger.error("GenerateTokenRequest, Error while Decrypt or Converting String to Object in getToken MSG ==> {} " , e);
				reason = "MSG=> GenerateTokenRequest , Error while Decrypt or Converting String to Object in getToken() {} ====>  msg "+exp;
				return reason;
			}
			if(generateTokenRequest == null ||  !usertName.equals(generateTokenRequest.getUserName()) || !password.equals(generateTokenRequest.getPassword())) {
				return CURRENT_API_VERSION + UNAUTHORIZED;
			}
			applicationId = generateTokenRequest.getApplicationId();
			if (!CommonUtils.isEmpty(applicationId)) {
				String token = tokenService.getToken(generateTokenRequest);
				httpServletResponse.setHeader("is_valid_token", "true");
				isSuccess = true;
				return token;
			} else {
				reason="MSG=> ApplicationId must not be null in getToken() {} ====> ";
				return reason;
			}
//		} catch (MFIIntegrationException  e) {
//			reason = MultipleJSONObjectHelper.getStackTrace(e);
//			throw e;
		} catch (Exception e) {
			String exp = MultipleJSONObjectHelper.getStackTrace(e);
			logger.info("Error===> MSG==> {} ",e);
			reason = "MSG=> Exception while token Generation  in getToken() {} ====> MSg  "+exp ;
			return   reason;
			
		}finally {
			auditComponent.updateAudit( encryptedString , AuditComponent.GENERATING_TOKEN, applicationId, -1L, reason, isSuccess);
		}
	}

	
	@PostMapping(value = MFIApiBaseUrl.SET_TOKEN_AS_EXPIRED, produces = MediaType.TEXT_PLAIN_VALUE)
	public String setTokenAsExpired(@RequestBody String encryptedString , HttpServletRequest httpServletRequest) {
		GenerateTokenRequest  generateTokenRequest = null;
		String reason=null;
		Boolean isSuccess = false;
		Long applicationId= null;
		/**String decrypt =null;*/
		try {
			generateTokenRequest = verifyToken(httpServletRequest, encryptedString, GenerateTokenRequest.class);
			/**try {
				decrypt = AESEncryptionUtilitySBI.decrypt(encryptedString);
				
				generateTokenRequest = MultipleJSONObjectHelper.getObjectFromString(decrypt, GenerateTokenRequest .class);
			} catch (Exception e) {
				String exp = MultipleJSONObjectHelper.getStackTrace(e);
				logger.error("GenerateTokenRequest, Error while Decrypt or Converting String to Object in setTokenAsExpired() MSG ==> {} " , e);
				reason = "GenerateTokenRequest , Error while Decrypt or Converting String to Object in setTokenAsExpired() {} ====>  msg ==>"+exp;
				return reason;
			}*/
			applicationId = generateTokenRequest.getApplicationId() ;
			if (!CommonUtils.isEmpty(applicationId)) {
				isSuccess = tokenService.setTokenAsExpired(generateTokenRequest);
				return isSuccess.toString();
			} else {
				reason="ApplicationId must not be null in setTokenAsExpired() {} ====> ";
				return reason;
			}
			/*
			 * } catch (SidbiIntegrationException e) { reason =
			 * MultipleJSONObjectHelper.getStackTrace(e); throw e;
			 */
		} catch (Exception e) {
			String exp = MultipleJSONObjectHelper.getStackTrace(e);
			logger.info("Error===> MSG ==>{} ",e);
			reason = "Exception while token Generation  in setTokenAsExpired() {} ====> MSg  "+exp ;
			return   reason;
			
		}finally {
			auditComponent.updateAudit( encryptedString , AuditComponent.TOKEN_AS_EXPIRED, applicationId, -1L, reason, isSuccess);
		}
	}
	
	//=======================================================================================================
	private <T extends AuthRequest> T verifyToken(HttpServletRequest httpServletRequest, String encryptedRequestBody, Class<T> respClazz) {

		if (encryptedRequestBody == null) {
			throw new MFIIntegrationException(CommonConstants.CURRENT_API_VERSION + EMPTY_DATA_FOUND);
		}

		String tokenString = httpServletRequest.getHeader(TOKEN);
		if (CommonUtils.isEmpty(tokenString)) {
			MFIIntegrationException ex = new MFIIntegrationException(
					CommonConstants.CURRENT_API_VERSION + TOKEN_IS_NULL);
			ex.setHttpStatus(HttpStatus.UNAUTHORIZED);
			throw ex;
		}

		T retObj;
		try {
			String decrypt = AESEncryptionUtilitySBI.decrypt(encryptedRequestBody);
			retObj = MultipleJSONObjectHelper.getObjectFromString(decrypt, respClazz);
		} catch (Exception e) {
			throw new MFIIntegrationException(EXCEPTION, e);
		}

		Long applicationId = retObj.getApplicationId();

		if (applicationId == null) {
			throw new MFIIntegrationException(CommonConstants.CURRENT_API_VERSION + APPLICATION_EMPTY_MSG);
		}
//		if (!usertName.equals(retObj.getUserName()) || !password.equals(retObj.getPassword())) {
//			throw new MFIIntegrationException(CommonConstants.CURRENT_API_VERSION + UNAUTHORIZED);
//		}
		if (tokenService.checkTokenExpiration(tokenString, applicationId) == null) {
			MFIIntegrationException ex = new MFIIntegrationException(
					CommonConstants.CURRENT_API_VERSION + TOKEN_EXPIRED);
			ex.setHttpStatus(HttpStatus.UNAUTHORIZED);
			throw ex;
		}
		return retObj;
	}

	@PostMapping(value = MFIApiBaseUrl.GET_AUDIT, produces = MediaType.ALL_VALUE)
	public ResponseEntity<String> getAudit(HttpServletRequest httpServletRequest) {
		logger.info("========== Enter into getAudit()============ ");
		try {
			RequiredDetailRequest requiredDetailRequest = null;
			if (httpServletRequest.getHeader(REQUIRED_DETAIL_REQ_HEADER_KEY) != null) {
				String requiredDetail = httpServletRequest.getHeader(REQUIRED_DETAIL_REQ_HEADER_KEY);
				if (requiredDetail != null) {

					requiredDetailRequest = MultipleJSONObjectHelper.getObjectFromString(requiredDetail,
							RequiredDetailRequest.class);

					if (!usertName.equals(requiredDetailRequest.getUserName())
							|| !password.equals(requiredDetailRequest.getPassword())) {
						return new ResponseEntity<String>(CommonConstants.CURRENT_API_VERSION + UNAUTHORIZED,
								HttpStatus.UNAUTHORIZED);
					} else {
						String audit = auditLogDetailService.getAudit(requiredDetailRequest);
						return new ResponseEntity<>(CommonConstants.CURRENT_API_VERSION + audit, HttpStatus.OK);
					}
				}
			}
			return new ResponseEntity<>(CommonConstants.CURRENT_API_VERSION + "{}", HttpStatus.OK);

		} catch (Exception e) {

			String exp = MultipleJSONObjectHelper.getStackTrace(e);
			logger.info("Error while Saving  GET_AUDIT  Detail Info=====> MSG ==> {} ", e);
			return new ResponseEntity<>(CommonConstants.CURRENT_API_VERSION + exp, HttpStatus.OK);

		}

	}

}
