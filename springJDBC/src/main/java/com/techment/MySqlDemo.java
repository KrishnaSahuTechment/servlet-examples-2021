package com.techment;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MySqlDemo {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public void createTable()
	{
		jdbcTemplate.execute("create table student(sno int(3), sname varchar(10))");
		// execute() returns void
		System.out.println("table created");
	}

	
	public void insertData()
	{
		jdbcTemplate.execute("insert into student values(101,'Krishna')");
		System.out.println("Data is inserted");
		
	}
	
	public void printData()
	{
		 jdbcTemplate.execute("select * from student");
		
		
		System.out.println("Data is inserted");
		
	}
	
	DriverManagerDataSource ds;
}

