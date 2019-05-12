package edu.drexel.SpringDataSakilaApp.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;

import edu.drexel.SpringDataSakilaApp.model.Staff;
import edu.drexel.SpringDataSakilaApp.service.StaffService;

@Path("/staffs")
public class StaffController {
	
	@Autowired
	private StaffService service;
	
	@GET
	public List<Staff> getAll() {
		System.out.println("\nin getAll");
		List<Staff> list = service.getAll();
		return list;

	}
	
	@GET
	@Path("/{id}")
	public Staff findByID(@PathParam("id") int id) {
		System.out.println("\nin findByID");
		Staff staff = service.findById(id);
		return staff;
	}
	
	@PUT
	public int insert(Staff staff) {
		System.out.println("\nin Insert");
		//Staff staff = new Staff("John", "Doe", 1, "John@compmail.com", null, 2, 1, "JDoe", "dwe23321", null);
		int staffId = service.insert(staff);
		return staffId;
	}
	
	@POST
	public int update(Staff staff) {
		System.out.println("\nin update");
		//Staff staff = new Staff("John1", "Doe", 1, "John@compmail.com", null, 2, 1, "JDoe", "dwe23321", null);
		//staff.setStaffId(10);
		int rowAffected = service.update(staff);
		return rowAffected;
	}
	
	@DELETE
	@Path("/{id}")
	public int delete(@PathParam("id") int id) {
		System.out.println("\nin delete");
		int rowAffected = service.delete(id);
		return rowAffected;
	}

}
