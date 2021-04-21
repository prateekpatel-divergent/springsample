package com.divergentsl.initdestroyethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	
	private static Logger logger = LoggerFactory.getLogger(Country.class);
	String countryName;
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public void init() {
		logger.info("init block");
	}
	
	public void destroy() {
		logger.info("destroy block");
	}
}
