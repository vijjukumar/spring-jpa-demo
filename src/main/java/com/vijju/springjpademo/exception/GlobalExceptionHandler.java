package com.vijju.springjpademo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	//handle specific exceptions
	@ExceptionHandler
	public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException resourceNotFoundException) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(),resourceNotFoundException.getMessage(),"");
	
		return new ResponseEntity(errorDetails,HttpStatus.NOT_FOUND);
	}
	
}
