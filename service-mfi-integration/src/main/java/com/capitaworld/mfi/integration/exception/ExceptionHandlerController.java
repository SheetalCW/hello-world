package com.capitaworld.mfi.integration.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handle exceptions globally
 * 
 * @author dharmendra.chudasama
 */
@ControllerAdvice // ("com.capitaworld.service.ekyc.controller")
@RestController
public class ExceptionHandlerController {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@ExceptionHandler(value = MFIIntegrationException.class)
	public ResponseEntity<String> handleRetailException(MFIIntegrationException ex) {
		logger.error("Error occured", ex);
		HttpStatus httpStatus = ex.getHttpStatus();
		if (httpStatus == null)
			httpStatus = HttpStatus.OK;
		return new ResponseEntity<>(ex.getMessage(), httpStatus);
	}

	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception ex) {
		logger.error("Error occured", ex);
		return ex.getClass().getSimpleName() + ": " + ex.getMessage();
	}

}