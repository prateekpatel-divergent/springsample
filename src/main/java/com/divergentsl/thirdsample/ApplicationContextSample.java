package com.divergentsl.thirdsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextSample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String("services.xml"));
		Employee emp = context.getBean("employee", Employee.class);
		emp.show();
	}

}
