package com.examples.microserv.psp.service.util;

public enum CustomCode {

	 SUCCESS(2000L), 
	 ERRORONPROCESSINGREQUEST(2001L), 
	 RECORDNOTFOUND(2002L),
	 FAILTODELETE(2003L);
	 
	 private Long code;
	 
    CustomCode(Long code) {
        this.code = code;
    }
 
    public Long getCode() {
        return code;
    }
}
