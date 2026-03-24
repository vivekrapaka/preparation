package com.preparation.eightfeature;

import java.util.List;

public class Department {

	String department;
	List<String> employee;
	String name ; 
	int age;
	double salary;
	
	Department(String department, List<String> employee){
		this.department = department;
		this.employee = employee;
	}
	
	public Department(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<String> getEmployee() {
		return employee;
	}

	public void setEmployee(List<String> employee) {
		this.employee = employee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " "+ age +" "+ salary;
	}
	
	
	
}
