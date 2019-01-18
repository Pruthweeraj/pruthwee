package com.infinite.DaemonThread;

public class DaemonThreadDemo2 {

	public static void main(String[] args) {

		MyThread2 myThread2 = new MyThread2();
		myThread2.setDaemon(true);// making childThread as Demon Thread
		myThread2.start();
		System.out.println("End of mainThread ");
	}

}
