package com.project.programs;

public class PalindromeNumber {
	public static void main(String[] args) {
//		int no=121;
		for(int no=1;no<=50;no++) {
		int temp=no;
		int rev=0;
		int rem=0;
		
		while(temp!=0) {
			rem=temp%10;//1
			rev=rev*10+rem;//1
			temp=temp/10;//121/10=1
			
		}
		if(no==rev) {
			System.out.println("Number is Palindrone"+no);
		}
//		else {
//			System.out.println("Not a Palindrome number");
//		}
	}
	}
}



