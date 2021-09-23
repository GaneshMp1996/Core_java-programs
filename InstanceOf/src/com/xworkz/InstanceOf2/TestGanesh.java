package com.xworkz.InstanceOf2;

public class TestGanesh {
	public static void main(String[] args) {
		VegBiriyani veg = new VegBiriyani();
		@SuppressWarnings("unused")
		ChikenBiriyani nonveg = new ChikenBiriyani();
		Ganesh ganesh = new Ganesh();
		ganesh.eat(veg);		
		

	}

}
