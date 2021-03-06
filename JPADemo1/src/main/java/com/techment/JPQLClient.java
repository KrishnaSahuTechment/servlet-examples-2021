package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		System.out.println("-- All Products details --");
		System.out.println("==================================================");
		
		Query qry = em.createNamedQuery("findAllProduct");
		List<Product> productList = qry.getResultList();
		
		for(Product p:productList)
		{
			System.out.println("--------------------------------------------------");
			System.out.println(p.getId()+" name: "+p.getName()+" category: "+p.getCategory());
					
		}
		
		System.out.println("==================================================");
		
		em.close();
		emf.close();
		
	}

}
