package edu.drexel.SpringDataSakilaApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.drexel.SpringDataSakilaApp.model.Film;
import edu.drexel.SpringDataSakilaApp.repo.FilmRepo;

@Service
public class FilmServiceImpl {
	
	@Autowired
	private FilmRepo repo;
	
	public List<Film> getAll() {
		return repo.findAll();
	}

	public Optional<Film> findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public Film insert(Film film) {
		// TODO Auto-generated method stub
		return repo.save(film);
	}

	public Film update(Film film) {
		// TODO Auto-generated method stub
		return repo.save(film);
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}


}
