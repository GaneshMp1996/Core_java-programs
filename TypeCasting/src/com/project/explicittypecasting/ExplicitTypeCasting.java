package com.project.explicittypecasting;

public class ExplicitTypeCasting {
	public static void main(String[] args) {
		double doubleVariable=123.456789d;
		float floatVariable=(float)doubleVariable;
		long longValue=984415l;
		int intValue=(int)longValue;
		short shortValue=350;
		byte byteValue=(byte) shortValue;//128--->129-->-128,130-->127,131->-126
		int intValue1=32770;
		short shortValue1=(short)intValue1;
		System.out.println("The value of Double Value is: "+doubleVariable);
		System.out.println("The value of  Float Value is : "+floatVariable);
		System.out.println("*****************************");
		System.out.println("the value of Long Value is: "+longValue);
		System.out.println("the value of Int is: "+intValue);
		System.out.println("*************************");
		System.out.println("The value of short is: "+shortValue);
		System.out.println("The value of byte is : "+byteValue);
		System.out.println("**************************");
		System.out.println("The value of Int is: "+intValue1);
		System.out.println("The value of short is: "+shortValue1);
		
	}

}
