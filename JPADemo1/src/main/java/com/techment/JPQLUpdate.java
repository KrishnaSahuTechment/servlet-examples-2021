package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		System.out.println("-- Update Products details --");
		System.out.println("==================================================");
		
		Query query = em.createQuery("update Product SET price=50000 where id=3");
		 query.executeUpdate();  
		  
         em.getTransaction().commit();  
         em.close();  
         emf.close();    
		
	}

}
