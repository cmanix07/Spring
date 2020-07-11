package com.cmani.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {
	
	@GetMapping("/cricket")
	public String giveCricketBat() {
		System.out.println("Returned the cricket bat");
		
		return "cricketBat";
	}

}
