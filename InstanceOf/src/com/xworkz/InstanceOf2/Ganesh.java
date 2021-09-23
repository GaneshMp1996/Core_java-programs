package com.xworkz.InstanceOf2;

public class Ganesh {
	void eat(Biriyani biriyani)
	{
		if(biriyani instanceof VegBiriyani)
		{
			System.out.println("wow i got Veg-Biriyani");
		}
		else {
			System.out.println("wow i got Chicken-Biriyani");
		}
			
	}

}
