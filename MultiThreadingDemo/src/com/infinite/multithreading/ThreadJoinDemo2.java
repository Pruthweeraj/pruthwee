package com.infinite.multithreading;

public class ThreadJoinDemo2 {
	
	//waiting of childThread Until completing the mainThread
	public static void main(String[] args) throws InterruptedException {
		
		//passing the mainThreadRef to the childThread
		JChildthread2.mainThreadRef = Thread.currentThread();
		
		
		//creating a object for runnable thread
		JChildthread2 jChildthread2 = new JChildthread2();
		//passing the object to the java.util.Thread
		Thread thread = new Thread(jChildthread2);
		//starting the childThread
		thread.start();
		
		for(int i =1 ; i<= 10; i++){
			System.out.println("MainThread:"+i);
			Thread.sleep(100);
		}
	}

}
