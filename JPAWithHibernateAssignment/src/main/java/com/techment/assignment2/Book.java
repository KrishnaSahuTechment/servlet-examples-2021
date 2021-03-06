package com.techment.assignment2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="book2005")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private String title;
	private int price;
	
	
	@ManyToMany(mappedBy = "books") 	
	private List <Authers> authers = new ArrayList<Authers>();


	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Book(int bookId, String title, int price, List<Authers> authers) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.authers = authers;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public List<Authers> getAuther() {
		return authers;
	}


	public void setAuther(List<Authers> authers) {
		this.authers = authers;
	}
	
	
	
	
}
