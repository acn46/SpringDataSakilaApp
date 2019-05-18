package edu.drexel.SpringDataSakilaApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.drexel.SpringDataSakilaApp.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
