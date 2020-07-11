package com.cmani.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
	
	@RequestMapping(value="/momWork", method = RequestMethod.GET)
	@ResponseBody
	public String momWork() {
		System.out.println("Mom does household works !!! ");
		return "House Work !";
	}

}
