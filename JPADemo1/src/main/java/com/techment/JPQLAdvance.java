package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLAdvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		System.out.println("-- Product which price between 5000 to 10000 --");
		System.out.println("==================================================");
		
		Query query1  = em.createQuery("Select p from Product p where p.price between 5000 and 20000");
		@SuppressWarnings("unchecked")  
		List<Product> prodList1 = (List<Product>)query1 .getResultList();
		
		System.out.print("ID");
		System.out.print("\tName");
		System.out.print("\tCategory");
		System.out.println("\tPrice");
		
		for(Product p :prodList1)
		{
			System.out.print(p.getId());
			System.out.print("\t"+p.getName());
			System.out.print("\t"+p.getCategory());
			System.out.print("\t"+p.getPrice());
			System.out.println();
			
		}
		
		System.out.println("-- Products details of Electronics catergory  --");
		System.out.println("==================================================");
		Query query2  = em.createQuery("Select p from Product p where p.category ='Electronics'");
		@SuppressWarnings("unchecked")  
		List<Product> prodList2 = (List<Product>)query2 .getResultList();
		
		System.out.print("ID");
		System.out.print("\tName");
		System.out.print("\tCategory");
		System.out.println("\tPrice");
		
		for(Product p2 :prodList2)
		{
			System.out.print(p2.getId());
			System.out.print("\t"+p2.getName());
			System.out.print("\t"+p2.getCategory());
			System.out.print("\t"+p2.getPrice());
			System.out.println();
			
		}
		
		System.out.println("-- Products details have 'a'  --");
		System.out.println("==================================================");
		Query query3  = em.createQuery("Select p from Product p where p.name like '%a%' ");
		@SuppressWarnings("unchecked")  
		List<Product> prodList3 = (List<Product>)query3 .getResultList();
		
		System.out.print("ID");
		System.out.print("\tName");
		System.out.print("\tCategory");
		System.out.println("\tPrice");
		
		for(Product p3 :prodList3)
		{
			System.out.print(p3.getId());
			System.out.print("\t"+p3.getName());
			System.out.print("\t"+p3.getCategory());
			System.out.print("\t"+p3.getPrice());
			System.out.println();
			
		}
		System.out.println("==================================================");
		em.getTransaction().commit();  
		
		   emf.close();  
	        em.close(); 
	}

}
