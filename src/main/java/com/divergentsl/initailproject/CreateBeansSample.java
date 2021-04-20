package com.divergentsl.initailproject;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CreateBeansSample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
		BeanSupportSample sample = (BeanSupportSample) context.getBean("support");
		sample.getMessage();
	}
}
