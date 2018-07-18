package com.my.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewUserController {
	
	@RequestMapping(value="/newUser")
	public String newUserRegistration() {
		
		
		System.out.println("new user classss ");
		return "Login.jsp";
	}

}
