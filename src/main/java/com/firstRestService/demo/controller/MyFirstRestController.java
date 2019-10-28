package com.firstRestService.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstRestService.demo.domain.GetLibraryResponse;
import com.firstRestService.demo.service.MyFirstRestServiceImpl;

@RestController
@RequestMapping(value="/v*/library",produces="application/json")
public class MyFirstRestController {

	@Autowired
	private MyFirstRestServiceImpl service;
	
	@GetMapping("/getBook")
	public void hola2() {
	    
		System.out.println("I got a book");
	}
	 
	@GetMapping("/book/{name}")
	public GetLibraryResponse getBook(@PathVariable String name){
		
		return service.getBookByName(name);
	}
	
}
