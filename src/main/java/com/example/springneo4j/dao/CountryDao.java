package com.example.springneo4j.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.springneo4j.domain.Country;

@RepositoryRestResource(collectionResourceRel = "country", path = "country")
public interface CountryDao extends PagingAndSortingRepository<Country, Long> {
	
	Country findByName(String name);

}
