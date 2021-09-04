package com.manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOneClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Library ds = new Library(101,"DataStructure");
		
		
		em.persist(ds);
		
						
		
		Students student1 = new Students();
		
		student1.setId(101);
		student1.setName("Krishna");
		student1.setLib(ds);
		
		Students student2 = new Students();
		
		student2.setId(102);
		student2.setName("Anmol");
		student2.setLib(ds);
		
		em.persist(student1);
		em.persist(student2);
		
		
		em.getTransaction().commit();
		System.out.println("==================Inserted=============");
		
		em.close();
		emf.close();
	}

}
