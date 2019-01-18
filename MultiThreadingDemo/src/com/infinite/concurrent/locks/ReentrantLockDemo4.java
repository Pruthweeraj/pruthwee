package com.infinite.concurrent.locks;

public class ReentrantLockDemo4 {

	public static void main(String[] args) {
		MyThread4 t1 = new  MyThread4("Arun_Thread");
		MyThread4 t2 = new MyThread4("pr_Thread");
		t1.start();
		t2.start();
		
	}
}
