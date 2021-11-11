package com.cursomicroservices;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	
	@RequestMapping("/hi")
	public @ResponseBody String hiThere() {
		
		return "Hello World";
	}
	
	@RequestMapping("/hi2")
	public String hi2() {
		
		return "hello";
	}
	
	@RequestMapping("/hi/{name}")
	public String hiThere(Map model, @PathVariable String name) {
		
		model.put("name", name);
		return "hello";
	}
	
	
}
