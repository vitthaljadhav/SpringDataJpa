package com.web.spring.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.model.Book;
import com.web.spring.service.BookJpaService;

@RestController
@RequestMapping("bookjpaapi")
public class BookJpaController {
	@Autowired
	private BookJpaService jpaService;
//http://localhost:8183/bookjpaapi/deleteInBatch
	@DeleteMapping(value = "/deleteInBatch")
	public String deleteInbatch(@RequestBody List<Book> listOfBooks) {
		jpaService.deleteInbatch(listOfBooks);
		return "Delete Books In Batch";
	}
}
