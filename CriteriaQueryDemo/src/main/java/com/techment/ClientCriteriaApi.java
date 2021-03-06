package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class ClientCriteriaApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf= Persistence.createEntityManagerFactory("CQ");
		EntityManager em = emf.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		
		CriteriaQuery<Object> CQ = cb.createQuery();
		Root<Employee> from = CQ.from(Employee.class);
		
		//select all records
		 System.out.println("Select all records");
		 CriteriaQuery<Object> select = CQ.select(from);
		 TypedQuery<Object> typedQuery = em.createQuery(select);
		   List<Object> resultlist = typedQuery.getResultList();
		   

		   for(Object o:resultlist) {
		      Employee e = (Employee)o;
		      System.out.println("EID : " + e.getEid() + " Ename : " + e.getEname());
		   }
		   
		   
		   //Ordering the records 
		   System.out.println("Select all records by follow ordering");
		   
		   CriteriaQuery<Object> select1 = CQ.select(from);
		   select1.orderBy(cb.asc(from.get("ename")));
		   
		   TypedQuery<Object> typedQuery1 = em.createQuery(select);
		   List<Object> resultlist1 = typedQuery1.getResultList();
		   
		   for(Object o:resultlist1){
			      Employee e=(Employee)o;
			      System.out.println("EID : " + e.getEid() + " Ename : " + e.getEname());
			   }

		   
		   
		 em.close();
		 emf.close();
		
	}

}
