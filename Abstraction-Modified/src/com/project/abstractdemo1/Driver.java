package com.project.abstractdemo1;

public class Driver {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.price();
		bike.wheel();
		System.out.println("************************");
		Car car=new Car();
		car.wheel();
		car.price();
	}

}
