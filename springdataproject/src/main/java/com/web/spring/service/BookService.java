package com.web.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.web.spring.model.Book;
import com.web.spring.repos.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> findByName(String name) {
		return bookRepository.findByName(name);
	}
	
	public List<Book> findAllBooksJpql(){
		return bookRepository.findAllBooksJpql();
	}
	
	public List<Book> findAllBooksql(){
		return bookRepository.findAllBooksql();
	}
	
	
	public List<Book> findByAuthor(String author){
		return bookRepository.findByAuthor(author);
	}
	
	public List<Book> findByPrice( Integer p){
		return bookRepository.findByPrice(p);
	}
	
}
