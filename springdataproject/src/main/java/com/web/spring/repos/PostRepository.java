package com.web.spring.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.spring.model.Post;
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
