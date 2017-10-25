package com.example.springneo4j.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.springneo4j.domain.Club;
import com.example.springneo4j.domain.Country;

@RepositoryRestResource(collectionResourceRel = "club", path = "club")
public interface ClubDao extends PagingAndSortingRepository<Club, Long> {
	
	Club findByName(String name);
	
	List<Club> findByStadion(String stadion);
	
	List<Club> findByColor(String color);
	
	List<Club> findByCountry(Country country);
	
	List<Club> findByCountry_name(String name);

}
