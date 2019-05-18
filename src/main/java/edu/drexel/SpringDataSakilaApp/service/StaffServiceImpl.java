package edu.drexel.SpringDataSakilaApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.drexel.SpringDataSakilaApp.model.Staff;
import edu.drexel.SpringDataSakilaApp.repo.StaffRepo;

@Service
public class StaffServiceImpl implements StaffService {

	@Autowired
	private StaffRepo repo;
	
	@Override
	public List<Staff> getAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Staff> findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Staff insert(Staff staff) {
		// TODO Auto-generated method stub
		return repo.save(staff);
	}

	@Override
	public Staff update(Staff staff) {
		// TODO Auto-generated method stub
		return repo.save(staff);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
