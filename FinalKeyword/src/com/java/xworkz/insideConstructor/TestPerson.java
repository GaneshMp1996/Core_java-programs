package com.java.xworkz.insideConstructor;

public class TestPerson {
	public static void main(String args[]) {
		Person ganeshmp = new Person();
		System.out.println(ganeshmp.NAME);
		Person kotreshmp = new Person(24);
		System.out.println(kotreshmp.NAME);
	}

}
