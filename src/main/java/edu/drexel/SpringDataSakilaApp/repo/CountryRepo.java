package edu.drexel.SpringDataSakilaApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.drexel.SpringDataSakilaApp.model.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Integer>{

}
