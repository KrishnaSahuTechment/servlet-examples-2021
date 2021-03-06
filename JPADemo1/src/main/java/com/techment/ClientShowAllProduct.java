package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ClientShowAllProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		System.out.println("-- All Products details --");
			System.out.println("===========================================================");
		 Query query = em.createQuery("SELECT p FROM Product p");
	        List<Product> resultList = query.getResultList();
	        System.out.println("Product count: "+resultList.size());
	        System.out.println("==========================================================");
	        resultList.forEach(System.out::println);
	        System.out.println("=========================================================");
	        em.close();
	}

}
