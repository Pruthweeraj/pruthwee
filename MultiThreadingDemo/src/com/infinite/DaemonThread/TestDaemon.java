package com.infinite.DaemonThread;

public class TestDaemon {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());// main
		System.out.println(Thread.currentThread().isDaemon());// false

		// setting the main Thread as demon , we'll get a runTime error
		// Thread.currentThread().setDaemon(true);

		MyThread myThread = new MyThread();
		System.out.println(myThread.isDaemon());// false
		myThread.setDaemon(true);
		System.out.println(myThread.isDaemon());// true

	}
}

class MyThread extends Thread {

}