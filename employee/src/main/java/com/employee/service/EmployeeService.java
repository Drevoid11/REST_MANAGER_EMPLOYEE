package com.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.employee.database.Database;
import com.employee.model.Employee;
import com.employee.model.Manager;

public class EmployeeService {

	private Map<Long,Manager> manager = Database.getEmployees();
	
	public List<Employee> getAllEmployees(long id){
		Map<Long,Employee> employee = manager.get(id).getEmployee();
		return new ArrayList<Employee>(employee.values());
	}
	
	public Employee getEmployee(long managerId, long employeeId){
		Map<Long,Employee> employee = manager.get(managerId).getEmployee();
		return employee.get(employeeId);
	}
	
	public Employee addEmployee(long managerId, Employee employee) {
		Map<Long,Employee> employees = manager.get(managerId).getEmployee();
		employee.setId(employees.size()+1);
		employees.put(employee.getId(),employee);
		return employee;
	}
	
	public Employee updateEmployee(long managerId, Employee employee) {
		Map<Long,Employee> employees= manager.get(managerId).getEmployee();
		if(employee.getId() <=0) {
			return null;
		}
		employees.put(employee.getId(),employee);
		return employee;
	}
	
	public Employee removeEmployee(long managerId, long employeeId) {
		Map<Long,Employee> employee = manager.get(managerId).getEmployee();
		return employee.remove(employeeId);
	}
	
}
