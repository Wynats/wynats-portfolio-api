package com.wynats.portfolio.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestRestController {

	@RequestMapping(path="/workers/test", method=RequestMethod.GET)
    public ResponseEntity<String> getComponentConfiguration() {

		return new ResponseEntity<>("test correcto",HttpStatus.OK);
    }
	
	 
}
