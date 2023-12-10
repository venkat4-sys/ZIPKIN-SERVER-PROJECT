package com.ait.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ait.greetfeign.GreetFeign;

@RestController
public class WelocmeRestController {

	@Autowired
	private GreetFeign greetfeign;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String message = greetfeign.getGreet();

		return "welcome to Welcome-API"+" " +message;
	}

}
