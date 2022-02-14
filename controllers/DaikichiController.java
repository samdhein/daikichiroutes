package com.samhein.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// do imports with CTRL + SHIFT + O

@RestController
@RequestMapping("/daikichi") // put this outside the class and all the routes within will have a /api prefix. optional.
public class DaikichiController {
	
	// Three options 
	// RequestMapping is defined as "Get"
	// Option 1
	@RequestMapping("") // route
	public String index() {// return will be string mostly, but also object or array list potentially.
		return "Welcome!";
	}
	// Option 2
	@RequestMapping(value="/today", method=RequestMethod.GET) // route
	public String option2() {
		return "Today you will find luck in all your endeavors!";		
	}
	// Option 3: GetMapping / PostMapping / PutMapping / DeleteMapping... what Heidi uses. GetMapping is only for get. 
	@GetMapping("/tomorrow") // route
	public String option3() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
}

// CRUD:
	// Create: Post
	// Read: Get
	// Update: Put
	// Delete: Delete
