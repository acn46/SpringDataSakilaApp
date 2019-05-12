package edu.drexel.SpringDataSakilaApp.repo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import edu.drexel.SpringDataSakilaApp.model.Address;
import edu.drexel.SpringDataSakilaApp.model.Staff;

@ComponentScan("edu.drexel.SpringDataSakilaApp")
@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressRepoTester {

	@Autowired
	private AddressRepo addressRepo;
	
	@Autowired
	private StaffRepo staffRepo; 
	
	@Test
	public void test() {

		long currentRowCount = addressRepo.count();
		System.out.println("Row Count Address = " + currentRowCount);
		
		long numberStaff = staffRepo.count();
		System.out.println("Row Count Staff = " + numberStaff);
		
		List<Address> addresses = addressRepo.findAll();
		List<Staff> staffs = staffRepo.findAll();
		
		for (Staff staff : staffs ) {
			System.out.println(staff);
		}
		
		for (Address address : addresses) {
			System.out.println(address);
		}
		
	}

}
