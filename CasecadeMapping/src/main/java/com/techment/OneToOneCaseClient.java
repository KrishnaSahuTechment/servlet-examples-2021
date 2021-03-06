package com.techment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneCaseClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Student s1 = new Student();
		s1.setsId(101);
		s1.setsName("Krishna");
		s1.setsAge(26);
		
		
		
		Subject subject1 = new Subject();
		
		subject1.setName("Maths");
		subject1.setMarks(70);
		subject1.setsId(s1.getsId());
		
		
		
		s1.setSub(subject1);
		 em.persist(s1);
		
		em.getTransaction().commit();
		System.out.println("==================Inserted=============");
		
		em.close();
		emf.close();
	}

}
