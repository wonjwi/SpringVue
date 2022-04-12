package com.sample.im;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/dashBoard")
	public String dashBoard() {
		return "dashBoard";
	}
	
	@GetMapping("/source")
	public String source() {
		return "source";
	}
	
	@GetMapping("/target")
	public String target() {
		return "target";
	}

}
