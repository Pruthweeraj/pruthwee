package com.infinite.synchronization;

public class SynchronizeDemo1 {
public static void main(String[] args) {

	Display display = new Display();
	MyThread myThread = new MyThread(display, "pr");
	MyThread myThread2 = new MyThread(display, "pupa");
	myThread.start();
	myThread2.start();
}
}