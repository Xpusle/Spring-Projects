package com.Project.LoginAPI;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Integer>{
	User findByusername(String username);
}
