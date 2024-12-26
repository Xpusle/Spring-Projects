package com.example.SignupAPI;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{
	boolean existsByusername(String username);
	User findByusername(String username);
}
