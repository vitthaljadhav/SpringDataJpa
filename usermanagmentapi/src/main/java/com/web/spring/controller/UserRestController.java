package com.web.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.model.User;
import com.web.spring.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;



@RestController
@RequestMapping("userapi")
@Tag(name="MyUserController" ,description = "Controler for user API for User mangement")
public class UserRestController {
	
	@Autowired
	private UserService service ;
	
	//userapi/greet
	@GetMapping(value = "/greet")
	public String greet() {
		return "Welcome to User Managemnet API";
	}
	
	@GetMapping(value = "/users" ,produces = {"application/json","application/xml"})
	public List<User> findUsers() {
		return service.findAll();
	}
	
	@PostMapping(value = "/users")
	@Operation(summary = "Add a new User",description = "Method to add a new user")
	public User saveUsers(@RequestBody User user) {
		User savedUser = service.save(user);
		return  savedUser;
	}

}
