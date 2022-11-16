package com.xworkz.InstanceOf5;

public class Vtu extends University {

	public void displayDetialsOfVtu(Vtu vtu) {
		if (vtu instanceof University) {
			this.detailsOfUniversity();
		} else {
			System.out.println("Sorry,,vtu is not an instance of University");
		}
	}

	public void fee() {
		System.out.println("fee is announced");
	}

}
