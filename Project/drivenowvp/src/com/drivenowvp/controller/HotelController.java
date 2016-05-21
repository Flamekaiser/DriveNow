package com.drivenowvp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HotelController {

	@RequestMapping(value ={"/", "/welcome**"})
	public ModelAndView welcomePage() {
		
		ModelAndView model = new ModelAndView();
		
		model.setViewName("welcome");

		return model;

	}
	@RequestMapping(value ={"/loginPage"})
	public ModelAndView loginPage() {
		
		ModelAndView model = new ModelAndView();
		int i=0;
		model.setViewName("loginPage");

		return model;

	}


	

}