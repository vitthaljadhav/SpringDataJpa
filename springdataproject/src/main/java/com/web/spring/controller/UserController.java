package com.web.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.model.User;
import com.web.spring.service.UserService;

@RestController
@RequestMapping("userapi")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping(value = "/users")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@GetMapping(value = "/users/{id}")
	public User findOne(@PathVariable Integer id) {
		return userService.finaOne(id);
	}

	@GetMapping(value  = "/users")
	public List<User> findAllUsers() {
		return userService.findAllUsers();
	}

	@DeleteMapping(value = "/user/{id}")
	public String deleteById(@PathVariable Integer id) {
		return "User Deleted Successfully";
	}
	
	@PutMapping(value = "/users")
	public User updateUser(@RequestBody User user) {
		return userService.updateUsers(user);
	}
}
