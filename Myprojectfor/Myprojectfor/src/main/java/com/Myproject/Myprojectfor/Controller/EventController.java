package com.Myproject.Myprojectfor.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Myproject.Myprojectfor.Service.EventService;
import com.Myproject.Myprojectfor.model.Event;

@RestController
@RequestMapping("api/events")
public class EventController {
	
	private final EventService eventservice;
	
	public EventController(EventService eventservice) {
		this.eventservice=eventservice;
	}
	
	@PostMapping
	public Event create(@RequestBody Event event) {
		return eventservice.saveEvent(event);
	}
	
	@GetMapping
	public List<Event> getAllEvents(){
		return eventservice.getAllEvents();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Event>> GetEventbyid(@PathVariable Long id){
		Optional<Event> ev=eventservice.getEventByid(id);
		return new ResponseEntity<>(ev,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> DeleteEvent(@PathVariable Long id){
		String status=eventservice.deleteEventbyid(id);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	@GetMapping("/upcoming")
	public List<Event> GetUpcomingEvents(){
		return eventservice.getUpcomingEvents();
	}
	@GetMapping("/location/{Location}")
	public List<Event> GetEventsByLocation(@PathVariable String location){
		return eventservice.getEventsByLocation(location);
	}
}
