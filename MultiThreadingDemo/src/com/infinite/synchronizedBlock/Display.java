package com.infinite.synchronizedBlock;

public class Display {
	// object level lock
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
		;// 1 lakh line of codes
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Good Morning:");
				try {
					Thread.sleep(1000);

				} catch (InterruptedException e) {
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
		;
		;
		;
		;
		;// 1 lakh line of code

	}
}
