package com.web.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.model.Book;
import com.web.spring.service.BookService;

@RestController
@RequestMapping("bookapi")
public class BookController {

	@Autowired
	private BookService service;
	
	@GetMapping(value = "/book/{name}")
	public List<Book> findByName(@PathVariable String name) {
		return service.findByName(name);
	}
	
	@GetMapping(value = "/jpql")
	public List<Book> findAllBooksJpql(){
		return service.findAllBooksJpql();
	}
	@GetMapping(value = "/sql")
	public List<Book> findAllBooksql(){
		return service.findAllBooksql();
	}
	
	//http://localhost:8183/bookapi/findByAuthor/Java
	@GetMapping(value = "/findByAuthor/{author}")
	public List<Book> findByAuthor(@PathVariable String author){
		return service.findByAuthor(author);
	}
	//http://localhost:8183/bookapi/findByPrice/100
	@GetMapping(value = "/findByPrice/{price}")
	public List<Book> findByPrice(@PathVariable Integer price){
		return service.findByPrice(price);
	}
	
	
	
}
