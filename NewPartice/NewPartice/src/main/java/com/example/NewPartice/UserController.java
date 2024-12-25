package com.example.NewPartice;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/login")
	public String check(@ModelAttribute User user){
		boolean checkuser=userservice.CheckUserThenAllowThem(user.getUsername(),user.getPassword());
		if(checkuser) {
			return "redirect:/sidd.html";
		}else {
			return "redirect:/login.html";
		}
	}
}
