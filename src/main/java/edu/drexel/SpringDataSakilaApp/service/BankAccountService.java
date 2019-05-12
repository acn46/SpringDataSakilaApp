package edu.drexel.SpringDataSakilaApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.drexel.SpringDataSakilaApp.model.BankAccount;

@Service
public class BankAccountService {

	public List<BankAccount> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public BankAccount findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insert(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int[] transfer(float amount, int accountFrom, int accountTo) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insertList(List<BankAccount> accountList) {
		// TODO Auto-generated method stub
		return 0;
	}

}
