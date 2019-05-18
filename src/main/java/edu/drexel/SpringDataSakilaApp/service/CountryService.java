package edu.drexel.SpringDataSakilaApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.drexel.SpringDataSakilaApp.model.Country;
import edu.drexel.SpringDataSakilaApp.repo.CountryRepo;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepo repo;
	
	public List<Country> getAll() {
		return repo.findAll();
	}

	public Optional<Country> findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public Country insert(Country country) {
		// TODO Auto-generated method stub
		return repo.save(country);
	}

	public Country update(Country country) {
		// TODO Auto-generated method stub
		return repo.save(country);
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
