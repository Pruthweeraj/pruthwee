package com.pr.multithreading;

public class YThread implements Runnable {

	@Override 
	public void run(){
		for(int i = 1; i<100;i++){
			System.out.println("YThread'child' :"+i);
			Thread.yield();
		}
	}
	
}
