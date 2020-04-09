package com.example.HappyFoodDeliveryWebApp.controller;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.HappyFoodDeliveryWebApp.model.User;

@RestController
public class UserController {

	@GetMapping(value="/welcome")
	public ModelAndView welcome(ModelAndView model) {
		System.out.println("inside controller");
		
		model.setViewName("welcome");
		
		return model;
		
		
	}
	@GetMapping(value = "/signUp")
	public ModelAndView signUp(ModelAndView model, @Valid User user,BindingResult result) {
		System.out.println("inside signup");
		model.addObject("user", user);
		model.setViewName("userSignUp");
		return model;
		
		
	}
	@PostMapping(value = "/signUpUser")
	public ModelAndView signUpUser(ModelAndView model, @Valid User user,BindingResult result) {
		System.out.println("user details"+ user.getName());
		model.addObject("user", user);
		model.setViewName("welcome");
		return model;
		
		
	}
}
