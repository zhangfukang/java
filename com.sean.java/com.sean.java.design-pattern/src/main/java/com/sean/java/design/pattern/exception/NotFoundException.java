package com.sean.java.design.pattern.exception;

public class NotFoundException extends Exception {

	private static final long serialVersionUID = 5701476198476870767L;
	
	
	private String errorMsg;

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	public NotFoundException(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
