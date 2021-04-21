package com.divergentsl.initdestroyethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Both init and destroy mehtod used
 * 
 * @author Divergent
 *
 */
public class InitDestroyMethod {

	private static Logger logger = LoggerFactory.getLogger(InitDestroyMethod.class);

	public static void main(String[] args) {
		logger.debug("inside the main");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/divergentsl/fifthsample/country.xml");
		Country country = (Country) context.getBean("country");
		logger.debug("Country name : " + country.getCountryName());
	}

}
