package com.xworkz.InstanceOf4;

public class Tester {
	public static void main(String[] args) {
		Child child=new Child();
		Parent parent=new Parent();
		if(child instanceof Child) {
			System.out.println("Child Obj is instance of Child Classs");
		}
		else {
			System.out.println("it is not instance of class");
		}
		if(child instanceof Parent) {
			System.out.println("child obj is instance of parent");
		}
		else {
			System.out.println("it is not instance of parent class");
		}
		if(child instanceof Object) {
			System.out.println("Chils is instance of parent Object");
		}
		else {
			System.out.println("Not instacne");
		}
		
		if(child instanceof Parent) {
			child.demo(parent);
		}
		else {
			System.out.println("Not an instance");
		}
	}

}
