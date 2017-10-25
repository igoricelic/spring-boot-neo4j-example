package com.example.springneo4j.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springneo4j.dao.PlayerDao;
import com.example.springneo4j.domain.Club;
import com.example.springneo4j.domain.Country;
import com.example.springneo4j.domain.Player;
import com.example.springneo4j.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	private PlayerDao playerDao;

	@Override
	public Iterable<Player> findAll() {
		return playerDao.findAll();
	}

	@Override
	public Iterable<Player> findByName(String name) {
		return playerDao.findByName(name);
	}

	@Override
	public Iterable<Player> findBySurname(String surname) {
		return playerDao.findBySurname(surname);
	}

	@Override
	public Iterable<Player> findByPosition(String position) {
		return playerDao.findByPosition(position);
	}

	@Override
	public Iterable<Player> findByClub(Club club) {
		return playerDao.findByClub(club);
	}

	@Override
	public Iterable<Player> findByClub_name(String club_name) {
		return playerDao.findByClub_name(club_name);
	}

	@Override
	public Iterable<Player> findByCountry(Country country) {
		return playerDao.findByCountry(country);
	}

	@Override
	public Iterable<Player> findByCountry_name(String country_name) {
		return playerDao.findByCountry_name(country_name);
	}

}
