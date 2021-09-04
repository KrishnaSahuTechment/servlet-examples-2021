package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techment.modal.GoodDayGreeting;
import com.techment.service.GreeterService;


public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();
		
		
		
		GreeterService  greeterService = (GreeterService)context.getBean("greeterService");

		greeterService.printGreeting();
		

		
		
	}

}
