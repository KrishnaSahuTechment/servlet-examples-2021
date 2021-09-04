package com.techment.modal;

public class Tea implements IHotDrink {
	int price;	
	void message()
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
