package com.testbook;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity  
@Table(name="liabrary2000")
public class Liabrary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int liabraryId;
	String liabraryName;
	
	
	@OneToMany(mappedBy = "liabrary",cascade = CascadeType.ALL)  // bi-directional 
	Set<Book> books;



	public Liabrary() {
		super();
		// TODO Auto-generated constructor stub
	}



	



	public Liabrary(int liabraryId, String liabraryName, Set<Book> books) {
		super();
		this.liabraryId = liabraryId;
		this.liabraryName = liabraryName;
		this.books = books;
	}







	public int getLiabraryId() {
		return liabraryId;
	}



	public void setLiabraryId(int liabraryId) {
		this.liabraryId = liabraryId;
	}



	public Set<Book> getBooks() {
		return books;
	}



	public void setBooks(Set<Book> books) {
		this.books = books;
	}



	public String getLiabraryName() {
		return liabraryName;
	}



	public void setLiabraryName(String liabraryName) {
		this.liabraryName = liabraryName;
	}
	
	
	
	
}
