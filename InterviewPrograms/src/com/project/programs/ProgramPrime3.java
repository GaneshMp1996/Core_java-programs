package com.project.programs;
/*printing prime numbers in between 1 to 50*/
public class ProgramPrime3 {
	public static void main(String[] args) {
		for(int i=1;i<=50;i++) {
			int count=0;//3->4
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}
		
	}

}
