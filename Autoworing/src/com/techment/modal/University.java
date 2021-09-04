package com.techment.modal;

public class University {

	Department department;
	int noOfStudent;
	
	
public	void displayDeptDetails()
	{
		
		department.deptDetails();
		System.out.println("no of student: "+noOfStudent);
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}
	
	
	
}
