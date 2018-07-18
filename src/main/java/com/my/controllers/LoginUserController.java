package com.my.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginUserController {
	
	@RequestMapping(value="/loginUser")
	public String userLogin() {
		
		System.out.println("user login .........");
		
		return "";
	}

}
