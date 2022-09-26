package com.project.runtimetimepolymorphysm1;

public class Tester {
	public static void main(String[] args) {
		Rbi rbi=new Rbi();
		rbi.displayIntrestRate();
		System.out.println("********************");
		Hdfc hdfc=new Hdfc();
		hdfc.displayIntrestRate();
		//method overriding,,,,,,,
		System.out.println("******************8");
		Rbi rbi1=new Hdfc();
		rbi1.displayIntrestRate();
		
		
	}

}
