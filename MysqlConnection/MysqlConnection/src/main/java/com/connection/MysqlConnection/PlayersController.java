package com.connection.MysqlConnection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fifa")
public class PlayersController {
	
	@Autowired
	Playersservice palyersservice;
	
	@PostMapping
	public ResponseEntity<String> Create(@RequestBody Players players){
		String status=palyersservice.Upsert(players);		
		return new ResponseEntity<>(status,HttpStatus.FOUND);
	}
	
	@GetMapping("/{palyername}")
	public ResponseEntity<Players> Get(@PathVariable String palyername){
		Players pl=palyersservice.GetPlayerbyname(palyername);
		return new ResponseEntity<>(pl,HttpStatus.FOUND);
	}
	
	@GetMapping("/{goalsscored}")
	public ResponseEntity<List<Players>> Getall(@PathVariable Integer goalsscored){
		List<Players>pl=palyersservice.GetPlayersBygoals(goalsscored);
		return new ResponseEntity<>(pl,HttpStatus.FOUND);
		
	}
	
	@PutMapping
	public ResponseEntity<String> Update(@RequestBody Players players){
		String status=palyersservice.Upsert(players);
		return new ResponseEntity<>(status,HttpStatus.FOUND);
	}
	
	@DeleteMapping("/{palyername}")
	public ResponseEntity<String> Delete(@PathVariable String palyername){
		String status=palyersservice.DeletePlayerbyname(palyername);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
	

}
