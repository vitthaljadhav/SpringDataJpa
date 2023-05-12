package com.web.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("emp")
public class SpringMvcController {
	// emp/greet
	@GetMapping(value = "/greet")
	public ModelAndView greet () {
		
	return new ModelAndView("greeting", "msg","Welcome to Spring MVC using Spring Boot");
		
	}

}
