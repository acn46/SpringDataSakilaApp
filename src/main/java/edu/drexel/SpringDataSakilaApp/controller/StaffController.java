package edu.drexel.SpringDataSakilaApp.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.drexel.SpringDataSakilaApp.model.Staff;
import edu.drexel.SpringDataSakilaApp.service.StaffService;

@RestController
public class StaffController {
	
	@Autowired
	private StaffService service;
	
	@GetMapping("/staffs")
	public List<Staff> getAll() {
		System.out.println("\nin getAll");
		List<Staff> list = service.getAll();
		return list;

	}
	
	@GetMapping("/staff/{id}")
	public Staff findByID(@PathVariable("id") int id) {
		System.out.println("\nin findByID "+id);
		Optional<Staff> returnValue = service.findById(id);
		return returnValue.get();
	}
	
	@PostMapping("/staff/insert")
	public @ResponseBody int insert(@RequestBody Staff staff) {
		System.out.println("\nin Insert");
		//Staff newStaff = new Staff("John", "Doe", 1, "", "John@compmail.com", 2, 1, "JDoe", "dwe23321", null);
		Staff updatedStaff = service.insert(staff);
		return updatedStaff.getStaffId();
	}
	
	@PostMapping("/staff/update")
	public @ResponseBody int update(@RequestBody Staff staff) {
		System.out.println("\nin update");
		//Staff staff = new Staff("John1", "Doe", 1, "John@compmail.com", null, 2, 1, "JDoe", "dwe23321", null);
		//staff.setStaffId(10);
		Staff updatedStaff = service.update(staff);
		return updatedStaff.getStaffId();
	}
	
	@DeleteMapping("/staff/{id}")
	public int delete(@PathParam("id") int id) {
		System.out.println("\nin delete");
		int rowAffected = service.delete(id);
		return rowAffected;
	}

}
