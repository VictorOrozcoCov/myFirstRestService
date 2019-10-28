package com.firstRestService.demo.service;

import org.springframework.stereotype.Service;

import com.firstRestService.demo.domain.GetLibraryResponse;

@Service
public interface MyFirstRestService {

	GetLibraryResponse getBookByName(String bookName);
}
