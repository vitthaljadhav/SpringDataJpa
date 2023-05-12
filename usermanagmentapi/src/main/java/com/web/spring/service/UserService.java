package com.web.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.web.spring.model.User;

@Service
public class UserService {
	
	private static List<User> users = new ArrayList<> ();
	
	static {
		users.add(new User(101,"Adam","Adam@gmai.com"));
		users.add(new User(102,"Manik","Manik@gmai.com"));
		users.add(new User(103,"Eve","Eve@gmai.com"));
	}
	
	
	public List<User> findAll() {
		return users;
	}
	
	public User save(User user) {
		users.add(user);
		return user;
	}
	

}
