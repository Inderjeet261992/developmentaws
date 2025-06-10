package com.demo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestingController {

	    @GetMapping("/hello")
	    public String sayHello() {
	        return "Hello, World!";
	    }
	}
