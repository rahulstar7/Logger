package com.logger.controller;

import java.time.LocalDate;

public class StudentController {

	
	public String getAllLocation() {

		String sMsg="Start point of getAllLocation()";
		System.out.println(LocalDate.now()+""+sMsg);
		
		String eMsg="Exit point of getAllLocation()";
		System.out.println(LocalDate.now()+""+eMsg);

		return "Welcome to Bikkad IT ";

	}

}
