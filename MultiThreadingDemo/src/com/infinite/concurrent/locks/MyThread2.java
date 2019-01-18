package com.infinite.concurrent.locks;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread2 extends Thread {

	static ReentrantLock l = new ReentrantLock();
	
	public MyThread2(String name) {
		super(name);
	}
	@Override 
	public void run(){
		if(l.tryLock()){
			System.out.println(Thread.currentThread().getName() +"....got the Lock and executing safe operation.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l.unlock();
		}else {
			System.out.println(Thread.currentThread().getName()+ "....unable to get the Lock and hence performing alternate operation");
		}
	}
}
