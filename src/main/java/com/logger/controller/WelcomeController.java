package com.logger.controller;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	
	private static Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/welcome")
	public String getAllLocation() {

		String sMsg="Start point of getAllLocation()";
		System.out.println(LocalDate.now()+""+sMsg);
		logger.info(sMsg);
		
		String eMsg="Exit point of getAllLocation()";
		System.out.println(LocalDate.now()+""+eMsg);
		logger.info(eMsg);
		return "Welcome to Bikkad IT ";

	}
	@GetMapping("/welcome")
	public String getAllLocationa() {

		String sMsg="Start point of getAllLocation()";
		System.out.println(LocalDate.now()+""+sMsg);
		logger.info(sMsg);
		
		String eMsg="Exit point of getAllLocation()";
		System.out.println(LocalDate.now()+""+eMsg);
		logger.info(eMsg);
		return "Welcome to Bikkad IT ";

	}

}
