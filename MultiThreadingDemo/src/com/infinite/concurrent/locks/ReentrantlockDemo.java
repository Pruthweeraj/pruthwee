package com.infinite.concurrent.locks;

public class ReentrantlockDemo {
public static void main(String[] args) {
		Display d = new Display();
		
		MyThread t1 = new MyThread(d, "pr");
		MyThread t2 = new MyThread(d, "pupa");
		MyThread t3 = new MyThread(d, "jagu");

		t1.start();
		t2.start();
		t3.start();



}

}
