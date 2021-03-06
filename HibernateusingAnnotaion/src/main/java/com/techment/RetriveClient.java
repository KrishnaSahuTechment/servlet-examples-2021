package com.techment;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

public class RetriveClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		org.hibernate.SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t=session.beginTransaction();   

		Student student =(Student)session.load(Student.class, new Integer(2));
		System.out.println("id "+student.getStudentId()+" name: "+student.getName()+" dept:  "+student.getDept());
	}

}
