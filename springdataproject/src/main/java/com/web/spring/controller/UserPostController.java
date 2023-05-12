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

import com.web.spring.model.Post;
import com.web.spring.model.User;
import com.web.spring.repos.PostRepository;
import com.web.spring.repos.UserRepository;

@RestController
@RequestMapping("postapi")
public class UserPostController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PostRepository postRepository;
	//http://localhost:8183/postapi/users
	@GetMapping(value = "/users")
	public List<User> getAllUsers(){
		return (List<User>) userRepository.findAll();
	}

	//http://localhost:8183/postapi/users/101/posts
	@GetMapping(value = "/users/{id}/posts")
	public List<Post> getAllPostByUsers(@PathVariable Integer id){
		Optional<User> optional = userRepository.findById(id);
		User user = optional.get();
		return user.getPosts();
	}
	
	
	//http://localhost:8183/postapi/users/101/posts
		@PostMapping(value = "/users/{id}/posts")
		public String savePosts(@PathVariable Integer id, @RequestBody Post post){
			Optional<User> optional = userRepository.findById(id);
			User user = optional.get();
			post.setUser(user);
			postRepository.save(post);
			return "Post created..";
		}

}
