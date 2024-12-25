package com.Myproject.Myprojectfor.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Myproject.Myprojectfor.model.Event;

public interface EventRepository extends JpaRepository<Event,Long>{
	
	//custome 
	List<Event> findByLocation(String loaction);
	
	List<Event> findByDateAfter(LocalDate date);
}
