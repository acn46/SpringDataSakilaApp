package edu.drexel.SpringDataSakilaApp.repo;

import java.util.List;

import edu.drexel.SpringDataSakilaApp.model.Staff;

public interface StaffRepo {
	List<Staff> getAll();
	Staff findById(int id);
	int insert(Staff staff);
	int update(Staff staff);
	int delete(int id);
}
