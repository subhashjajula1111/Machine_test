package com.mohit.RESTAPI.exception;

public class InvalidOrderByException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public InvalidOrderByException() {
		super();
		
	}

	public InvalidOrderByException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public InvalidOrderByException(String message) {
		super(message);
		
	}

	public InvalidOrderByException(Throwable cause) {
		super(cause);
		

}}
