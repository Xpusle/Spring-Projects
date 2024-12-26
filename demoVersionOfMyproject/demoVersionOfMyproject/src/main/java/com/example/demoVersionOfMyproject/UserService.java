package com.example.demoVersionOfMyproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userrepo;

    public boolean checkUserBeforeGivingAccess(String username,String password) {
        User user=userrepo.findByName(username);
        if (user!=null &&user.getUsername().equals(username)&&user.getPassword().equals(password) ){
            return true;
        }else{
            return false;
        }
    }
}
