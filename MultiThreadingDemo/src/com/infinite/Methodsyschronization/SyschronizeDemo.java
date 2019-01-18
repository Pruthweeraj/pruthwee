package com.infinite.Methodsyschronization;

public class SyschronizeDemo {

	public static void main(String[] args) {

		Display d = new Display();
		MyThread myThread = new MyThread(d, "Pupa");
		MyThread myThread2 = new MyThread(d, "Pr");
		myThread.start();
		myThread2.start();
		/*
		 * now two threads are calling wish() method on same-object , so we can use
		 * SYNCHRONIZED on wish() method to get regular o/p.
		 */
		/*
		 * In case of multiple-thread calling wish() method on multiple-object then we
		 * should go for STATIC-SYNCHRONIZE keyword.
		 */
	}
}
