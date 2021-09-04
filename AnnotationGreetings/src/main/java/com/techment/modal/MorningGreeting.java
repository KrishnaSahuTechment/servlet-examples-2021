package com.techment.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.techment.dao.IGreeting;

@Repository
public class MorningGreeting implements IGreeting {

	
	String greeting ="Good Morning";
	
	
	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}

	
	public MorningGreeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public MorningGreeting(String greeting) {
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
