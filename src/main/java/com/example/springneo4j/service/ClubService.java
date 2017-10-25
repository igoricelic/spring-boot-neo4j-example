package com.example.springneo4j.service;

import com.example.springneo4j.domain.Club;
import com.example.springneo4j.domain.Country;

public interface ClubService {

	public Iterable<Club> findAll();

	public Club findByName(String name);

	public Iterable<Club> findByStadion(String stadion);

	public Iterable<Club> findByColor(String color);

	public Iterable<Club> findByCountry(Country country);

	public Iterable<Club> findByCountry_name(String name);

}
