package com.infinite.Classsyschronization;

public class MyThread1 extends Thread {

	Display d;

	public MyThread1(Display d) {
		this.d = d;
	}

	@SuppressWarnings("static-access")
	@Override
	public void run() {
		d.displayn();
	}

}
