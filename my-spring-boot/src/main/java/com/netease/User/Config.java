package com.netease.User;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
	
	@Bean
	public User user() {
		User user = new User("mengxing", 23);
		user.setAge(25);
		return user;
	}

	

}
