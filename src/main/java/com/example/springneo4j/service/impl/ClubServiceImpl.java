package com.example.springneo4j.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springneo4j.dao.ClubDao;
import com.example.springneo4j.domain.Club;
import com.example.springneo4j.domain.Country;
import com.example.springneo4j.service.ClubService;

@Service
public class ClubServiceImpl implements ClubService {
	@Autowired
	private ClubDao clubDao;

	@Override
	public Iterable<Club> findAll() {
		return clubDao.findAll();
	}

	@Override
	public Club findByName(String name) {
		return clubDao.findByName(name);
	}

	@Override
	public Iterable<Club> findByStadion(String stadion) {
		return clubDao.findByStadion(stadion);
	}

	@Override
	public Iterable<Club> findByColor(String color) {
		return clubDao.findByColor(color);
	}

	@Override
	public Iterable<Club> findByCountry(Country country) {
		return clubDao.findByCountry(country);
	}

	@Override
	public Iterable<Club> findByCountry_name(String name) {
		return clubDao.findByCountry_name(name);
	}

}
