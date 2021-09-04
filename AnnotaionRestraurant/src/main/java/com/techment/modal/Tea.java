package com.techment.modal;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class Tea implements IHotDrink {
	public int price;	
	public void message()
	{	System.out.println("drinking tea");
		System.out.println("have a great day");		
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void drink() {	
		System.out.println("you are drinking tea");
	}	
}
