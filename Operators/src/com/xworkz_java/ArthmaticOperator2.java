package com.xworkz_java;

public class ArthmaticOperator2 {
	int a=60;
	int b=40;
	int c,d,e,f;

	public static void main(String[]args){
	ArthmaticOperatorsDemo aod= new ArthmaticOperatorsDemo();
	aod.c=aod.a+aod.b;

	System.out.println("Addition of 2 numbers are="+aod.c);
	aod.d=aod.a-aod.b;

	System.out.println("Substraction of 2 numbers are="+aod.d);
	aod.e=aod.a*aod.b;

	System.out.println("Multiplication of 2 numbers are="+aod.e);
	aod.f=aod.a/aod.b;

	System.out.println("Devision of 2 numbers are="+aod.f);
	}
}
