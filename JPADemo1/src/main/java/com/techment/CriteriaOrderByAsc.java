package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CriteriaOrderByAsc {

	public static void main(String[] args) {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		
		Root<Product> prod  = cq.from(Product.class);
		
		cq.orderBy(cb.asc(prod.get("price")));
		
		
		CriteriaQuery<Product> select = cq.select(prod);
		TypedQuery<Product> tq = em.createQuery(select);
		List<Product> list = tq.getResultList();
		
		System.out.println("sort by order by price in ascending order");
		System.out.println("==================================================");
		System.out.print("ID");
		System.out.print("\t \t Name");
		System.out.print("\t \t Category");
		System.out.println("\t \t Price");
		
		for(Product p3 :list)
		{
			System.out.print(p3.getId());
			System.out.print("\t \t "+p3.getName());
			System.out.print("\t \t "+p3.getCategory());
			System.out.print("\t \t "+p3.getPrice());
			System.out.println();
			
		}
		System.out.println("==================================================");
		em.getTransaction().commit();  
		
		   emf.close();  
	        em.close();  
		
	}

}
