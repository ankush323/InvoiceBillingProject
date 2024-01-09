package com.ankush.Transaction.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;



@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
		ExceptionDetails  errorDetails = new ExceptionDetails(new Date(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(" some error at server" + errorDetails, HttpStatus.NOT_FOUND);
	}

}
