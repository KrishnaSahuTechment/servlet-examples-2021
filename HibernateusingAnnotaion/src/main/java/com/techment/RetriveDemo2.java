package com.techment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class RetriveDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		Query<StudentDto> strQuery = session.createQuery("select s.studentId,s.name from Student s");
		
		List<StudentDto> st	= strQuery.list();
		
		for(StudentDto s:st)
		{
			Object obj = (Object)s;			
			
			
			StudentDto stu = (StudentDto)s;
			System.out.println("student id  :"+stu.getStudentId()+" Name: "+stu.getName());
			
		}
		
		session.close();
		sessionFactory.close();
		
	}

}
