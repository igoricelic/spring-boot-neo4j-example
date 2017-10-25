package com.example.springneo4j.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity(label="club")
public class Club {
	@GraphId
	private Long id;
	
	private String name;
	private String stadion;
	private String color;
	@Relationship(type = "club_from", direction = Relationship.DIRECTION)
	private Country country;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStadion() {
		return stadion;
	}
	public void setStadion(String stadion) {
		this.stadion = stadion;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}

}
