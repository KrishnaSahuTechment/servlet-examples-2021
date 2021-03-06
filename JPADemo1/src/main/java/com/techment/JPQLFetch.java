package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.*;

public class JPQLFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		System.out.println("-- All Products details --");
		System.out.println("==================================================");
		
		Query qry = em.createQuery("Select p from Product p");
		
		List<Product> prodList = (List<Product>)qry.getResultList();
		
		System.out.print("ID");
		System.out.print("\tName");
		System.out.print("\tCategory");
		System.out.println("\tPrice");
		
		for(Product p :prodList)
		{
			System.out.print(p.getId());
			System.out.print("\t"+p.getName());
			System.out.print("\t"+p.getCategory());
			System.out.print("\t"+p.getPrice());
			System.out.println();
			
		}
		
		 em.getTransaction().commit();
	      em.close();
	      emf.close();
	}

}
