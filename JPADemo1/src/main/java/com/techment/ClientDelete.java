package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ClientDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Product p = em.find(Product.class, 4);
		
		
//		Query query = em.createQuery("DELETE FROM Product p WHERE p.name = :productName");
//		query.setParameter("productName", "Laptop");
//		int rowsDeleted = query.executeUpdate();
//        System.out.println("entities deleted: " + rowsDeleted);
        
        em.remove(p);
        
        em.getTransaction().commit();
        em.close();
		
	}

}
