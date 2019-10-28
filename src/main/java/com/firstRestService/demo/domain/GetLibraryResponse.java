package com.firstRestService.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetLibraryResponse {
	
	private String bookName;
	private String authorName;
	private String noOfPages;
	private String editorial;
	private String language;

}
