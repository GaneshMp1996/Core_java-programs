package com.aggregation;

public class Aggregation {
	public static void main(String args[]) {
		God god=new God();
		god.name="Kotrayya";
		god.location="kottur";
		god.blessedFood="riceSamber";
		
		Temple temple=new Temple();
		temple.name="Kottureswara Temple";
		temple.location="kottur";
		temple.time="9AM to 6PM";
		temple.god=god;
		
		System.out.println("God details from the Temple:");
		System.out.println("Name:"+temple.god.name);
		System.out.println("location:"+temple.god.location);
		System.out.println("blessedFood:"+temple.god.blessedFood);
		
		
		
		
		
		
	}

}
