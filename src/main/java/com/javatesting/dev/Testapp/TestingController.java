package com.javatesting.dev.Testapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {


	@GetMapping("/")
	public String home() {
	    return "HOME OK";
	}
	
}