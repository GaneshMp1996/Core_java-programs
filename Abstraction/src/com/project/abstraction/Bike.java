package com.project.abstraction;

public class Bike extends Vehicle {

	@Override
	void price() {
		System.out.println("Bike.price()");
		
	}

	@Override
	void wheels() {
		System.out.println("Bike.wheels()");
		
	}

	@Override
	void fuel() {
		System.out.println("Bike.fuel()");
		
	}

	@Override
	void insurence() {
		System.out.println("Bike.insurence()");
		
	}

}
