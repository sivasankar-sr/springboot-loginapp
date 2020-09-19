package com.mytestapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytestapp.beans.LoginUser;
import com.mytestapp.services.LoginService;

@RestController
@RequestMapping("/login")
public class MyController {

	@Autowired
	LoginUser loginUser;
	@Autowired
	LoginService loginService;

	@GetMapping("/validateUser")
	public String VerifyUsers(@RequestBody LoginUser loginUser) {
		if (loginUser.getUsername().length()>0 && loginUser.getPassword().length()>0) {
			 return loginService.validateUSer(loginUser);
		}
		return "please enter your name and password";
	}

}
