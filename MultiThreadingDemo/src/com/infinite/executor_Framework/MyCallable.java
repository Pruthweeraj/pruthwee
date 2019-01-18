package com.infinite.executor_Framework;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

	int num;

	MyCallable(int num) {
		this.num = num;
	}

	@Override
	public Object call() throws Exception {

		System.out.print(Thread.currentThread().getName() + " is ....Responsible for finding the sum of first  " + num
				+ " numbers =");
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}

		return sum;
	}

}
