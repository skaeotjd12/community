package com.est.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class test {
	
	@GetMapping
	public String name333() {
		return "get";
	}
	

	@GetMapping
	public String name12() {
		return "sdsd";
	}
	
}


