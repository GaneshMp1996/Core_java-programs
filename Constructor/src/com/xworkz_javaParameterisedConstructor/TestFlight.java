package com.xworkz_javaParameterisedConstructor;

public class TestFlight {
	public static void main(String[] args) {
		
		Flight flight=new Flight ("indigo","ac123",400,"bengalore","hubli"); //constructor of flight class
		System.out.println(flight.name);
				System.out.println(flight.number);
				System.out.println(flight.capacity);
				System.out.println(flight.source);
				System.out.println(flight.destination);
				
				Flight flight1=new Flight();
				System.out.println(flight1.name);
				System.out.println(flight1.number);
				System.out.println(flight.capacity);
				System.out.println(flight1.source);
				System.out.println(flight1.destination);
			}


}
