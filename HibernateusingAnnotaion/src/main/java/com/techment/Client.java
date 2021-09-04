package com.techment;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import com.mysql.cj.xdevapi.SessionFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		org.hibernate.SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t=session.beginTransaction();   

		Student student = new Student();  //transient state
		student.setStudentId(7);   
		student.setName("Annu");  
		student.setDept("Arts");
		
		System.out.println("inserted");
		session.persist(student);       //persistence state
		
		t.commit();
		session.close();   //detached state
		
	}

}
