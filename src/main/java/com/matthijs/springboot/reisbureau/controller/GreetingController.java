package com.matthijs.springboot.reisbureau.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@Autowired
	Greeting greeting;
	
	@GetMapping("begroeting")
	public Greeting greeting(@RequestParam(value="groet") String groet) {
		greeting.setAantal(7);
		greeting.setBegroeting(groet);
		return greeting;
	}

}
