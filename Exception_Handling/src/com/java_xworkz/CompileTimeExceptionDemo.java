package com.java_xworkz;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeExceptionDemo {
	public static void main(String args[]) {
		
		try {
			FileReader fd =new FileReader("D:\\movies\\bahubali.Txt");
			BufferedReader br = new BufferedReader(fd);
			System.out.println(br.readLine());
			br.close();
			
			
		} catch ( IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
