package com.web.spring.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.spring.model.User;
@Repository
public interface UserRepository  extends CrudRepository<User, Integer>{

}
