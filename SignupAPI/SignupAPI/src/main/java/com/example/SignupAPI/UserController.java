package com.example.SignupAPI;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/Signup")
	public String  check(@ModelAttribute User user){
		boolean checkusername=userservice.checkusername(user.getUsername(), user.getPassword());
		if (checkusername) {
			return "redirect:/Login.html";
		}else {
			return "redirect:/Signup.html";
		}
	}

	@PostMapping("/Login")
	public String  Login(@ModelAttribute User user){
		boolean checkusername=userservice.CheckLogindetails(user.getUsername(), user.getPassword());
		if (checkusername) {
			return "redirect:/index.html";
		}else {
			return "redirect:/Login.html";
		}
	}
}
