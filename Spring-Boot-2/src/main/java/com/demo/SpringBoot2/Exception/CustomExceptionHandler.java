package com.demo.SpringBoot2.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
public class CustomExceptionHandler {
	
	@ExceptionHandler(value=BookNotFoundException.class)
	public ResponseEntity<ExceptionResponse> customExceptionHandler(BookNotFoundException bookNotFoundException,WebRequest wr){
		ExceptionResponse er = new ExceptionResponse(new Date(),bookNotFoundException.getMessage(),wr.getDescription(false));
		return new ResponseEntity<ExceptionResponse>(er,HttpStatus.NOT_FOUND);
	}
}
