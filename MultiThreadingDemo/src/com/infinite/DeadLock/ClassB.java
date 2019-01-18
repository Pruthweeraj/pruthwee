package com.infinite.DeadLock;

public class ClassB {

	public synchronized void d2(ClassA a) {
		System.out.println("Thread2 started executing d2() method ");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread2 trying to call ClassA's last() method ");
		a.last();
	}
	public synchronized void last(){
		System.out.println("Inside ClassB's last() method ");
	}
}
