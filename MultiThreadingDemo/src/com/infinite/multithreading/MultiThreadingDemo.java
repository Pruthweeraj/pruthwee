package com.infinite.multithreading;

public class MultiThreadingDemo {

	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		// myThread.run();//execute like a normal method call
		myThread.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("mainThread count:" + i); // exact output can't
															// be
		}
	}
}
