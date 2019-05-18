package edu.drexel.SpringDataSakilaApp.service;

import java.util.List;
import java.util.Optional;

import edu.drexel.SpringDataSakilaApp.model.Staff;

public interface StaffService {

	public List<Staff> getAll();
	
	public Optional<Staff> findById(int id);
	
	public Staff insert(Staff staff);
	
	public Staff update(Staff staff);
	
	public int delete(int id);
	
}
