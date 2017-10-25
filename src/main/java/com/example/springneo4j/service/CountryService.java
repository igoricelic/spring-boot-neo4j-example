package com.example.springneo4j.service;

import com.example.springneo4j.domain.Country;

public interface CountryService {
	
	public Iterable<Country> findAll();
	
	public Country findByName(String name);

}
