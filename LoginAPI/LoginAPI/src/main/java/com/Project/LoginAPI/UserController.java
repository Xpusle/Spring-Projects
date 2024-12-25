package com.Project.LoginAPI;

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
	public ResponseEntity<String> check(@ModelAttribute User user){
		boolean iscorrect=userservice.Checkdetails(user.getUsername(), user.getPassword());
		if(iscorrect) {
			return ResponseEntity.ok("welcome");
		}else {
			return ResponseEntity.ok("get out ");
		}
	}

}
