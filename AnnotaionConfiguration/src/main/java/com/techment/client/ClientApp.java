package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techment.services.DatabaseService;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();
		

		
		DatabaseService dbService = (DatabaseService) context.getBean("dbservice");
		 dbService.displayDatabaseInfo();	
	}

}
