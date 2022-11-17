package com.project.runtimetimepolymorphysm2;

public class SugerFactory extends Factory {
	public SugerFactory() {
		System.out.println("invoked no args const SugarFactory");
	}

	public void manufacture() {
		System.out.println("Child class(SugarFactory) is invoked from manufacture method");
	}

	public String toString() {
		System.out.println("Child class(SugarFactory) is invoked from toString method");
		return "Child-toString";

	}

	public int hashCode() {
		System.out.println("Child class(SugarFactory) is invoked from hashCode method" + super.hashCode());
		return 100;

	}
}
