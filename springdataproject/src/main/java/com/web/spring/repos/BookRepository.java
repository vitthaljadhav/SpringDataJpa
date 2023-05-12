package com.web.spring.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.web.spring.model.Book;

@org.springframework.stereotype.Repository
public interface BookRepository  extends Repository<Book, Integer>{

	
	public List<Book> findByName(String name);
	
	public Book findBookByAuthorOrName(String author, String name);
	
	@Query(value = "From Book")
	public List<Book> findAllBooksJpql();
	
	@Query(value = "select * from bookinfo ", nativeQuery  = true )
	public List<Book> findAllBooksql();
	
	@Query(value = "select * from bookinfo b where b.author=?1" , nativeQuery = true)
	public List<Book> findByAuthor(String author);	
	
	@Query(value = "select b from Book b where b.price>:p")
	public List<Book> findByPrice(@Param("p") Integer p);	
	
	
	public List<Book> findByNameOrAuthor(String name, String author);
}
