package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Product product = new Product();
		
		product.setId(5);
		product.setName("One plus Tv");
		product.setPrice(20000);
		product.setCategory("Electronics");
		
		em.persist(product);
		
		em.getTransaction().commit();  
		
		   emf.close();  
	        em.close();  
	}

}
