package com.example.springneo4j.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.springneo4j.domain.Club;
import com.example.springneo4j.domain.Country;
import com.example.springneo4j.domain.Player;

@RepositoryRestResource(collectionResourceRel = "player", path = "player")
public interface PlayerDao extends PagingAndSortingRepository<Player, Long> {
	
	List<Player> findByName(String name);
	
	List<Player> findBySurname(String surname);
	
	List<Player> findByPosition(String position);
	
	List<Player> findByClub(Club club);
	
	List<Player> findByClub_name(String club_name);
	
	List<Player> findByCountry(Country country);
	
	List<Player> findByCountry_name(String country_name);

}
