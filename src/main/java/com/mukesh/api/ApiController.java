package com.mukesh.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	// http://localhost:8080/api/person?name=nanda&age=28
	@GetMapping(value = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
	public SampleModel getPerson(@RequestParam(value = "name") String personName,
			@RequestParam(value = "age") String age,@RequestHeader(value ="header")String header){
return new SampleModel(personName,age,header);
	}

	
}
