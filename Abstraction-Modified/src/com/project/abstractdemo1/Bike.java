package com.project.abstractdemo1;

public class Bike extends Vehicle {

	@Override
	void wheel() {
		System.out.println("Bike.wheel()");
		System.out.println("2 wheels for Bike,,,");
		
	}

	@Override
	void price() {
		System.out.println("Bike.price()");
		System.out.println("Average Price of bike is 70k,,");
		
	}

}
