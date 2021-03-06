package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ClientUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		System.out.println("-- Update query --");
		
		
		Product p = em.find(Product.class, 1);
		System.out.println("===========================================");
		System.out.println("Product Id: "+p.getId());
		System.out.println("Product Name: "+p.getName());
		System.out.println("Product category: "+p.getCategory());
		System.out.println("Product Price: "+p.getPrice());
		
		System.out.println("===========================================");
		System.out.println("After updating price");
		
		p.setPrice(120000);
		
		System.out.println("Product Id: "+p.getId());
		System.out.println("Product Name: "+p.getName());
		System.out.println("Product category: "+p.getCategory());
		System.out.println("Product Price: "+p.getPrice());
		
		System.out.println("===========================================");
		
//		Query query = em.createQuery("UPDATE Product p SET p.price = (p.price*2)");	     	      
//	    int rowsUpdated = query.executeUpdate();
//	    System.out.println("entities Updated: " + rowsUpdated);
	      
	      
	      em.getTransaction().commit();
	      em.close();
	      emf.close();
		
	}

}
