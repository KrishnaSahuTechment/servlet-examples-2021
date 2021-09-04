package com.techment.modal;

public class Employee {

	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public void show() {
		// TODO Auto-generated method stub
	
		
	}

	public Employee(int salary) {
		super();
		this.salary = salary;
		System.out.println("salary constructor called");
	}

	public Employee(String name) {
		super();
		this.name = name;
		System.out.println("name constructor called");
	}
	
	
	
	
	
}
