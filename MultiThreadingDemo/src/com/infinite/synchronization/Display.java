package com.infinite.synchronization;

public class Display {
	//object level lock
	public synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning:");
			try{
				Thread.sleep(1000);
				
			}catch(InterruptedException e){	}
			System.out.println(name);
		}
	}
}