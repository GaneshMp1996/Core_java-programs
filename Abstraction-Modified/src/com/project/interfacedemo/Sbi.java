package com.project.interfacedemo;

public class Sbi implements BankDao {

	@Override
	public void withdraw() {
		System.out.println("Sbi.withdraw()");
		System.out.println("Involked withdraw() from Sbi ");
		
	}

	@Override
	public void checkMinimumBalance() {
		System.out.println("Sbi.checkMinimumBalance()");
		System.out.println("Involked checkMinimumBalance()from sbi");
		
	}

	@Override
	public void deposit() {
		System.out.println("Sbi.deposit()");
		System.out.println("Involked deposit() from Sbi,,");
		
	}

}
