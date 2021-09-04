package com.techment.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techment.modal.Bank;

public class ClientApp {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("object.xml"); // it will point to the file
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Bank bank = (Bank)factory.getBean("bankobj");
		bank.displayBankDetails();
		
	}

}
