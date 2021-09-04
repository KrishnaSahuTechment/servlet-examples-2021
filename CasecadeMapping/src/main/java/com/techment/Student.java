package com.techment;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table(name="student111")  
public class Student {

	@Id
	private int sId;  
    private String sName;  
    private int sAge;
    
    @OneToOne(cascade=CascadeType.PERSIST)  
    private Subject sub;  
	
    public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sId, String sName, int sAge, Subject sub) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.sub = sub;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}  
	
    
    
}
