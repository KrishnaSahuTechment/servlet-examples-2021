package com.techment.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techment.modal.Question;

public class QuizeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Resource r=new ClassPathResource("object.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		      
		    Question q=(Question)factory.getBean("quest");  
		    q.displayInfo();  
		
	}

}
