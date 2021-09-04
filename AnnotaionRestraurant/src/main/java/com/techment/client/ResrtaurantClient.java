package com.techment.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techment.modal.Tea;
import com.techment.service.Restraunt;

public class ResrtaurantClient {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();
		
		Restraunt restraunt = (Restraunt) context.getBean("restservice");
		restraunt.setRestraruntName("Krishna restrarent");
		
		
		restraunt.displayRestraruntDetails(); 		
	}
}
