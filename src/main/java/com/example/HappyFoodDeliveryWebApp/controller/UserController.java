package com.example.HappyFoodDeliveryWebApp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {

	@GetMapping(value="/welcome")
	public ModelAndView welcome(ModelAndView model) {
		System.out.println("inside controller");
		
		model.setViewName("welcome");
		
		return model;
		
		
	}
	@GetMapping(value = "/signUp")
	public ModelAndView signUp(ModelAndView model) {
		model.setViewName("userSignUp");
		return model;
		
		
	}
}
