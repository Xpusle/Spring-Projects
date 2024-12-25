package com.example.NewPartice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepo;
	
	public boolean CheckUserThenAllowThem(String username,String password) {
		User user=userrepo.findByusername(username);
		if(user!=null && user.getUsername().equals(username)&&user.getPassword().equals(password)) {
			return true;
		}else {
			return false;
		}
	}
	
}
