package edu.drexel.SpringDataSakilaApp.service;

import java.util.List;
import java.util.Optional;

import edu.drexel.SpringDataSakilaApp.model.Film;

public interface FilmService {

	public List<Film> getAll();
	
	public Optional<Film> findById(int id);
	
	public Film insert(Film film);
	
	public Film update(Film film);
	
	public int delete(int id);
	
}
