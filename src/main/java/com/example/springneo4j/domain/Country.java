package com.example.springneo4j.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label="country")
public class Country {
	@GraphId
	private Long id;
	
	private String name;
	private String capital_city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital_city() {
		return capital_city;
	}
	public void setCapital_city(String capital_city) {
		this.capital_city = capital_city;
	}

}
