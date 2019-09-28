package com.sohel.exception;

public class GenericException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer exceptionCode;

	private String exceptionMessage;
	
	
	
	public GenericException(Integer exceptionCode,String exceptionMessage)
	{
		this.exceptionCode=exceptionCode;
		this.exceptionMessage=exceptionMessage;
	}
	

	public Integer getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(Integer exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}



}
