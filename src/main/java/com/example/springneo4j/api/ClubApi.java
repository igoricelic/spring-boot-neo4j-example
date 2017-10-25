package com.example.springneo4j.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springneo4j.domain.Club;
import com.example.springneo4j.service.ClubService;

@RestController
public class ClubApi {
	@Autowired
	private ClubService clubService;
	
	@RequestMapping(value="/club/findAll", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Club> findAll(){
		return clubService.findAll();
	}
	
	@RequestMapping(value="/club/findByName", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Club findByName(String name){
		return clubService.findByName(name);
	}
	
	@RequestMapping(value="/club/findByStadion", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Club> findByStadion(String stadion){
		return clubService.findByStadion(stadion);
	}
	
	@RequestMapping(value="/club/findByColor", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Club> findByColor(String color){
		return clubService.findByColor(color);
	}
	
	@RequestMapping(value="/club/findByCountryName", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Club> findByCountryName(String countryName){
		return clubService.findByCountry_name(countryName);
	}

}
