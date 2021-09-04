package com.manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student400")
public class Students {

	@Id
	private int id;
	private String name;
	
	@ManyToOne
	private Library lib;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Library getLib() {
		return lib;
	}

	public void setLib(Library lib) {
		this.lib = lib;
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int id, String name, Library lib) {
		super();
		this.id = id;
		this.name = name;
		this.lib = lib;
	}
	
	
	
	
}
