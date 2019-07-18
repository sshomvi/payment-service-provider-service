package com.examples.microserv.psp.service.util;

public class CustomResponse {

	public Object content;
	
	public Long statusCode;
	
	public String codeDescription;

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public Long getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}

	public String getCodeDescription() {
		return codeDescription;
	}

	public void setCodeDescription(String codeDescription) {
		this.codeDescription = codeDescription;
	}

	public CustomResponse(Object content, Long statusCode, String codeDescription) {
		super();
		this.content = content;
		this.statusCode = statusCode;
		this.codeDescription = codeDescription;
	}
	
	public CustomResponse(Object content, Long statusCode) {
		super();
		this.content = content;
		this.statusCode = statusCode;
	}
	
	
	
}
