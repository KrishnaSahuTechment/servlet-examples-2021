package com.techment.modal;

public class Bank {

	String name;
	String ifseCode;
	String branch;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setIfseCode(String ifseCode) {
		this.ifseCode = ifseCode;
	}
//	public void setBranch(String branch) {
//		this.branch = branch;
//	}
	
	Bank(String branch)
	{
		this.branch = branch;
		
	}
	
public	void displayBankDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("IfSC Code: "+ifseCode);
		System.out.println("Branch: "+branch);
		
	}
	
}
