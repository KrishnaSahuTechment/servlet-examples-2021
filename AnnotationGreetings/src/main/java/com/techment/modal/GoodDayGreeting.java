package com.techment.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.techment.dao.IGreeting;

@Repository
public class GoodDayGreeting implements IGreeting {

	
	String greeting ="Have a Good Day";
	
	
	
	@Override
	public String greet() {
		
		return greeting;
	}

	
	public GoodDayGreeting() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public GoodDayGreeting(String greeting) {
		super();
		this.greeting = greeting;
	}

	
	public String getGreeting() {
		return greeting;
	}

	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	

	
	
	
	
}
