package com.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.employee.Exceptions.DataNotFound;
import com.employee.database.Database;
import com.employee.model.Manager;

public class ManagerService {
	
	
	private static Map<Long,Manager> managers = Database.getEmployees(); 
	
	public ManagerService() {
		managers.put(1L,new Manager(1,"Robert","CS_ACCOUNTS"));
		managers.put(2L,new Manager(2,"Thomas","CS_PAYMENTS"));
	}
	
	public List<Manager> getAllManagers(){
		// Passing a collection to the ArrayList constructor, initialized the List with those elements.
		return new ArrayList<Manager>(managers.values()); 	
	}
	
	public static Manager getManager(long id) {
		Manager manager = managers.get(id);
		if(manager==null) {
			throw new DataNotFound("Data Not found of: "+id);
		}
		return manager;
		//Handling exception is done by 1.Prepare JSON Response, 2.Map the JSON Response to exception
	}
		
	public static Manager addManager(Manager employee) {
		employee.setId(managers.size()+1);
		managers.put(employee.getId(),employee);
		return employee;
	}
	
	public static Manager updateManager(Manager employee) {
		if(employee.getId() <= 0) {
			return null;	
		}
		managers.put(employee.getId(), employee);
		return employee;
		
	}
	
	public static Manager removeManager(long id) {
		return managers.remove(id);
	}
}
