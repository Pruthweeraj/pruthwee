package com.infinite.ThreadGroup;

public class ThreadGroupdemo4 {

	public static void main(String[] args) {
							//main thread ===========>main===========>system
	ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
	
	//creating a ThreadArray of size of active-number-of-threads present in system
	Thread[] t = new Thread[system.activeCount()];
	
	system.enumerate(t);
	for(Thread t1 : t){
		System.out.println(t1.getName()+"========="+t1.isDaemon());
	}
	
	}
	
}
