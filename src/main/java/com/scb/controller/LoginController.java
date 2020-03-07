package com.scb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.scb.service.LoginService;


@Controller
public class LoginController {
	@Autowired
	LoginService loginservice=null;
		@GetMapping("/login")
		public String login() {
			return "login";
		}
		
		@GetMapping("/loginaction") 
		  public String loginaction(@RequestParam("uname") String uname,@RequestParam("pwd") String pwd) { 
			  System.out.println("username: "+uname +" & password: "+pwd);
			boolean  status=loginservice.loginaction(uname,pwd);
			if(status==true) {
				System.out.println("Login successful");
				return "registration";
			}
			else {
				System.out.println("Login failure Please try Again");
				return "loginfailure";
			}
		}
}
