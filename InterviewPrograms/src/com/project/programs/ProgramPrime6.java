package com.project.programs;
//program to print prime numbers in between 1 to 100
public class ProgramPrime6 {
	public static void main(String[] args) {
		
			for(int no=1;no<=100;no++) {
			int temp=0;
			for(int i=2;i<=no-1;i++) {
				if(no%i==0) {
					temp+=1;
				}
			}
			if(temp==0) {
				System.out.println("prime Numbers: "+no);
			}
			
	}
	}

}
