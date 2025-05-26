package com.example.lecture022;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

	@GetMapping("hello")
	public String helloWorld() {
		return ("Hello World");

	}
	
	
	@GetMapping("hello2")
	public String helloWorld2() {
		return ("Hello2 Spring");

	}


}
