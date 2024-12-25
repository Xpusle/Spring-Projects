package com.Myproject.Myprojectfor.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Myproject.Myprojectfor.Repository.EventRepository;
import com.Myproject.Myprojectfor.model.Event;

@Service
public class EventService {

	private final EventRepository eventrepo;

	public EventService(EventRepository eventrepo) {
		this.eventrepo = eventrepo;
	}

	public List<Event> getUpcomingEvents() {
		return eventrepo.findByDateAfter(LocalDate.now());
	}

	public List<Event> getEventsByLocation(String Location) {
		return eventrepo.findByLocation(Location);
	}

	public Event saveEvent(Event event) {
		return eventrepo.save(event);
	}

	public List<Event> getAllEvents() {
		return eventrepo.findAll();
	}

	public Optional<Event> getEventByid(Long id) {
		return eventrepo.findById(id);
	}

	public String deleteEventbyid(Long id) {
		eventrepo.deleteById(id);
		return "200Ok";
	}

}
