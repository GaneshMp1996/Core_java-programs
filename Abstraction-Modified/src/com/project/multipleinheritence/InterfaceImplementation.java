package com.project.multipleinheritence;

public class InterfaceImplementation implements Car, Jeep {

	@Override
	public void fuel() {
		System.out.println("InterfaceImplementation.fuel()");

	}

	@Override
	public void performence() {
		System.out.println("InterfaceImplementation.performence()");

	}

	@Override
	public void price() {
		System.out.println("InterfaceImplementation.price()");

	}

	@Override
	public void speed() {
		System.out.println("InterfaceImplementation.speed()");

	}

}
