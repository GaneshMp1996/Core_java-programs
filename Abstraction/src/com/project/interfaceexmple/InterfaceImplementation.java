package com.project.interfaceexmple;

public class InterfaceImplementation implements BankDao, BankService {

	@Override
	public void createAccount() {
		System.out.println("InterfaceImplementation.createAccount()");

	}

	@Override
	public void addAdharNumber() {
		System.out.println("InterfaceImplementation.addAdharNumber()");

	}

	@Override
	public void addMobileNumber() {
		System.out.println("InterfaceImplementation.addMobileNumber()");

	}

	@Override
	public void printPassBook() {
		System.out.println("InterfaceImplementation.printPassBook()");

	}

	@Override
	public void addPanCard() {
		System.out.println("InterfaceImplementation.addPanCard()");

	}

	@Override
	public void withDraw() {
		System.out.println("InterfaceImplementation.withDraw()");

	}

	@Override
	public void deposit() {
		System.out.println("InterfaceImplementation.deposit()");

	}

	@Override
	public void checkMinimumBalance() {
		System.out.println("InterfaceImplementation.checkMinimumBalance()");

	}

	@Override
	public void tranferAmount() {
		System.out.println("InterfaceImplementation.tranferAmount()");

	}

}
