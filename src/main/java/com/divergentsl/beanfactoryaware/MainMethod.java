package com.divergentsl.beanfactoryaware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MainMethod {

	private static Logger logger = LoggerFactory.getLogger(MainMethod.class);
	
	public static void main(String[] args) {
		logger.debug("Main Method");
		ApplicationContextAwareClass class1 = new ApplicationContextAwareClass("com/divergentsl/beanfactoryaware/aware.xml");
		logger.debug("ApplicationContextAwareClass:{}");
	}

}
