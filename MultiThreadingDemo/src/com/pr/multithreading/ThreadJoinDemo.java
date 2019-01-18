package com.pr.multithreading;

public class ThreadJoinDemo {

	//waiting the mainThread until the completion of the childThread
	public static void main(String[] args) throws InterruptedException {
		
		//creating a object for runnable thread
		JChildThread jChildThread = new JChildThread();
		//passing the object to the java.util.Thread
		Thread thread  = new Thread(jChildThread);
		
		//starting the childThread
		thread.start();
		thread.join();
		for(int i = 1 ; i<10 ; i ++){
			System.out.println("mainThread :"+i);
		}
		
	}
	
}
