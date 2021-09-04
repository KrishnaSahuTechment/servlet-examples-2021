package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.techment.dao.IGreeting;
import com.techment.modal.GoodDayGreeting;
import com.techment.modal.MorningGreeting;


@Service
public class GreeterService {

		
	@Autowired
	@Qualifier("goodDayGreeting")
	IGreeting greetings;
	
	
	
	public void  printGreeting() {
		
		System.out.println("Good day greet: "+greetings.greet());
		
	
	}






	


	



	
}
