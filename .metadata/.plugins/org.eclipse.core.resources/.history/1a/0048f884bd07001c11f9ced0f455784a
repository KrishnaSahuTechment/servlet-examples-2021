package com.techment;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		org.hibernate.SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t=session.beginTransaction();   

		Employee employee = new Employee();
		employee.setId(14);
		employee.setName("Kishn sahu");
		employee.setSalary(500000);
		
		session.persist(employee);
		
		t.commit();
		session.close();   
		
	}

}
