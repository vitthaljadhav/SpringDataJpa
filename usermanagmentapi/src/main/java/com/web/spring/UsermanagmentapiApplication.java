package com.web.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="User API",version="v1",contact=@Contact(name="Saurabh",email="admin@userapi.com")))
public class UsermanagmentapiApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	return application.sources(UsermanagmentapiApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(UsermanagmentapiApplication.class, args);
		System.out.println("Welcome to user managment api");
	}

}
