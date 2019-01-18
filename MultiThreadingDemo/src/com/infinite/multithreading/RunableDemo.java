package com.infinite.multithreading;

public class RunableDemo {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
		for(int i = 1; i <100; i++){
			System.out.println("mainThread count:"+i);
		}
			
	}
}
