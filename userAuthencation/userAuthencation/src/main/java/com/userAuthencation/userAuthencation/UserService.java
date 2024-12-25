package com.userAuthencation.userAuthencation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository userrepo;
	
	public boolean checkuser(String username,String password) {
		User user=userrepo.findByusername(username);
		if(user !=null && user.getPassword().equals(password) && user.getUsername().equals(username)) {
			return true;
		}else {
			return false;
		}
	}

}
