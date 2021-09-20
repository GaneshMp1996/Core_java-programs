package com.MobileInternet;

public class Aggregration {
	public static void main(String args[]) {
		Mobile mobile=new Mobile();
		mobile.name= "Samsung";
		mobile.ram= "4GB";
		mobile.memory="64GB";
		
		Internet internet=new Internet();
		internet.name="Jio";
		internet.type="4G";
		internet.speed="50MB per Second";
		mobile.internet=internet;
		
		System.out.println("Internet details of mobile is ");
		System.out.println("name : "+mobile.internet.name);
		System.out.println("type :"+ mobile.internet.type);
		System.out.println("speed "+ mobile.internet.speed);
		
		
		
				
		
	}

}
