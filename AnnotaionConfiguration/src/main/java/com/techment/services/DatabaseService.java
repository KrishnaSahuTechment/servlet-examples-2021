package com.techment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.techment.dao.Employee;
import com.techment.dao.IDao;

@Service("dbservice")
public class DatabaseService {

	@Autowired
	@Qualifier("mySql")  //@Qualifier("oracle")
	IDao dao;
	
	@Autowired
	Employee employees;
	
	public void displayDatabaseInfo()
	{
		employees.displayEmployee();
		dao.databaseName();
		System.out.println("connectiong to oracle  database");
	}
	
}
