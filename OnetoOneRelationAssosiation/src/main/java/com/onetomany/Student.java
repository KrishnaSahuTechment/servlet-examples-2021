package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student300")
public class Student {

	@Id
	int id;
	String name;
	
	@OneToMany
	List<Course> course;
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
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> courses) {
		this.course = courses;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, ArrayList<Course> course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	
	
}
