package com.employee.employee_resources;

import javax.ws.rs.core.MediaType;

import com.employee.model.Manager;
import com.employee.service.ManagerService;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/managers")
public class Manager_Resource {
	
	ManagerService e = new ManagerService();
	

	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Manager> getManagers() {
		return e.getAllManagers();
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Manager addManager(Manager manager) {
		return ManagerService.addManager(manager);
	}
	
	@PUT
	@Path("/{managerId}") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Manager updateManager(@PathParam("managerId") long id,Manager manager) {
		manager.setId(id);
		return ManagerService.updateManager(manager);
	}
	
	@DELETE
	@Path("/{managerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Manager deleteManager(@PathParam("managerId") long id) {
		return ManagerService.removeManager(id);
	}
	
	@GET
	@Path("/{managerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Manager getManagerInfo(@PathParam("managerId") long id) {
		return ManagerService.getManager(id);
	}
	
	@Path("/{managerId}/employees")
	public Employee_Resource getEmployeeResource(){
		return new Employee_Resource();
	}
	

}
