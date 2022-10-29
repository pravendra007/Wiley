package com.demo.SpringBoot2.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class BookNotFoundException extends Exception {
	
	public BookNotFoundException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
