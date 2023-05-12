package com.web.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.web.spring.model.Book;
import com.web.spring.repos.BookPaginationSortingRepository;

@Service
public class BookPaginationSortingService {
	@Autowired
	private BookPaginationSortingRepository bookPaginationRepository;

	private final static Integer PAGESIZE = 2;

	public Iterable<Book> findAllBooks() {
		return bookPaginationRepository.findAll();

	}

	public List<Book> getBooksPaginated(Integer pageNo) {

		Pageable pageable = PageRequest.of(pageNo, PAGESIZE);
		Page<Book> pageResult = bookPaginationRepository.findAll(pageable);
		List<Book> list = new ArrayList<>();
		list = pageResult.getContent();
		return list;

	}
	
	
	public List<Book> getBooksPaginatedandSorted(Integer pageNo,String sortedKey) {
		Pageable pageable = PageRequest.of(pageNo, PAGESIZE,Sort.by(sortedKey));
		Page<Book> pageResult = bookPaginationRepository.findAll(pageable);
		List<Book> list = new ArrayList<>();
		list = pageResult.getContent();
		return list;
	}
}
