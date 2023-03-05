package com.BikkadIT.SpringMvcFirstAp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	public WelcomeController() {
		super();
System.out.println("Welc clss contrler");
}
	
	
	@GetMapping("/welcomeMsg")
	public ModelAndView welcome() {
		
		String msg="Welcome to Bikkad IT";
		
		ModelAndView mav= new ModelAndView();
		mav.addObject("Message",msg);
		mav.setViewName("Welcome");
		
		return mav;
		
	}

}
