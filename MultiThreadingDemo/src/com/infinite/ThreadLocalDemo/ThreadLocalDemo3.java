package com.infinite.ThreadLocalDemo;

public class ThreadLocalDemo3 {

	public static void main(String[] args) {
		CustomerThread customerThread1 = new CustomerThread("CUstomerThread-1");
		CustomerThread customerThread2 = new CustomerThread("CUstomerThread-2");
		CustomerThread customerThread3 = new CustomerThread("CUstomerThread-3");
		CustomerThread customerThread4 = new CustomerThread("CUstomerThread-4");
		CustomerThread customerThread5 = new CustomerThread("CUstomerThread-4");

		CustomerThread customerThread6 = new CustomerThread("CUstomerThread-4");

		CustomerThread customerThread7 = new CustomerThread("CUstomerThread-4");

		CustomerThread customerThread8 = new CustomerThread("CUstomerThread-4");

		CustomerThread customerThread9 = new CustomerThread("CUstomerThread-4");

		CustomerThread customerThread10 = new CustomerThread("CUstomerThread-4");

		CustomerThread customerThread11 = new CustomerThread("CUstomerThread-4");

		CustomerThread customerThread12 = new CustomerThread("CUstomerThread-4");

		customerThread1.start();
		customerThread2.start();
		customerThread3.start();
		customerThread4.start();
		customerThread5.start();
		customerThread6.start();
		customerThread7.start();
		customerThread8.start();
		customerThread9.start();
		customerThread10.start();
		customerThread11.start();
		customerThread12.start();
	}
}
