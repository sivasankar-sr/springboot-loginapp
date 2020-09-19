package com.mytestapp.services;

import org.springframework.stereotype.Service;

import com.mytestapp.beans.LoginUser;

@Service
public class LoginService {
	
	
	
	public String validateUSer(LoginUser loginUser) {
		
		if(loginUser.getUsername().equals("siva") && loginUser.getPassword().equals("ujjwala")) {
			
			return "Dear "+loginUser.getUsername()+" your are valid customer";
		}
		
		return "We don't have user details in DB";
	}

}
