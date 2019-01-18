package com.pr.multithreading;

public class ThreadInterruptDemo {
	public static void main(String[] args) {
		
		ThreadInterruptChild child = new ThreadInterruptChild();
		child.start();
		child.interrupt();
		System.out.println("End of main-thread");
	}

}
