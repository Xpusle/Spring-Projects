package com.userAuthencation.userAuthencation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/login")
	public ResponseEntity<String> Login(@RequestParam("username") String username,@RequestParam("password") String password){
		boolean arecorrect=userservice.checkuser(username, password);
		if(arecorrect) {
			return ResponseEntity.ok("login sucessfully");
		}
		return ResponseEntity.ok("Worng Details please eneter once more 🤦‍♂️");
	}
}
