package com.vijju.springjpademo.exception;

public class ResourceNotFoundException extends RuntimeException {

	
	public ResourceNotFoundException(String message){
		super(message);
	}
}
