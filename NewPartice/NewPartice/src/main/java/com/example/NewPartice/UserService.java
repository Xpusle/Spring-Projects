package com.example.NewPartice;

//import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepo;
	
	public boolean CheckUserThenAllowThem(String username,String password) {
		Optional<User>user=userrepo.findByusernameandpassword(username, password);
		if(user!=null && user.isPresent()) {
			return true;
		}else {
			return false;
		}
	}
	
}
