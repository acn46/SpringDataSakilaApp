package edu.drexel.SpringDataSakilaApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.drexel.SpringDataSakilaApp.model.Category;
import edu.drexel.SpringDataSakilaApp.model.Staff;
import edu.drexel.SpringDataSakilaApp.repo.CategoryRepo;

@Service
public class CategoryService {
	
	@Autowired
	public CategoryRepo repo;
	
	public List<Category> getAll() {
		return repo.findAll();
	}

	public Optional<Category> findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public Category insert(Category category) {
		// TODO Auto-generated method stub
		return repo.save(category);
	}

	public Category update(Category category) {
		// TODO Auto-generated method stub
		return repo.save(category);
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}


}
