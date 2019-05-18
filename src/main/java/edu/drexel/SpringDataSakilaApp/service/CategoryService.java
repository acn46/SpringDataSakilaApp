package edu.drexel.SpringDataSakilaApp.service;

import java.util.List;
import java.util.Optional;

import edu.drexel.SpringDataSakilaApp.model.Category;

public interface CategoryService {

	public List<Category> getAll();
	
	public Optional<Category> findById(int id);
	
	public Category insert(Category category);
	
	public Category update(Category category);
	
	public int delete(int id);
	
}
