package com.example.springneo4j.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springneo4j.domain.Country;
import com.example.springneo4j.service.CountryService;

@RestController
public class CountryApi {
	@Autowired
	private CountryService countryService;
	
	@RequestMapping(value="/country/findAll", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Country> findAll(){
		return countryService.findAll();
	}
	
	@RequestMapping(value="/country/findByName", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Country findByName(String name){
		return countryService.findByName(name);
	}

}
