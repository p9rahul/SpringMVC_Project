package com.mycontrol.test;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class GlobalExceptionHandlerMethod {

	@ExceptionHandler(value = IOException.class)
	public String handleIoException(Exception e){
		
		System.out.println("IO exception occured" + e);
		return "IOException";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e){
		
		System.out.println("Exception occured" + e);
		return "Exception";
	}
}
