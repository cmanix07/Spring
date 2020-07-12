package com.cmani.springmvc.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("Hello Java based spring config");
		
		return "hello-page";
	}
	
 
}
