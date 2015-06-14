package com.kc.megamillions.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kc.megamillions.domain.Result;
import com.kc.megamillions.services.CalculationService;
import com.kc.megamillions.services.RandomGeneratorService;
 
@Controller
public class JSONController {
 
	@Autowired
	private RandomGeneratorService service;
	
	@Autowired
	private CalculationService calcService;
	
	/*
	 * Spring is smart enough to convert my object to JSON
	 * DWR are technique isn't needed at all or a GSON library 
	 * 
	 */

	@RequestMapping(value = "getResult", method = RequestMethod.GET)
	public @ResponseBody Result getRandomJSON() {
		//RandomGeneratorService service = new RandomGeneratorService();
		Result result = service.generateRandomResult();

		return result;
 
	}
	
	@RequestMapping(value = "getNumberOccurrences/{userInput}", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody 
	public int getNumberOccurences(@PathVariable int userInput) {
		//RandomGeneratorService service = new RandomGeneratorService();
		return calcService.countPastOccurrences(userInput);

	}
	
}