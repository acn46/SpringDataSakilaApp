package edu.drexel.SpringDataSakilaApp.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;

import edu.drexel.SpringDataSakilaApp.model.BankAccount;
import edu.drexel.SpringDataSakilaApp.service.BankAccountServiceImpl;

@Path("/bankaccounts")
public class BankAccountController {
	
	@Autowired
	private BankAccountServiceImpl service;
	
	@GET
	public List<BankAccount> getAll() {
		System.out.println("\nin getAll");
		List<BankAccount> list = service.getAll();
		return list;
	}
	
	@GET
	@Path("/{id}")
	public BankAccount findByID(@PathParam("id") int id) {
		System.out.println("\nin findByID");
		BankAccount bankAccount = service.findByID(id);
		System.out.println("bankAccount = " + bankAccount);
		return bankAccount;
		}

	@PUT
	public int insert(BankAccount bankAccount) {
		System.out.println("\nin Insert");
		//BankAccount bankAccount = new BankAccount(5, "checking", 13321.22);
		int bankAccountId = service.insert(bankAccount);
		return bankAccountId;
	}
	
	@POST
	public int update(BankAccount bankAccount) {
		System.out.println("\nin update");
		//BankAccount bankAccount = new BankAccount(4, "checking", 10000);
		//bankAccount.setAccountId(5);
		int rowAffected = service.update(bankAccount);
		return rowAffected;
	}
	
	@DELETE
	@Path("/{id}")
	public int delete(@PathParam("id") int id) {
		System.out.println("\nin delete");
		int rowAffected = service.delete(id);
		return rowAffected;
	}
	
	//@POST
	public void transfer(float amount, int accountFrom, int accountTo) {
		System.out.println("\ntest transfer");
		int[] rowAffected = service.transfer(amount, accountFrom, accountTo);
				System.out.println(rowAffected[0] + ", " + rowAffected[1]);
	}

}
