package com.employee.employee_resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;


@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Employee_Resource {

	private EmployeeService em = new EmployeeService();
	
	@GET
	public List<Employee> getAllEmployees(@PathParam("managerId") long managerId) {
		return em.getAllEmployees(managerId);
	}
	
	@POST
	public Employee addEmployee(@PathParam("managerId") long managerId, Employee employee) {
		return em.addEmployee(managerId, employee);
	}
	
	@PUT
	@Path("/{employeeId}")
	public Employee updateEmployee (@PathParam("managerId") long managerId, @PathParam("employeeId") long employeeId, Employee employee) {
		employee.setId(employeeId);
		return em.updateEmployee(managerId, employee);
	}
	
	@DELETE
	@Path("/{employeeId}")
	public void deleteEmployee(@PathParam("managerId") long managerId,@PathParam("employeeId") long employeeId) {
		em.removeEmployee(managerId, employeeId);
	}
	
	@GET
	@Path("/{employeeId}")
	public Employee getEmployee(@PathParam("managerId") long managerId,@PathParam("employeeId") long employeeId) {
		return em.getEmployee(managerId, employeeId);
	}
}

