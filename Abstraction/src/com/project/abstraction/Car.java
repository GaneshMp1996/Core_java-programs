package com.project.abstraction;

public class Car extends Vehicle {

	@Override
	void price() {
		System.out.println("Car.price()");
		
	}

	@Override
	void wheels() {
		System.out.println("Car.wheels()");
		
	}

	@Override
	void fuel() {
		System.out.println("Car.fuel()");
		
	}

	@Override
	void insurence() {
		System.out.println("Car.insurence()");
		
	}

}
