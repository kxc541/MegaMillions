package com.kc.megamillions.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kc.megamillions.domain.Result;

@Controller
@RequestMapping("/about.htm")
public class AboutPageController {

	@RequestMapping(method = RequestMethod.GET)
	ModelAndView mav(){

		return new ModelAndView( "about" );
		
	}
	
}
