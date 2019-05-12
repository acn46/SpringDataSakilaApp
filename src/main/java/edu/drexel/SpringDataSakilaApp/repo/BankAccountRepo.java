package edu.drexel.SpringDataSakilaApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.drexel.SpringDataSakilaApp.model.BankAccount;

@Repository
public interface BankAccountRepo extends JpaRepository<BankAccount, Integer>{

}
