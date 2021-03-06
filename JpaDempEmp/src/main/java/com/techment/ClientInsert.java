package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientInsert {

	public static void main(String[] args) {

	EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
	EntityManager em = emf.createEntityManager();
	 em.getTransaction().begin();
	
	 Employee employee1 = new Employee();	 
	 employee1.setEid(401);
	 employee1.setEname("Gopal");
	 employee1.setDeg("Developer");
	 employee1.setSalary(50000);
	 
	 Employee employee2 = new Employee();
	 employee2.setEid(402);
	 employee2.setEname("Krishna");
	 employee2.setDeg("HR");
	 employee2.setSalary(800000);
	 
	 Employee employee3 = new Employee();
	 employee3.setEid(403);
	 employee3.setEname("Aman");
	 employee3.setDeg("QA");
	 employee3.setSalary(400000);
	 
	 Employee employee4 = new Employee();
	 employee4.setEid(404);
	 employee4.setEname("Devesh");
	 employee4.setDeg("HR");
	 employee4.setSalary(900000);
	
	 
	 em.persist(employee1);
	 em.persist(employee2);
	 em.persist(employee3);
	 em.persist(employee4);
	 
	 em.getTransaction().commit();
	 
	 em.close();
	 emf.close();
	 
	 
	}
	
}
