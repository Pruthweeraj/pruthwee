package com.infinite.multithreading.syschronizedblock;

public class SysncBlockDemo {

	public static void main(String[] args) {

		Display d = new Display();
		MyThread myThread = new MyThread(d, "Pupa");
		MyThread myThread2 = new MyThread(d, "Pr");
		myThread.start();
		myThread2.start();

	}
}
