package com.infinite.wait_notify;

public class ThreadA {
public static void main(String[] args) throws InterruptedException {
	ThreadB threadB = new ThreadB();
	threadB.start();
	//Thread.sleep(2000); if mainThread sleep and at that time if the childThread called the notify() method , and after that the mainThread will always be in waiting stage.
	synchronized (threadB) {
	System.out.println("threadA calling wait() method for threadB");
	threadB.wait();
	System.out.println("ThreadA get the notification ");
	System.out.println(threadB.total);
	}
}
}
