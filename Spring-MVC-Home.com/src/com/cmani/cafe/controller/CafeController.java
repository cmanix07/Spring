package com.cmani.cafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeController {
	
	@RequestMapping("/cafe")
	public String showWelcomePage(Model momCafe) {
		return "welcome-page";
		
	}
	
	@RequestMapping("processOrder")
	public String processOrder(HttpServletRequest request, Model orders) {
		String userFoodType = request.getParameter("foodType");
		
		orders.addAttribute("orderName", userFoodType);
		return "process-order";
	}

}
