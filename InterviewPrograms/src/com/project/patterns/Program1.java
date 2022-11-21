package com.project.patterns;
/**
 * to print Right Angle Triangle Pattern
 * @author user
 *
 */
public class Program1 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}


}
