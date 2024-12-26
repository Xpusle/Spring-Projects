package com.example.demoVersionOfMyproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userservice;

    @PostMapping("/Signup")
    public String check(@ModelAttribute User user){
        boolean iscorrect=userservice.checkUserBeforeGivingAccess(user.getUsername(), user.getPassword());
        if(iscorrect){
            //main progarrm 
            return "redirect:/logic.html";
        }else{
            return "redirect:/login.html";
        }
    }
}
