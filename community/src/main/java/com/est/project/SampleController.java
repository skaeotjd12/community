package com.est.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
	
	@GetMapping("log")
	public String name() {
		return "common/log";
	}
	
	@GetMapping("log")
	public String wdw() {
		return "common/log";
	}
	
	@GetMapping("log")
	public String wdwd() {
		return "common/log";
	}
}
