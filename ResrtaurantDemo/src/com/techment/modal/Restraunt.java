package com.techment.modal;

public class Restraunt {
	String restraruntName;
	Tea tea;
	IHotDrink hotDrink;
	ISoftDrink softDrink;	
	
	public void displayRestraruntDetails()
	{
		System.out.println("Restrarunt name: "+restraruntName);
		System.out.println("Price of tea: "+tea.price);
		tea.message();
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
