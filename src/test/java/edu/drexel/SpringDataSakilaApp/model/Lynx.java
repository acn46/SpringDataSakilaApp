package edu.drexel.SpringDataSakilaApp.model;

public class Lynx extends Cat implements CanSPeak {
	
	public Lynx() {
		System.out.println("A new instance of Lynx created");
	}
	
	public void growl() {
		System.out.println("Growl");
	}

}
