package com.divergentsl.beanfactoryaware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareClass implements ApplicationContextAware{

	private static Logger logger = LoggerFactory.getLogger(ApplicationContextAwareClass.class);

	public ApplicationContextAwareClass(String string) {
		logger.debug("Custrutor load");
	}
	
	@Autowired
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		MainMethod mainMethod = (MainMethod) applicationContext.getBean("MainMethod",MainMethod.class);
		logger.debug("Main Method Bebug show");
	}
}
