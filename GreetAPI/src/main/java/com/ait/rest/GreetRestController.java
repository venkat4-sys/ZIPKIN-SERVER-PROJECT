package com.ait.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	@GetMapping("/get/msg")
	public String getGreet() {
		return "Welcome to Greet API";

	}

}
