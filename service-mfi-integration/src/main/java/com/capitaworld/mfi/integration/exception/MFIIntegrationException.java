package com.capitaworld.mfi.integration.exception;

import org.springframework.http.HttpStatus;

public class MFIIntegrationException extends RuntimeException {
	private static final long serialVersionUID = 7628658109427774183L;

	private HttpStatus httpStatus;

	public MFIIntegrationException(String message, Throwable cause) {
		super(message, cause);
	}

	public MFIIntegrationException(String message) {
		super(message);
	}

	public MFIIntegrationException(Throwable cause) {
		super("Exception occured", cause);
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public MFIIntegrationException setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
		return this;
	}

	@Override
	public String toString() {
		return "MFIIntegrationException [httpStatus=" + httpStatus + ", message=" + getMessage() + "]";
	}
}
