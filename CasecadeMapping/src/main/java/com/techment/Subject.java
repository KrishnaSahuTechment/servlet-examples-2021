package com.techment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  
@Table(name="subject111")  
public class Subject {

	
	private String name;  
    private int marks;  
    
    @Id  
    private int sId;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(String name, int marks, int sId) {
		super();
		this.name = name;
		this.marks = marks;
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}
    
    
    
}
