package com.divergentsl.autowiring;

public class Employee {

	String name;
	Department deprtment;
	
	public String getEmployeeName() {
		return name;
	}
	
	public void setEmployeeName(String name) {
		this.name = name;
	}
	
	public Department getDepartment() {
		return deprtment;
	}
	
	public void setDepartment(Department department) {
		this.deprtment = department;
	}
}
