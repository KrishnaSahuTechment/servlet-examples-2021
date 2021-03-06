package com.techment.assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class ManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		
		
		
		Authers auther1 = new Authers();
//		auther1.setAutherId(1);
		auther1.setFisrtName("krishna");
		auther1.setMiddleName("kumar");
		auther1.setLastName("sahu");
		auther1.setPhoneNo("9522222892");
		
		
		Authers auther2 = new Authers();
//		auther2.setAutherId(2);
		auther2.setFisrtName("krishna");
		auther2.setMiddleName("kumar");
		auther2.setLastName("sahu");
		auther2.setPhoneNo("9522222892");
		
		
		Authers auther3 = new Authers();
//		auther3.setAutherId(3);
		auther3.setFisrtName("Devesh");
		auther3.setMiddleName("kumar");
		auther3.setLastName("Manikpuri");
		auther3.setPhoneNo("9522222893");
		
		
		em.persist(auther1);
		em.persist(auther2);
		em.persist(auther3);
		
		List<Authers> autherList1 = new ArrayList<Authers>();
		List<Authers> autherList2 = new ArrayList<Authers>();
		List<Authers> autherList3 = new ArrayList<Authers>();
		
		autherList1.add(auther1);
		autherList2.add(auther2);
		autherList2.add(auther3);
		
		
		Book bk1 = new Book();
//		bk1.setBookId(1001);
		bk1.setPrice(500);
		bk1.setTitle("java");
		bk1.setAuther(autherList1);
		bk1.getAuther().add(auther1);
		
		Book bk2 = new Book();
//		bk2.setBookId(1002);
		bk2.setPrice(5000);
		bk2.setTitle("HTML");
		bk2.setAuther(autherList2);
		bk2.getAuther().add(auther2);
		
		
		Book bk3 = new Book();
//		bk3.setBookId(1003);
		bk3.setPrice(1000);
		bk3.setTitle("JS");
		bk3.setAuther(autherList3);
		bk3.getAuther().add(auther3);
		
		em.persist(bk1);
		em.persist(bk2);
		em.persist(bk3);
		
		em.getTransaction().commit();
		System.out.println("==================Inserted=============");
		
		em.close();
		emf.close();
		
		
		
	}

}
