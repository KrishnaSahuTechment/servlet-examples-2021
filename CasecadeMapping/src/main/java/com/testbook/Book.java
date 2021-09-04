package com.testbook;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity  
@Table(name="book2000")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bookid;
	String bookName;
	String auther;
	
	@ManyToOne
	@JoinColumn(name="liabraryId")
	Liabrary liabrary;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookid, String bookName, String auther, Liabrary liabrary) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.auther = auther;
		this.liabrary = liabrary;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public Liabrary getLiabrary() {
		return liabrary;
	}

	public void setLiabrary(Liabrary liabrary) {
		this.liabrary = liabrary;
	}
	
	
	
}
