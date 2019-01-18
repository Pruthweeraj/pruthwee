package com.infinite.DeadLock;

public class ClassA {
	
	public synchronized void d1(ClassB b) {
		System.out.println("Thread1 started execution of d1() method");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread1 trying to call ClassB's last() method");
		b.last();
	}
	public  synchronized void last(){
		System.out.println("inside ClassA's last() method");
	}

}
