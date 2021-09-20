package com.composition;

public class composition {
	public static void main(String args[]) {
		Human human=new Human();
		human.name="Ganesh";
		human.color="black";
		human.weight=160;
		
		Heart heart=new Heart();
	    heart.layers=3;
		heart.weight="650gms";
		heart.position="Left side of the Human body";
		human.heart=heart;
		
		System.out.println("heart details of the human :");
		System.out.println("layers :"+human.heart.layers);
		System.out.println("weight :"+ human.heart.weight);
		System.out.println("position :"+human.heart.position);
		
		
		
		}
	

}
