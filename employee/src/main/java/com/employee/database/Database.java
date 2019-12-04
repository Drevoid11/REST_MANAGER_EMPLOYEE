package com.employee.database;

import java.util.*;

import com.employee.model.Manager;

public class Database {

	private static Map<Long,Manager> managers = new HashMap<>();
	
	public static Map<Long, Manager> getEmployees() {
		return managers;
	}
	
	
	
	
}
