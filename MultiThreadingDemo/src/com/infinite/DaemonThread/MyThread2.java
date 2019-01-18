package com.infinite.DaemonThread;

class MyThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Child Thread's:" + i);
			System.out.println(this.isDaemon());
		}
	}
}