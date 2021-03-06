package com.techment.assignment1;

import java.util.List;

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
		
		System.out.println("-- All auther details  before deleting--");
		System.out.println("===========================================================");
		
		Query query1 = em.createQuery("SELECT a FROM Auther a");
        List<Auther> resultList1 = query1.getResultList();
        System.out.println("Auther count: "+resultList1.size());
        System.out.println("==========================================================");
        resultList1.forEach(System.out::println);
        System.out.println("=========================================================");
		
		
		Auther auther = em.find(Auther.class, 7);
		
		
		
		
//		Query query = em.createQuery("DELETE FROM Product p WHERE p.name = :productName");
//		query.setParameter("productName", "Laptop");
//		int rowsDeleted = query.executeUpdate();
//        System.out.println("entities deleted: " + rowsDeleted);
        
		
        em.remove(auther);
        
        System.out.println("-- All auther details  after deleting--");
		System.out.println("===========================================================");
		
		Query query2 = em.createQuery("SELECT a FROM Auther a");
        List<Auther> resultList2 = query2.getResultList();
        System.out.println("Auther count: "+resultList2.size());
        System.out.println("==========================================================");
        resultList2.forEach(System.out::println);
        System.out.println("=========================================================");
        
        
        em.getTransaction().commit();
        em.close();
		
	}

}
