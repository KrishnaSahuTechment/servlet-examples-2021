package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CriteriaSelect {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		
		Root<Product> prod  = cq.from(Product.class);
		cq.select(prod.get("id"));
		
		CriteriaQuery<Product> select = cq.select(prod);
		TypedQuery<Product> tq = em.createQuery(select);
		List<Product> list = tq.getResultList();
		
		System.out.println(" ");
		
		System.out.println("===============");
		System.out.println("ID");
		
		
		for(Product p3 :list)
		{
			System.out.println(p3.getId());
			
		}
		System.out.println("==============");
		
		em.getTransaction().commit();  
		
		   emf.close();  
	        em.close();  
	}
	
}
