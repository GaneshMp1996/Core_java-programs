package com.project.runtimetimepolymorphysm;

public class Tester {
	public static void main(String[] args) {
		Father father = new Father();
//		father.marryToHisSon();
//		System.out.println("**************");
//		Son son= new Son();
//		son.marryToHisSon();
//		System.out.println("Doing Method overriding,,,,,,,,,,,");
		Father father1=new Son();
		father1.marryToHisSon();
	}

}
