package com.Birdwings;

public class Aggregation {
	public static void main(String args[]) {
		
     Bird bird=new Bird();
     bird.name="Dove";
     bird.color="White";
     bird.food ="Seeds";
     
     Wing wing=new Wing();
     wing.color="Black";
     wing.noOfWings="2 Wings";
     wing.noOfWingFeathers="14";
     bird.wing=wing;
     
     
     System.out.println("Wings details of birds are ");
     System.out.println("color : "+ bird.wing.color);
     System.out.println("noOfWings : "+ bird.wing.noOfWings);
     System.out.println("noOfWingFeathers : "+ bird.wing.noOfWingFeathers);
     }

}
