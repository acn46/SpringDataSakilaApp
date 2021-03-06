package edu.drexel.SpringDataSakilaApp.service;

import java.util.List;
import java.util.Optional;

import edu.drexel.SpringDataSakilaApp.model.Country;

public interface CountryService {

	public List<Country> getAll();
	
	public Optional<Country> findById(int id);
	
	public Country insert(Country country);
	
	public Country update(Country country);
	
	public int delete(int id);

}
