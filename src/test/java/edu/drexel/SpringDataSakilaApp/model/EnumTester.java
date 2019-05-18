package edu.drexel.SpringDataSakilaApp.model;

public class EnumTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season s1 = Season.FALL;
		Season s2 = Season.WINTER;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		for (Season s : Season.values()) {
			System.out.println(s);
		}

		String[] testString = { "WINTER", "FALL", "BUFFALO", "NY" };
		for (String s : testString) {
			try {
			Season season = Season.valueOf(s);
			System.out.println(s + " -> " + season);
			}
			catch (IllegalArgumentException e) {
				System.out.println(s+  " not a valid season ");
			}
		}
	}

}
