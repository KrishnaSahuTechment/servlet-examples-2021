package com.techmentmanytoonebycolumn;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "department304")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int depId;	
	String deptName;
	
	@OneToMany
	@JoinColumn(name="empid")
	List<Employees> employees;

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}
	
	

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String deptName, List<Employees> employees) {
		super();
		this.deptName = deptName;
		this.employees = employees;
	}

	
	
	
	
	
}
