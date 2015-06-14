package com.kc.megamillions.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.asm.commons.Method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kc.megamillions.domain.Result;
import com.kc.megamillions.services.RandomGeneratorService;


@Controller
@RequestMapping("/home.htm")
public class HomePageController {

	@RequestMapping(method = RequestMethod.GET)
	ModelAndView ModelAndView(){

		return new ModelAndView( "home" );
		
	}


}