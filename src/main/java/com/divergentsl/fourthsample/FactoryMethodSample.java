package com.divergentsl.fourthsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class FactoryMethodSample {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(new String("servicess.xml"));
		ClientService service = (ClientService) context.getBean("clientService",ClientService.class);
		service.createInstance();
	}

}
