package com.web.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "postinfo")
public class Post {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pid")
	private Integer id;
	private String description;
	@ManyToOne
	@JoinColumn(name = "upid")
	@JsonIgnore
	private User user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Post(Integer id, String description, User user) {
		this.id = id;
		this.description = description;
		this.user = user;
	}

	public Post() {
		super();
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", description=" + description + ", user=" + user + "]";
	}

}
