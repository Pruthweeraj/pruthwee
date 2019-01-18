package com.infinite.DeadLock;

public class DeadLock extends Thread {

	ClassA a = new ClassA();
	ClassB b = new ClassB();

	public void m1() {
		this.start();
		a.d1(b);
	}

	public void run() {
		b.d2(a);
	}

	public static void main(String[] args) {

		DeadLock deadLock = new DeadLock();
		deadLock.m1();

		// here Thread-0 have lock of a and it needs the lock of b for executing
		// ClassB's last method
		// at the same time
		// Thread-1 have lock of b and wants the lock of a for executing
		// ClassA's last method
		// so both threads are now waiting for lock to fortier execution so we
		// get a DeadLock situation

		// if we removed any one synchronized keyword from any method then we
		// did not face this DeadLock situation

	}

}
