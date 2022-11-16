package com.project.abstraction;
/*we cannot create object for abstract class,if we try,it will create object for
 * ananoymus class(Nameless Class)*/ 
public class Tester {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.fuel();
		bike.insurence();
		bike.wheels();
		bike.weCanTravel();
		Car car=new Car();
		car.fuel();
		car.insurence();
		car.wheels();
		car.weCanTravel();
	}

}
