package com.netease.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("entering hello()");
		return "hello world! by mengxing";
	}
	
	
	@RequestMapping("/")
	public String home() {
		System.out.println("entering home()");
		return "hone";
	}

}
