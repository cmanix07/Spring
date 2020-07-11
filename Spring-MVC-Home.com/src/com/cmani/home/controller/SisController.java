package com.cmani.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisController {

	@RequestMapping("/makeupkit")
	@ResponseBody
	public String getMakeupKit() {
		System.out.println("SisController - Providing makeup kits");
		
		return "Take mu makeup kits";
	}
	
	@RequestMapping("/books")
	@ResponseBody
	public String retrieveBook() {
		System.out.println("SisControlller - Retrieving the borrowed books");
		return "retrieve the borrowed Math books";
		
	}
}
