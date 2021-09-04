package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ClientFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		      
		Product p = em.find(Product.class,1);
		System.out.println("Product Id: "+p.getId()+" Name: "+p.getName()+" category: "+p.getCategory()+" price: "+p.getPrice());
        
        
        em.getTransaction().commit();
        em.close();
		
	}

}
