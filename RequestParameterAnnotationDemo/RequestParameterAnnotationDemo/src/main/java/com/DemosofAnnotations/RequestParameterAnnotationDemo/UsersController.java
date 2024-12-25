package com.DemosofAnnotations.RequestParameterAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsersController {
	
	@Autowired
	UsersService usersservice;
	
	@PostMapping("/users")
//	public ResponseEntity<String> Create(//@RequestParam String name,@RequestParam String email,@RequestParam Integer age){
		
//		Users users=new Users();
//		users.setName(name);
//		users.setAge(age);
//		users.setEmail(email);
//		
//		return  ResponseEntity.ok("addedd sucessfully 🙋");
//	}
	public ResponseEntity<String>create(@ModelAttribute Users users){
		String status=usersservice.Upsert(users);
		return new ResponseEntity<>(status,HttpStatus.OK);
		
	}
	
}
