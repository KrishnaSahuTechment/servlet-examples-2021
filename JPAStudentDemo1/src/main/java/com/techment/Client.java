package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		
		Student student1 = new Student();
		
		student1.setS_id(110);
		student1.setS_name("Krish sahu");
		student1.setS_age(27);
		
		
		em.persist(student1);
		
		em.getTransaction().commit();
		
//		em.close();
//		emf.close();
//			
		

		
	}

}
