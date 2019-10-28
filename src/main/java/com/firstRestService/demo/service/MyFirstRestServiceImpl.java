package com.firstRestService.demo.service;

import org.springframework.stereotype.Service;

import com.firstRestService.demo.domain.GetLibraryResponse;

@Service
public class MyFirstRestServiceImpl implements MyFirstRestService{

	//@Autowired
	//MyFirstRestRepository repository;

	@Override
	public GetLibraryResponse getBookByName(String bookName) {
		GetLibraryResponse response = null;
		response.setBookName(bookName);
		
		return response;
	}
	
}