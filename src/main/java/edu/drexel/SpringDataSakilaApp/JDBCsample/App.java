package edu.drexel.SpringDataSakilaApp.JDBCsample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.drexel.SpringDataSakilaApp.model.BankAccount;
import edu.drexel.SpringDataSakilaApp.service.BankAccountServiceImpl;

/**
 * JdbcSample app.
 *
 */
public class App {
    private static final int NBR_OF_INSERTS = 5000;
    private static int startKounter = 6;

    @Autowired
	private static BankAccountServiceImpl service;
	
    
	public static void main( String[] args ) {
        System.out.println( "App - starting ..." );
        long startTime = System.currentTimeMillis();
        
//		for (int i = 0; i < NBR_OF_INSERTS; i++) {
//			int accountId = insertBankAccount(i);
//			
//			if (i % 1000 == 0) {
//				System.out.println("Inserted "+i+" accounts.");
//			}
//		}
		
        List<BankAccount> accountList = new ArrayList<>();
        for (int i = 0; i < NBR_OF_INSERTS; i++) {
        	String type = ((i % 2) == 0) ? "checking" : "saving" ;
        	BankAccount bankAccount = new BankAccount(startKounter + i, type, (startKounter + i) * 100.00 );
        	accountList.add(bankAccount);
        }
        
        insertBankAccount(accountList);
        
		long endTime = System.currentTimeMillis();
		System.out.println("Elapsed time: "+ ((endTime - startTime) / 1000) + " seconds.");
    }
	
	
	private static int insertBankAccount(List<BankAccount> accountList) {
		int bankAccountId = service.insertList(accountList);
		return bankAccountId;
	}
}
