package com.project.laptop;

public class Tester {
	public static void main(String[] args) {
		//create a object for the laptop
		Laptop laptop=new Laptop();
		//initialization of properties of an object
		laptop.slNo=101;
		laptop.name="Dell";
		laptop.color="Black";
		laptop.price=35000.00;
		laptop.ram=500;
		laptop.rom=4;
		laptop.isFingerPrintSupported=false;
		laptop.processor="I3";
		laptop.attendingSessions();
		laptop.canWork();
		laptop.watchVedioes();
		laptop.playGames();
		
		
		//printing the data by using print cammand
		System.out.println("SL No: "+laptop.slNo);
		System.out.println("Name: "+laptop.name);
		System.out.println("Color: "+laptop.color);
		System.out.println("Price: "+laptop.price);
		System.out.println("Ram: "+laptop.ram);
		System.out.println("Processor: "+laptop.processor);
		System.out.println("Rom: "+laptop.rom);
		System.out.println("IsFingerPrintSupported: "+laptop.isFingerPrintSupported);
		System.out.println("*************************************");
		
		//creating another object for the laptop class
		Laptop laptop1=new Laptop();
		laptop1.slNo=102;
		laptop1.name="Hp";
		laptop1.color="white";
		laptop1.price=50000.00;
		laptop1.processor="I5";
		laptop1.ram=1000;
		laptop1.rom=8;
		laptop1.isFingerPrintSupported=true;
		laptop1.attendingSessions();
		laptop1.canWork();
		laptop1.watchVedioes();
		laptop1.playGames();
		//printing the data in the console by using print cammand
		System.out.println("SL No: "+laptop1.slNo);
		System.out.println("Name: "+laptop1.name);
		System.out.println("Color: "+laptop1.color);
		System.out.println("Price: "+laptop1.price);
		System.out.println("Ram: "+laptop1.ram);
		System.out.println("Processor: "+laptop1.processor);
		System.out.println("Rom: "+laptop1.rom);
		System.out.println("IsFingerPrintSupported: "+laptop1.isFingerPrintSupported);
		System.out.println("************************************");
		//creating another object for laptop class
		Laptop laptop2=new Laptop();
		laptop2.slNo=103;
		laptop2.name="Apple";
		laptop2.color="Black";
		laptop2.price=80000.00;
		laptop2.processor="i5";
		laptop2.ram=500;
		laptop2.rom=4;
		laptop2.isFingerPrintSupported=false;
		laptop2.attendingSessions();
		laptop2.canWork();
		laptop2.watchVedioes();
		laptop2.playGames();
		//printing the data in the console by using print cammand
		System.out.println("SL No: "+laptop2.slNo);
		System.out.println("Name: "+laptop2.name);
		System.out.println("Color: "+laptop2.color);
		System.out.println("Price: "+laptop2.price);
		System.out.println("Ram: "+laptop2.ram);
		System.out.println("Processor: "+laptop2.processor);
		System.out.println("Rom: "+laptop2.rom);
		System.out.println("IsFingerPrintSupported: "+laptop2.isFingerPrintSupported);
		
		
	}

}
