package com.techment.assignment1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Auther  auther1 = new Auther();
		
//		auther1.setAutherId(1);
		auther1.setFisrtName("Anmol");
		auther1.setMiddleName("kumar");
		auther1.setLastName("verma");
		auther1.setPhoneNo("9511111891");
		
		Auther  auther2 = new Auther();
//		auther2.setAutherId(2);
		auther2.setFisrtName("devesh");
		auther2.setMiddleName("kumar");
		auther2.setLastName("Manikpuri");
		auther2.setPhoneNo("9522222892");	
		
		Auther  auther3 = new Auther();
//		auther3.setAutherId(3);
		auther3.setFisrtName("Krishna");
		auther3.setMiddleName("Kumar");
		auther3.setLastName("Sahu");
		auther3.setPhoneNo("9533333893");
		
		em.persist(auther1);
		em.persist(auther2);
		em.persist(auther3);
		
		em.getTransaction().commit();  
		
		   emf.close();  
	        em.close();  
	}

}
