package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	static {System.out.println("hello");}
	@GetMapping("/getMessage")
	public String getMessage() {
		return "Hello Pawan";
	}

}
