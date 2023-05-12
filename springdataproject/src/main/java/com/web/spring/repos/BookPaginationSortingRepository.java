package com.web.spring.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.web.spring.model.Book;
@Repository
public interface BookPaginationSortingRepository  extends PagingAndSortingRepository<Book, Integer>{

}
