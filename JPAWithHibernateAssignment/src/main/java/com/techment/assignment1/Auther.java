package com.techment.assignment1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="auther2002")
public class Auther {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int autherId;
	private String fisrtName;	
	private String middleName;
	private String lastName;
	private String phoneNo;
	
	public Auther() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auther(int autherId, String fisrtName, String middleName, String lastName, String phoneNo) {
		super();
		this.autherId = autherId;
		this.fisrtName = fisrtName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}

	
	
	public Auther(String fisrtName, String middleName, String lastName, String phoneNo) {
		super();
		this.fisrtName = fisrtName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}

	public int getAutherId() {
		return autherId;
	}

	public void setAutherId(int autherId) {
		this.autherId = autherId;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Auther [autherId=" + autherId + ", fisrtName=" + fisrtName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
	
}
