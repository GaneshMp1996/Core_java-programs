package com.project.abstraction;

abstract class Vehicle {
	//Concrete Method
	public void weCanTravel() {
		System.out.println("by suing vehicels,we can travel anywhere,,");
	}

	abstract void price();
	abstract void wheels();
	abstract void fuel();
	abstract void insurence();

}
