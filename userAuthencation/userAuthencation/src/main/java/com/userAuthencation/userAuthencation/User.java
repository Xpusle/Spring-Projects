package com.userAuthencation.userAuthencation;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name="UserAuthencation_table")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer slno;
	
	private String username;
	private String password;
	public Integer getSlno() {
		return slno;
	}
	public void setSlno(Integer slno) {
		this.slno = slno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
