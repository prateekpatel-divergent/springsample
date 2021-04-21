package com.divergentsl.autowiring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.divergentsl.beanfactoryaware.MainMethod;

/**
 * Autowiring in Bean Class
 * 
 * @author Divergent
 *
 */
public class AutowiringBeanClass {

	private static Logger logger = LoggerFactory.getLogger(MainMethod.class);

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/divergentsl/autowiring/AutowiringBean.xml");
		Employee employee = (Employee) context.getBean("employee");
		String employeeName = employee.getEmployeeName();
		String departmentName = employee.getDepartment().getDepartmentName();
		logger.debug(employeeName + " is on " + departmentName);

	}

}
