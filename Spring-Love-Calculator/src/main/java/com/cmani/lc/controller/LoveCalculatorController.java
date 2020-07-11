package com.cmani.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoveCalculatorController {
	
	@RequestMapping(value ="/hello", method = RequestMethod.GET)
	@ResponseBody
	public String hello() {
		int val = 10;
		System.out.println("Hello Chinta !!");
		return "Hello Chintamani !!!!";
	}

}
