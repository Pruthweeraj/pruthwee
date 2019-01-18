package com.infinite.multithreading;

public class ThreadInterruptChild extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 1; i < 10; i++) {
				System.out.println("I am lazy thread");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("i got interrupted");
		}

	}

}
