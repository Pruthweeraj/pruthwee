package com.infinite.multithreading.Classsyschronization;

public class MyThread2 extends Thread {

	Display d;

	public MyThread2(Display d) {
		this.d = d;
	}

	@SuppressWarnings("static-access")
	@Override
	public void run() {
		d.displayc();
	}

}
