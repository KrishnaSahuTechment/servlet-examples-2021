package com.techmentmanytoonebycolumn;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneClientByColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		
		Employees e1 = new Employees("Hari","developer");
		Employees e2 = new Employees("Ram","hr");
		
		em.persist(e1);
		em.persist(e2);
		
		
		List<Employees> employees = new ArrayList<Employees>();
		employees.add(e1);
		employees.add(e2);
		
		Department d1 = new Department();
		d1.setDeptName("hr");
		d1.setEmployees(employees);
		
		em.persist(d1);
		
		
		em.getTransaction().commit();
		System.out.println("==================Inserted=============");
		
		em.close();
		emf.close();
	}

}
