package com.sandeep.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandeep.ws.services.DataService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private DataService dataService;

	@GetMapping
	public Iterable findAll() {

		return dataService.findAll();
	}
	
	@GetMapping("/check")
	public String check() {

		return "Running Fine";
	}
	

}
