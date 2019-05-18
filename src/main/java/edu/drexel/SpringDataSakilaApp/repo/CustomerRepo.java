package edu.drexel.SpringDataSakilaApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.drexel.SpringDataSakilaApp.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
