package com.xworkz.InstanceOf6;

public class Tester {
	public static void main(String[] args) {
		Bike bike=new Bike();
		Car car=new Car();
		if(bike instanceof Object) {
			bike.bike();
		}
		if(car instanceof Bike) {
			car.price(bike);
		}
	}

}
