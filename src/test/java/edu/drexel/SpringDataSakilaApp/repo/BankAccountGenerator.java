package edu.drexel.SpringDataSakilaApp.repo;

import static org.junit.Assert.assertTrue;

import edu.drexel.SpringDataSakilaApp.model.BankAccount;
import edu.drexel.SpringDataSakilaApp.repo.BankAccountRepo;
import edu.drexel.SpringDataSakilaApp.repo.BankAccountRepoImpl;

public class BankAccountGenerator {

	public void test_insert() {
		for (int i = 6; i < 50006; i++) {
			System.out.println("\ntest Insert");
			BankAccountRepo dao = new BankAccountRepoImpl();
			BankAccount bankAccount = new BankAccount(i, "checking", 13321.22);
			int bankAccountId = dao.insert(bankAccount);
			System.out.println(bankAccountId);
			assertTrue(bankAccountId > 0);
		}
	}
	
}
