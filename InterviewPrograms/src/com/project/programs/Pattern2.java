package com.project.programs;
/*to print pattern 
 * 1  2  3  4
 * 5  6  7  8
 * */
public class Pattern2 {
	public static void main(String[] args) {
		int ct=1;
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print((ct++));
			}
			System.out.println();
		}
		
	}

}
