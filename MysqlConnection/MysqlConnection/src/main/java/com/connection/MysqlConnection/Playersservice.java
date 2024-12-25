package com.connection.MysqlConnection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Playersservice {
	
	@Autowired
	PlayersRepository playersrepo;
	
	public String  Upsert(Players palyers) {
		playersrepo.save(palyers);
		System.out.println("sucessfully saved ");
		return "ok";
	}
	
	public Players GetPlayerbyname(String palyername) {
		java.util.Optional<Players>pl=playersrepo.findById(palyername);
		if(pl.isPresent()) {
			return pl.get();
		}
		return null;
		
	}
	
	public List<Players> GetPlayersBygoals(Integer goalsscored){
		return playersrepo.findBygoalsscored(goalsscored);
	}
	
	public String DeletePlayerbyname(String palyername) {
		playersrepo.deleteById(palyername);
		System.out.println("Deleted sucessfully");
		return "";
	}
}
