package com.employee.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Manager {

	public long id;
	public Date dob;
	public String name;
	public String project_name;
	private Map<Long,Employee> employee = new HashMap<>();
	
	public Manager() {
		
	}
	
	public Manager(long id, String name, String project_name) {
		super();
		this.id = id;
		this.name = name;
		this.project_name = project_name;
		this.dob = new Date();

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getproject_name() {
		return project_name;
	}

	public void setproject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public Map<Long, Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Map<Long, Employee> employee) {
		this.employee = employee;
	} 
	
	
	
	
}
