package edu.drexel.SpringDataSakilaApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.drexel.SpringDataSakilaApp.model.Film;

@Repository
public interface FilmRepo extends JpaRepository<Film, Integer>{

}
