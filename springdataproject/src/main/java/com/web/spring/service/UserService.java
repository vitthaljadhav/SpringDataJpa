package com.web.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.spring.model.User;
import com.web.spring.repos.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public User finaOne(Integer id) {
		Optional<User> optional = userRepository.findById(id);
		User user = optional.get();
		return user;
	}

	public List<User> findAllUsers() {
		List<User> findAll = (List<User>) userRepository.findAll();
		return findAll;
	}
	
	public void deleteById(Integer id) {
       userRepository.deleteById(id);
	}

	public User updateUsers(User user) {
		Optional<User> optional = userRepository.findById(user.getUid());
		User user2 = optional.get();
		user2.setEmail(user.getEmail());
		user2.setName(user.getName());
		return saveUser(user2);
	}

	
}
