package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Address address = new Address();
		address.setDoorNo(1002);
		address.setStreetName("BTM");
		address.setCity("Raipur");
		
		Employee employee = new Employee();
		employee.setId(102);
		employee.setName("Krish");
		employee.setDesignation("Devolper");
		employee.setAddress(address);
		
		em.persist(address);
		em.persist(employee);
		
		em.getTransaction().commit();
		System.out.println("==================Inserted=============");
		
		em.close();
		emf.close();
	}

}
