package com.DemosofAnnotations.RequestParameterAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository usersrepo;
	
	public String Upsert(Users users) {
		usersrepo.save(users);
		return "200OK";
	}
	
	
}

