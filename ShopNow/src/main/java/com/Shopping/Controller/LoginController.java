package com.Shopping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Shopping.Exceptions.LoginException;
import com.Shopping.Model.CurrentUserSession;
import com.Shopping.Model.Login;
import com.Shopping.Services.LoginServices;

@RestController
public class LoginController {

	@Autowired
	private LoginServices lservices;
	
	@PostMapping("/sellerLogin")
	public ResponseEntity<CurrentUserSession> sellerLogin(@RequestBody Login login) throws LoginException{
		
		CurrentUserSession cus= lservices.sellerlogin(login);
		
		return new ResponseEntity<CurrentUserSession>(cus,HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/customerLogin")
	public ResponseEntity<CurrentUserSession> customerLogin(@RequestBody Login login) throws LoginException{
		
		CurrentUserSession cus= lservices.customerlogin(login);
		
		return new ResponseEntity<CurrentUserSession>(cus,HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/adminLogin")
	public ResponseEntity<CurrentUserSession> adminLogin(@RequestBody Login login) throws LoginException{
		
		CurrentUserSession cus= lservices.adminlogin(login);
		
		return new ResponseEntity<CurrentUserSession>(cus,HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/Logout")
	public ResponseEntity<String> Logout(@RequestParam Integer id,@RequestParam String key) throws LoginException{
		
		String message= lservices.Logout(id, key);
		
		return new ResponseEntity<String>(message,HttpStatus.ACCEPTED);
	}
	
}
