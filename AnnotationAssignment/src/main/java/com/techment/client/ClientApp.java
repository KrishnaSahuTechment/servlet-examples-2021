package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techment.modal.Employee;

public class ClientApp {

	public static void main(String[] args) {
	
		

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();
		
	Employee empployee = (Employee)context.getBean("employee");
	
	empployee.displayEmployeeDetails();
	
	}

}
