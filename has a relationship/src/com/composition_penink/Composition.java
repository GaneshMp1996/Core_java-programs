package com.composition_penink;

public class Composition {
	public static void main(String args[]) {
		
		Pen pen=new Pen();
		pen.name="Renolds";
		pen.price="5RS";
		pen.type="Ball Pinpoint";
		
		Ink ink=new Ink();
		ink.name="Renolds";
		ink.color="Red";
		ink.price="7RS";
		pen.ink=ink;
		
		System.out.println("Details of ink of pen are");
		System.out.println("name :" + pen.ink.name);
		System.out.println("color :"+ pen.ink.color);
		System.out.println("price :"+pen.ink.price);
		
		
		
		
	}

}
