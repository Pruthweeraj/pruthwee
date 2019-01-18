package com.infinite.multithreading;

public class MyThread extends Thread{

	@Override
	public void run(){
		System.out.println("child thread");
		
		for(int i = 0; i<100 ; i++){
			System.out.println("childThread count:"+i);
		}
		
	}
}
