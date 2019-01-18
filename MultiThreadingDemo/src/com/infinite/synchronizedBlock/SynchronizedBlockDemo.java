package com.infinite.synchronizedBlock;


public class SynchronizedBlockDemo {
	public static void main(String[] args) {

		Display display = new Display();
		MyThread myThread = new MyThread(display, "pr");
		MyThread myThread2 = new MyThread(display, "pupa");
		myThread.start();
		myThread2.start();
	}
}
