package com.pr.multithreading.Classsyschronization;

public class SynchronizeDemo2 {

	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread1 myThread1 = new MyThread1(d1);
		MyThread2 myThread2= new MyThread2(d2);
		myThread1.start();
		myThread2.start();
		/*
		 * In case of multiple-thread calling multiple-method on multiple-object then we
		 * should go for STATIC-SYNCHRONIZE keyword on every method to get a regular o/p.
		 */
	}
}
