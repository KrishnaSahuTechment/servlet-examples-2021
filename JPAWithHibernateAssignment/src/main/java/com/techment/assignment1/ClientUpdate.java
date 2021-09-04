package com.techment.assignment1;

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
		
		
		Auther a = em.find(Auther.class, 1);
		
		System.out.println("===========================================");
		
		System.out.println("Auther Id: "+a.getAutherId());
		System.out.println("Auther firsName: "+a.getFisrtName());
		System.out.println("Auther middleName "+a.getMiddleName());
		System.out.println("Auther lastName: "+a.getLastName());
		System.out.println("Auther phone No: "+a.getPhoneNo());
		
		
		System.out.println("===========================================");
		System.out.println("After updating price");
		
		a.setLastName("Verma");
		a.setPhoneNo("95888888892");
		
		System.out.println("Auther Id: "+a.getAutherId());
		System.out.println("Auther firsName: "+a.getFisrtName());
		System.out.println("Auther middleName "+a.getMiddleName());
		System.out.println("Auther lastName: "+a.getLastName());
		System.out.println("Auther phone No: "+a.getPhoneNo());
		
		System.out.println("===========================================");
		
//		Query query = em.createQuery("UPDATE Product p SET p.price = (p.price*2)");	     	      
//	    int rowsUpdated = query.executeUpdate();
//	    System.out.println("entities Updated: " + rowsUpdated);
	      
	      
	      em.getTransaction().commit();
	      em.close();
	      emf.close();
		
	}

}
