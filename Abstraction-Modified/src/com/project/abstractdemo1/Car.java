package com.project.abstractdemo1;

public class Car extends Vehicle {

	@Override
	void wheel() {
		System.out.println("Car.wheel()");
		System.out.println("4 wheels for Car");
		
	}

	@Override
	void price() {
		System.out.println("Car.price()");
		System.out.println("Average Price for Car id 5 lakh,,");
		
	}

	

}
