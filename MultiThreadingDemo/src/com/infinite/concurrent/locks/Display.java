package com.infinite.concurrent.locks;

import java.util.concurrent.locks.ReentrantLock;

public class Display {

	ReentrantLock l = new ReentrantLock();
	public void wish(String name){
		l.lock();
		for (int i = 0; i<10 ; i++){
			System.out.print("Good AfterNoon:");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
	l.unlock();
	}
}
