package com.infinite.Methodsyschronization;

public class Display {

	// To get REGURAL o/p we have to make the wish() method synchronized
	public synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "_GoodMorning : ");

			// sleeping the current thread for 2sec
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Thread Interrupted");
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}
