package com.infinite.multithreading;

public class ThreadYieldDemo {

	public static void main(String[] args) {
		//creating the object for RunnableThread
		YThread yThread = new YThread();
		//passing the Runnable object to the thread 
		Thread thread = new Thread(yThread);
		
		thread.start();
		for(int i = 1 ; i < 100 ; i++){
			System.out.println("Main Thread :"+i);
		}
		
		
	}
}
