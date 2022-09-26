package com.project.implicittypecasting;

public class ImplicitTypeCasting {
	public static void main(String[] args) {
		byte byteValue=125;
		short shortValue=byteValue;
		short shortValue1=120;
		int intValue=shortValue1;
		int number=25000;
		long longValue=number;
		float floatValue=123.45f;
		double doubleValue=floatValue;
		
		System.out.println("Byte Value: "+byteValue);
		System.out.println("Short Value: "+shortValue);
		System.out.println("Short Value: "+shortValue1);
		System.out.println("Int Value: "+intValue);
		System.out.println("Long Value: "+longValue);
		System.out.println("Double Value: "+doubleValue);
		
	}

}
