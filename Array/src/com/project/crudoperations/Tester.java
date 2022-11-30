package com.project.crudoperations;

public class Tester {
	public static void main(String[] args) {
		WardrobeOperator operator = new WardrobeOperator();
		operator.add("Shirt");
		operator.add("Pant");
		operator.add("Saree");
		operator.add("Kurtha");
		operator.add("Top");
		operator.add("Shoot");
//		operator.add("Bell batom");
		System.out.println(operator);
//		operator.update(3, "Panche");
		operator.update(0, "Pant");
		System.out.println(operator);
		System.out.println("***********************");
		operator.match("S");
		System.out.println("****************************");
		boolean isDeleted = operator.delete(9);
		System.out.println(isDeleted);
		System.out.println(operator);

	}

}
