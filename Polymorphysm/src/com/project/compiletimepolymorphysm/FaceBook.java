package com.project.compiletimepolymorphysm;

public class FaceBook {
	//method overloading,,,,,,,,,,,,
	// we can overload on-static methods
	// we can overload static methods as well,,
	public static void searchUser(int userId) {
		System.out.println("Serach for ID Found: " + userId);
	}

	public static void searchUser(long cantactNumber) {
		System.out.println("Search for Phone Number Found: " + cantactNumber);

	}

	public static void searchUser(String fName, String lName) {
		System.out.println("Serach for Full Name Found: " + fName + "" + lName);

	}

	public static void searchUser(String name) {
		System.out.println("Search for Name Found: " + name);
	}

	public static void serachUser(String location, int pincode) {
		System.out.println("Search for Address found: " + location + "" + pincode);
	}
}
