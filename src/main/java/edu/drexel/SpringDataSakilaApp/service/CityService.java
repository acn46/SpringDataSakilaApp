package edu.drexel.SpringDataSakilaApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.drexel.SpringDataSakilaApp.model.Category;
import edu.drexel.SpringDataSakilaApp.model.City;
import edu.drexel.SpringDataSakilaApp.repo.CategoryRepo;
import edu.drexel.SpringDataSakilaApp.repo.CityRepo;

@Service
public class CityService {
	
	@Autowired
	public CityRepo repo;
	
	public List<City> getAll() {
		return repo.findAll();
	}

	public Optional<City> findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public City insert(City city) {
		// TODO Auto-generated method stub
		return repo.save(city);
	}

	public City update(City city) {
		// TODO Auto-generated method stub
		return repo.save(city);
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}


}
