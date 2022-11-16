package com.xworkz.InstanceOf4;

public class Parent {

	public void demo(Parent parent) {
		System.out.println("Parent.demo()");
		System.out.println(parent.getClass());
	}
}
