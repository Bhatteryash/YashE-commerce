package com.Shopping.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(AddressException.class)
	public ResponseEntity<MyErrorDetails> AddressException(AddressException ad,WebRequest wrq){
		
		MyErrorDetails err=new MyErrorDetails();
		err.setLocaldateTime(LocalDateTime.now());
		err.setMessage(ad.getMessage());
		err.setDescription(wrq.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(CardException.class)
	public ResponseEntity<MyErrorDetails> CardException(CardException ad,WebRequest wrq){
		
		MyErrorDetails err=new MyErrorDetails();
		err.setLocaldateTime(LocalDateTime.now());
		err.setMessage(ad.getMessage());
		err.setDescription(wrq.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(CartException.class)
	public ResponseEntity<MyErrorDetails> CartException(CartException ad,WebRequest wrq){
		
		MyErrorDetails err=new MyErrorDetails();
		err.setLocaldateTime(LocalDateTime.now());
		err.setMessage(ad.getMessage());
		err.setDescription(wrq.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<MyErrorDetails> CustomerException(CustomerException ad,WebRequest wrq){
		
		MyErrorDetails err=new MyErrorDetails();
		err.setLocaldateTime(LocalDateTime.now());
		err.setMessage(ad.getMessage());
		err.setDescription(wrq.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(LoginException.class)
	public ResponseEntity<MyErrorDetails> LoginException(LoginException ad,WebRequest wrq){
		
		MyErrorDetails err=new MyErrorDetails();
		err.setLocaldateTime(LocalDateTime.now());
		err.setMessage(ad.getMessage());
		err.setDescription(wrq.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(OrderException.class)
	public ResponseEntity<MyErrorDetails> OrderException(OrderException ad,WebRequest wrq){
		
		MyErrorDetails err=new MyErrorDetails();
		err.setLocaldateTime(LocalDateTime.now());
		err.setMessage(ad.getMessage());
		err.setDescription(wrq.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<MyErrorDetails> ProductException(ProductException ad,WebRequest wrq){
		
		MyErrorDetails err=new MyErrorDetails();
		err.setLocaldateTime(LocalDateTime.now());
		err.setMessage(ad.getMessage());
		err.setDescription(wrq.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(SellerException.class)
	public ResponseEntity<MyErrorDetails> SellerException(SellerException ad,WebRequest wrq){
		
		MyErrorDetails err=new MyErrorDetails();
		err.setLocaldateTime(LocalDateTime.now());
		err.setMessage(ad.getMessage());
		err.setDescription(wrq.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_GATEWAY);
	}
}
