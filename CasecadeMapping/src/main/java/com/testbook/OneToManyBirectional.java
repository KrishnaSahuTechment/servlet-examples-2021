package com.testbook;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyBirectional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Liabrary liabrary = new Liabrary();
		liabrary.setLiabraryName("Central  liabrary raipur");
		
		em.persist(liabrary);
		
		Book bk1 = new Book();
		bk1.setBookName("java");
		bk1.setAuther("Bala");
		bk1.setLiabrary(liabrary);
		
		Book bk2 = new Book();
		bk2.setBookName("HTML");
		bk2.setAuther("lenda");
		bk2.setLiabrary(liabrary);
		
		em.persist(bk1);
		em.persist(bk2);
		
		em.getTransaction().commit();
		System.out.println("==================Inserted=============");
		
		em.close();
		emf.close();
	}

}
