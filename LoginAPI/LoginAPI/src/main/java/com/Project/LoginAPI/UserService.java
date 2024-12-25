package com.Project.LoginAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepo;
	
	public boolean Checkdetails(String username,String password) {
		User user=userrepo.findByusername(username);
		System.out.println(user);
//		System.out.println("Username: " + user.getUsername());
//		System.out.println("Password: " + user.getPassword());

		if(user!=null && user.getPassword().equals(password) &&user.getUsername().equals(username)) {
			return true;
		}else {
			return false;
		}
	}
}
