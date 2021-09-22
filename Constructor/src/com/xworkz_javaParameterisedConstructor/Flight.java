package com.xworkz_javaParameterisedConstructor;

public class Flight {
	String name;
	String number;
	int capacity;
	String source;
	String destination;

	Flight (){ //no argument constructor
		name="air india";
		number="n4500";
		capacity=124;
		source="hubli";
		destination="bengalore";
		}

	Flight (String name,String number,int capacity,String source,String destination)
	{//parameterized construcor
	this.name=name;//this used to access current object states
	this.number=number;
	this.capacity=capacity;
	this.source=source;
	this.destination=destination;
	}

}
