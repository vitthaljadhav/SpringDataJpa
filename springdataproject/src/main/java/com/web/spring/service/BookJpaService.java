package com.web.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.spring.model.Book;
import com.web.spring.repos.BookJpaRepository;

@Service
public class BookJpaService {
	@Autowired
	private BookJpaRepository repository;

	@Transactional
	public void deleteInbatch(List<Book> listOfBooks) {
		repository.deleteInBatch(listOfBooks);
	}

}
