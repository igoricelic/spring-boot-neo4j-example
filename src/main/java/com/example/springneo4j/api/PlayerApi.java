package com.example.springneo4j.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springneo4j.domain.Player;
import com.example.springneo4j.service.PlayerService;

@RestController
public class PlayerApi {
	@Autowired
	private PlayerService playerService;
	
	@RequestMapping(value="/player/findAll", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Player> findAll(){
		return playerService.findAll();
	}
	
	@RequestMapping(value="/player/findByName", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Player> findByName(String name){
		return playerService.findByName(name);
	}
	
	@RequestMapping(value="/player/findBySurname", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Player> findBySurname(String surname){
		return playerService.findBySurname(surname);
	}
	
	@RequestMapping(value="/player/findByPosition", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Player> findByPosition(String position){
		return playerService.findByPosition(position);
	}
	
	@RequestMapping(value="/player/findByClubName", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Player> findByClubName(String clubName){
		return playerService.findByClub_name(clubName);
	}
	
	@RequestMapping(value="/player/findByCountryName", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Player> findByCountryName(String countryName){
		return playerService.findByCountry_name(countryName);
	}

}
