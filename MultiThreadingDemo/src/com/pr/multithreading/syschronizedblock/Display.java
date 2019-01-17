package com.pr.multithreading.syschronizedblock;

public class Display {

	// To get REGURAL o/p we have to make the wish() method synchronized
	public void wish(String name) {

		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;// 1 Lakh lines of code

		/*
		 * for a specific synchronized object we use , 
		 * synchronized (object_ref) {
		 * 
		 * }
		 * 
		 * for class level synchronization we use , 
		 * synchronized(Class_Name.class) {
		 * 
		 * }
		 */

		synchronized (this) {
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
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;// 1 Lakh lines of code
	}

}
