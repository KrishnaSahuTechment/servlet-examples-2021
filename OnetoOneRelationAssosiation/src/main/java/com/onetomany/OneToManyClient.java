package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Course java = new Course(90,"Java",4);
		Course python = new Course(190,"Python",3);
		Course bigDatab = new Course(80,"Bigdata",4);
		
		em.persist(java);
		em.persist(python);
		em.persist(bigDatab);
		
		
		List<Course> courses = new ArrayList<Course>();
		
		
		courses.add(java);
		courses.add(python);
		courses.add(bigDatab);
				
		
		Student student = new Student();
		
		student.setId(1);
		student.setName("Krishna");
		student.setCourse(courses);
		
		em.persist(student);
		
//		em.persist(address);
//		em.persist(employee);
		
		em.getTransaction().commit();
		System.out.println("==================Inserted=============");
		
		em.close();
		emf.close();
	}

}
