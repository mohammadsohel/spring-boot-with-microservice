package com.sohel.Enum;

public enum Message {
	
	MESSAGE(102,"save successfully"),
	ERRORMESSAGE(103,"save not successfully");
	private Integer exceptionCode;
	
	private String exceptionMessage;
	
	
	
 Message(Integer exceptionCode, String exceptionMessage)
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

	
	
	

}
