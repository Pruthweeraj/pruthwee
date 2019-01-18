package com.infinite.multithreading;

public class ThreadDemo2 {

	public static void main(String[] args) {
		// printing the currentThread name
		System.out.println(Thread.currentThread().getName());// main
		Demo2Thread demo2Thread = new Demo2Thread();
		Thread thread = new Thread(demo2Thread);
		System.out.println(thread.getName());// thread-0

		// Setting the mainThread name
		Thread.currentThread().setName("PrMain");
		System.out.println(Thread.currentThread().getName());// PrMain

		// Default priority for main-Thre is 5
		System.out.println(Thread.currentThread().getPriority());// 5
		// setting priority to the Main-thread
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority()); // 7

	}
}
