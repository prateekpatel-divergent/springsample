package com.divergentsl.secondsample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * That Program Only for Practice run write way check.
 * 
 * @author Divergent
 *
 */
public class EmployeeTestSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("secondsample.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee emp = factory.getBean("employee", Employee.class);
		emp.show();
	}

}
