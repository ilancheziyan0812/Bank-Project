package com.simplebankproject;

public class InvalidBalanceException extends RuntimeException {
	
	private String message;

	public InvalidBalanceException(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage()
	{
		return message;
	}

}
