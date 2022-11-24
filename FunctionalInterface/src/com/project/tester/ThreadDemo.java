package com.project.tester;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("inside the thread");
				
			}
		});
		thread.run();
		//By using lamda expressions
		Thread t1=new Thread(()->System.out.println("calling run() by using lambda"));
		t1.run();
		//calling multiple statemenets by using lambda
		Thread thread2=new Thread(()->{
		System.out.println("Inside thread1");
		System.out.println("Inside thread2");
		System.out.println("Inside thread3");
		});
		thread2.run();
	}

}
