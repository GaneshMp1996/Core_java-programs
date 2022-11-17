package com.project.runtimetimepolymorphysm2;

public class Factory {

	public Factory() {
		System.out.println("involked no-args constructor");
	}

	public void manufacture() {
		System.out.println("Parent class is involked from manufacture()");
	}

	public void open() {
		System.out.println("Parent class is involked from open()");
	}

	public void start() {
		System.out.println("Parent class is involked from start()");
	}

	public void shutdown() {
		System.out.println("Parent class is involked from Shutdown()");
	}

//	public String toString() {
//		return "Parent-toString";
//	}
	@Override
	public int hashCode() {
		return 500;
	}

	@Override
	public String toString() {
		return "Factory [hashCode()=" + hashCode() + "]";
	}
	
	

}
