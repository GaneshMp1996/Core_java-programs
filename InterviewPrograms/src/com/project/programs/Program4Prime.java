package com.project.programs;
/* to check given  prime numbers or not*/
public class Program4Prime {
	public static void main(String[] args) {
		int no=4;
		int temp=0;
		//i=2,2<=4-1;i=3
		for(int i=2;i<=no-1;i++) {
			
			if(no%i==0) {
				temp+=1;
			}
		}
		if(temp==0) {
			System.out.println("Given number is prime");
		}
		else {
			System.out.println("not a prime number");
		}
		
	}

}
