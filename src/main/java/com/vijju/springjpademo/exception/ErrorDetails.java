package com.vijju.springjpademo.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorDetails {
	
	
	private Date timeStamp;
	private String message;
	private String details;

}
