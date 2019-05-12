package edu.drexel.SpringDataSakilaApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("edu.drexel.SpringDataSakilaApp")
@SpringBootApplication
public class SpringDataSakilaApp {
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringDataSakilaApp.class, args);
		
	}
	
}
