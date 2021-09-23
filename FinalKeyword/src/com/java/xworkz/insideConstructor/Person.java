package com.java.xworkz.insideConstructor;

public class Person {
final String NAME;// it gives error because it is not initialized.
	
	Person(){
		NAME = "GANESH MP";//error gone
		}
	Person(int age){
		NAME = "KOTRESH MP";
	}

}
