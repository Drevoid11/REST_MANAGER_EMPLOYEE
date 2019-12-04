package com.employee.model;


public class Employee {

	public String name;
	public String position;
	public long id;
	
	public Employee() {
		
	}
		
	public Employee(String name, String position, long id) {
		this.name = name;
		this.position = position;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
