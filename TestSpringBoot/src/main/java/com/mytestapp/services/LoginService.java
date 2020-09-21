package com.mytestapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytestapp.beans.LoginUser;
import com.mytestapp.entity.Login;
import com.mytestapp.respository.LoginRespository;

@Service
public class LoginService {
	  @Autowired
	  LoginRespository loginRespository;
	
	public String validateUSer(LoginUser loginUser) {
		
		List<Login> list = loginRespository.validateUSer(loginUser.getUsername(),loginUser.getPassword());
		
		for(Login details : list) {
			
			if(loginUser.getUsername().equals(details.getUsername())) {
				
				if(loginUser.getPassword().equals(details.getPassword())) {
					
					return "username and password are valid..Pleae process!!";
				}
				
				return "user is valid but password is not matched,,";
			}
			
		}
				
		return "We don't have user details in DB";
	}

}
