package com.java_xworkz;

public class ExceptionCallStackDemo {
	static int divide(int a,int b) {
		return a/b;
		
	}
 static int computeDivision(int a,int b) {
	 int result=0;
	 try {
	 result =divide (a,b);
	 }
	 catch (NumberFormatException e) {
		 System.out.println("Exception caught by ComputeDivision Method");
	}
	 return result;
 }
 public static void main (String args[]) {
	 System.out.println("Main started");
	 try {
	 System.out.println(computeDivision(10,0));
	 }
	 catch(ArithmeticException e) {
		 System.out.println("Exception caught by main mathod");
	 }
	 System.out.println("Main Ended");
 }
}
