package com.web.spring.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.spring.model.Book;
@Repository
public interface BookJpaRepository extends JpaRepository<Book, Integer> {

}
