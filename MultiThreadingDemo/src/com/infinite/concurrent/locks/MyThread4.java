
package com.infinite.concurrent.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread4 extends Thread {

	static ReentrantLock l = new ReentrantLock();

	public MyThread4(String name) {
		super(name);
	}

	@Override
	public void run() {

		do {
			try {
				if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + "...got the lock");
					Thread.sleep(30000);
					l.unlock();// after sleeping the FirstThread it will release
								// the Lock and go to the deadState
								// after that secondThread Got the chance and
								// start execution and sleep for 3000Sec and
								// after that go to deadState.
					System.out.println(Thread.currentThread().getName() + "...released the lock");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + "...not get the lock and try again");
				}

			} catch (Exception e) {
			}
		} while (true);
	}
}
