package edu.drexel.SpringDataSakilaApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.drexel.SpringDataSakilaApp.model.Staff;
import edu.drexel.SpringDataSakilaApp.repo.StaffRepo;

@Service
public class StaffService {

	@Autowired
	private StaffRepo repo;
	
	public List<Staff> getAll() {
		return repo.findAll();
	}

	public Optional<Staff> findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public int insert(Staff staff) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(Staff staff) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
