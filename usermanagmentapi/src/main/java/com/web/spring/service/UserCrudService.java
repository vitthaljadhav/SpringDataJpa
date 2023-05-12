package com.web.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.spring.model.User;
import com.web.spring.reposistory.UserCrudReposistory;

@Service
public class UserCrudService {
	@Autowired
	private UserCrudReposistory reposistory;
	
	public User saveUser(User user) {
		
		User savedUser = reposistory.save(user);
		return savedUser;
	}
	
	
public List<User> findAllUsers() {
return (List<User>) reposistory.findAll();
	}


public Optional<User> findUsers(Integer id ) {
return  reposistory.findById(id);
}
	

}
