package com.techment.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="auther2005")
public class Authers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int autherId;
	private String fisrtName;	
	private String middleName;
	private String lastName;
	private String phoneNo;
	
	@ManyToMany     // bi-directional 
	List<Book> books = new ArrayList<Book>();
	
	public Authers() {
		super();
		// TODO Auto-generated constructor stub
	}	

	public Authers(int autherId, String fisrtName, String middleName, String lastName, String phoneNo, List<Book> books) {
		super();
		this.autherId = autherId;
		this.fisrtName = fisrtName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
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
		return "\nfisrtName: "+fisrtName+" "+ middleName+" "+lastName+ "\nphoneNo: "+phoneNo+" ";
	}
	
	
	
	
}
