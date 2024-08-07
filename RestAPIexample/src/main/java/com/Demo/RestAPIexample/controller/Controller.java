package com.Demo.RestAPIexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Controller {

	@GetMapping("/hello")
	public String getmethod() {
		return "Hello World";
	}
	
	
	@GetMapping("/hellobyebye")
	public String gethellomethod() {
		return "Hello AP bye bye AP";
	}
}
