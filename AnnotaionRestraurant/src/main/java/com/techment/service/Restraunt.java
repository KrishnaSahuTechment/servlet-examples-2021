package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.techment.modal.IHotDrink;
import com.techment.modal.ISoftDrink;
import com.techment.modal.Tea;

@Service("restservice")
public class Restraunt {
	String restraruntName;
	@Autowired
	Tea tea;
	
	@Autowired
	@Qualifier("coffee")
	IHotDrink hotDrink;
	
	@Autowired
	ISoftDrink softDrink;	
	
	public void displayRestraruntDetails()
	{
		System.out.println("Restrarunt name: "+restraruntName);
//		System.out.println("Price of tea: "+tea.price);
//		tea.message();
		hotDrink.drink();
		softDrink.drink();		
	}

	public void setRestraruntName(String restraruntName) {
		this.restraruntName = restraruntName;
	}

	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	public void setSoftDrink(ISoftDrink softDrink) {
		this.softDrink = softDrink;
	}
	public void setTea(Tea tea) {
		this.tea = tea;
	}	
}
