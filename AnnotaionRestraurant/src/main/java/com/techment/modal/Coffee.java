package com.techment.modal;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public  class Coffee implements IHotDrink {
	@Override
	public void drink() {
		System.out.println("you are drinking coffee");
	}
}
