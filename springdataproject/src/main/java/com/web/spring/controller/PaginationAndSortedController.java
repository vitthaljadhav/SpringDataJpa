package com.web.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.model.Book;
import com.web.spring.service.BookPaginationSortingService;

@RestController
@RequestMapping("/pagenationapi")
public class PaginationAndSortedController {

	@Autowired
	private BookPaginationSortingService service;
	//http://localhost:8183/pagenationapi/book
	@GetMapping(value = "/book")
	public Iterable<Book> findAllBooks() {
		return service.findAllBooks();

	}
	
	//http://localhost:8183/pagenationapi/book/1
    @GetMapping(value = "/book/{pageNo}")
	public List<Book> getBooksPaginated(@PathVariable Integer pageNo) {
		return service.getBooksPaginated(pageNo);

	}
  //http://localhost:8183/pagenationapi/book/1/name
	@GetMapping(value = "/book/{pageNo}/{sortedKey}")
	public List<Book> getBooksPaginatedandSorted(@PathVariable Integer pageNo, @PathVariable String sortedKey) {
		return service.getBooksPaginatedandSorted(pageNo,sortedKey);
	}
}
