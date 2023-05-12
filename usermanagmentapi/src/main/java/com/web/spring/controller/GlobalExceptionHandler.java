package com.web.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.web.spring.excption.ErrorResponse;
import com.web.spring.excption.UserNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleUserNotFoundExcption(UserNotFoundException ex) {
		
		ErrorResponse errorResponse =new ErrorResponse();
		errorResponse.setErrorCode(HttpStatus.NOT_FOUND.value());
		errorResponse.setErrorMessage(ex.getMsg());
		
	return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.OK);
		
	}

}
