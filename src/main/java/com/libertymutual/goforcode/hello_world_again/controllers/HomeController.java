package com.libertymutual.goforcode.hello_world_again.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	private int russetCount;
	private int goldenCount;
	private int sweetCount;
	
	@RequestMapping("/")
	public String defaultPage() {
		return "potato";
	}

	@RequestMapping("/twice-baked")
	public ModelAndView twiceBaked() {
		ModelAndView carbs = new ModelAndView();
		carbs.setViewName("spuds");
		carbs.addObject("variety", "red");
		carbs.addObject("temperature", 450.999);
		return carbs;
	}
	
	@RequestMapping("/survey")
	public ModelAndView survey(String answer) {
		ModelAndView response = new ModelAndView();
		response.setViewName("results");
		response.addObject("userResponse", answer);
		
		
	  if (answer.equals("Russet")) {
		  russetCount = russetCount + 1;
	  }
	  
	  if (answer.equals("Golden")) {
		  goldenCount = goldenCount + 1;
	  }
	  
	  if (answer.equals("Sweet")) {
		  sweetCount = sweetCount + 1;
	  }

		response.addObject("sweetCount", sweetCount);
		response.addObject("russetCount", russetCount);
		response.addObject("goldenCount", goldenCount);
	  
		return response;
	}
}