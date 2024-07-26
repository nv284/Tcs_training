package com.org.jav8a;

import java.util.List;

public class Employee {

	private String name ;
	private List<String> phones;
	
	
	
	public Employee(String name, List<String> phones) {
		super();
		this.name = name;
		this.phones = phones;
	}

	public Employee(String name2, String string) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Long getEmpId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
