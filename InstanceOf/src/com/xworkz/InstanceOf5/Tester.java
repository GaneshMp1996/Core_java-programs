package com.xworkz.InstanceOf5;

public class Tester {
	public static void main(String[] args) {
		University uni = new University();
		uni.slNo = 101;
		uni.name = "Visveswaraya technical university";
		uni.location = "Belgum";
		uni.cantactNumber = 807567657676l;

		Vtu vtu = new Vtu();
		vtu.slNo = 103;
		vtu.name = "Ram";
		vtu.cantactNumber = 906767767867l;
		vtu.location = "Bangalore";

		if (uni instanceof Object) {
			uni.detailsOfUniversity();
		} else {
			System.out.println("Not Instance");
		}
		vtu.displayDetialsOfVtu(vtu);
	}

}
