package com.pr.multithreading;

public class ThreadInterruptChild2 extends Thread {
	@Override
	public void run() {
		
			for (int i = 1; i < 10000; i++) {
				System.out.println("I am lazy thread:"+i);
				
			}
			System.out.println("I am entered into sleeping state");
		
	try{
		Thread.sleep(1000);
	}
	catch (InterruptedException e) {
			System.out.println("i got interrupted");
		}

	}
}
