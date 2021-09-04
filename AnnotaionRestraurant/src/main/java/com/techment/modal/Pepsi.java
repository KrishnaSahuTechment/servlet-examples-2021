package com.techment.modal;


import org.springframework.stereotype.Repository;

@Repository
public  class Pepsi implements ISoftDrink {
	@Override
	public void drink() {		
		System.out.println("you are drinking pepsi");
	}
}
