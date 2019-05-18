package edu.drexel.SpringDataSakilaApp.service;

import java.util.List;
import java.util.Optional;

import edu.drexel.SpringDataSakilaApp.model.Staff;

public interface StaffService {

	public List<Staff> getAll() throws ServiceException;
	
	public Optional<Staff> findById(int id) throws ServiceException;
	
	public Staff insert(Staff staff) throws ServiceException;
	
	public Staff update(Staff staff) throws ServiceException;
	
	public int delete(int id) throws ServiceException;
	
}
