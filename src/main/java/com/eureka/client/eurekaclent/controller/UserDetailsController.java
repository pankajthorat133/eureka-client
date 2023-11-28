package com.eureka.client.eurekaclent.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.model.Employee;

@RestController
@CrossOrigin
@RequestMapping("/client")
public class UserDetailsController {

	@GetMapping("/details/{id}")
	public String getMessage(@PathVariable int id) {
		
		return "User ID  " + id;
	}	
}
