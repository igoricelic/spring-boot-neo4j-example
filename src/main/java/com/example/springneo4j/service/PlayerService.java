package com.example.springneo4j.service;

import com.example.springneo4j.domain.Club;
import com.example.springneo4j.domain.Country;
import com.example.springneo4j.domain.Player;

public interface PlayerService {
	
	public Iterable<Player> findAll();

	public Iterable<Player> findByName(String name);

	public Iterable<Player> findBySurname(String surname);

	public Iterable<Player> findByPosition(String position);

	public Iterable<Player> findByClub(Club club);

	public Iterable<Player> findByClub_name(String club_name);

	public Iterable<Player> findByCountry(Country country);

	public Iterable<Player> findByCountry_name(String country_name);

}
