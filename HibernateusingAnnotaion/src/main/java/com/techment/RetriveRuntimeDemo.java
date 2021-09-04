package com.techment;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetriveRuntimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		
		Query qry = session.createQuery("select s from student where s.dept=:x");
		qry.setParameter("x", "Arts");
		
		List<Student> list=qry.getResultList();
		
		list.forEach(s->System.out.println(s.getStudentId()+" "+s.getName()+" "+s.getDept()));
		
		
		
		session.close();
		sessionFactory.close();
		
	}

}
