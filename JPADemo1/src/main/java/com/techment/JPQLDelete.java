package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		System.out.println("-- deleted one row --");
		System.out.println("==================================================");
		
		Query query = em.createQuery("delete from Product where id=2");
		 query.executeUpdate();  
		  em.getTransaction().commit();  
	         em.close();  
	         emf.close(); 
	}

}
