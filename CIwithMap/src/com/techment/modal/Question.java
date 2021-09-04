package com.techment.modal;

import java.util.*;

public class Question {

	private int id;  
	private String name;  
	private Map<String,String> answers;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Question(int id, String name, Map<String, String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}  
	
	
	
	
}
