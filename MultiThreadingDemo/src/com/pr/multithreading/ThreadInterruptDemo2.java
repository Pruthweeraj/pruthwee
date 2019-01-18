package com.pr.multithreading;

public class ThreadInterruptDemo2 {

public static void main(String[] args) {
		
		ThreadInterruptChild2 child = new ThreadInterruptChild2();
		child.start();
		child.interrupt();
		System.out.println("End of main-thread");
	}

}
