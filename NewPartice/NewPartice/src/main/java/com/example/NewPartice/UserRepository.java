package com.example.NewPartice;

//import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{
	
	Optional<User> findByusernameandpassword (String username,String password);
}
