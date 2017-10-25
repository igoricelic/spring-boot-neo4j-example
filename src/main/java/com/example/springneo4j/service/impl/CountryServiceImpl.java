package com.example.springneo4j.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springneo4j.dao.CountryDao;
import com.example.springneo4j.domain.Country;
import com.example.springneo4j.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {
	@Autowired
	private CountryDao countryDao;

	@Override
	public Iterable<Country> findAll() {
		return countryDao.findAll();
	}

	@Override
	public Country findByName(String name) {
		return countryDao.findByName(name);
	}

}
