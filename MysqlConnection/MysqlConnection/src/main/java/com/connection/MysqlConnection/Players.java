package com.connection.MysqlConnection;

//import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;


@Entity
@Table(name="PlayerInfo")
public class Players {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer slno;
	
	
	private String palyername;
	private Integer goalsscored;
	private Integer age;
	
	private String currentpalyingclub;
	@Max(12)
	private Integer marketvalue;
	
	
	public Players() {
		
	}

	public Players(String palyername, Integer goalsscored, Integer age, String currentpalyingclub, Integer marketvalue,
			Integer slno) {
		super();
		this.palyername = palyername;
		this.goalsscored = goalsscored;
		this.age = age;
		this.currentpalyingclub = currentpalyingclub;
		this.marketvalue = marketvalue;
		this.slno = slno;
	}
	
	/**
	 * @return the palyername
	 */
	public String getPalyername() {
		return palyername;
	}

	/**
	 * @return the goalsscored
	 */
	public Integer getGoalsscored() {
		return goalsscored;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @return the currentpalyingclub
	 */
	public String getCurrentpalyingclub() {
		return currentpalyingclub;
	}

	/**
	 * @return the marketvalue
	 */
	public Integer getMarketvalue() {
		return marketvalue;
	}

	/**
	 * @return the slno
	 */
	public Integer getSlno() {
		return slno;
	}

	/**
	 * @param palyername the palyername to set
	 */
	public void setPalyername(String palyername) {
		this.palyername = palyername;
	}

	/**
	 * @param goalsscored the goalsscored to set
	 */
	public void setGoalsscored(Integer goalsscored) {
		this.goalsscored = goalsscored;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @param currentpalyingclub the currentpalyingclub to set
	 */
	public void setCurrentpalyingclub(String currentpalyingclub) {
		this.currentpalyingclub = currentpalyingclub;
	}

	/**
	 * @param marketvalue the marketvalue to set
	 */
	public void setMarketvalue(Integer marketvalue) {
		this.marketvalue = marketvalue;
	}

	/**
	 * @param slno the slno to set
	 */
	public void setSlno(Integer slno) {
		this.slno = slno;
	}

	
	
}
