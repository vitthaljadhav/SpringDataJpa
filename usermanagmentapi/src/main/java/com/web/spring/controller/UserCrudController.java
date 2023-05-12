package com.web.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.excption.UserNotFoundException;
import com.web.spring.model.User;
import com.web.spring.service.UserCrudService;

@RestController
@RequestMapping("crudcontroller")
public class UserCrudController {
	@Autowired
	private UserCrudService service;
	// crudcontroller/users
	@PostMapping(value = "/users")
	public User saveUser(@RequestBody User user) {
		
		User savedUser = service.saveUser(user);
		return savedUser;
	}
	
	@GetMapping(value = "/users")
public List<User> findAllUsers() {
return (List<User>) service.findAllUsers();
	}
	
	
@GetMapping(value = "/users/{id}")
public User findUsers(@PathVariable Integer id) {
Optional<User> ouser = service.findUsers(id);
User u=null;
if(ouser.isPresent()) {
	u= ouser.get();
}else {
	throw new UserNotFoundException("User not found with "+id);
}
		
return u;
	}


}
