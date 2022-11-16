package com.xworkz.InstanceOf5;

public class University {
	int slNo;
	String name;
	String location;
	long cantactNumber;

	public void detailsOfUniversity() {
		System.out.println("University.detailsOfUniversity()");
		System.out.println("SlNo: " + this.slNo);
		System.out.println("name: " + this.name);
		System.out.println("Location: " + this.location);
		System.out.println("CantactNumber: " + this.cantactNumber);
	}

	public void result() {
		System.out.println("Results are announced");
	}

}
