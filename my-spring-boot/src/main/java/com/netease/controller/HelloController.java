package com.netease.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netease.Dao.UserDao;
import com.netease.User.User;

@RestController
public class HelloController {
	
	@Autowired
	User user;
	
	UserDao dao = new UserDao();
	
	@RequestMapping("/hello")
	public List<User> hello() {
		System.out.println("entering hello()");
		System.out.println(user.getName());
		System.out.println(user.getAge());
		List list = dao.getUser();
		return list;
		//		return "hello world! by mengxing";
	}
	
	
	@RequestMapping("/")
	public String home() {
		System.out.println("entering home()");
		return "hone";
	}

}
