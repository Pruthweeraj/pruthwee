package com.pr.multithreading;

public class JChildthread2 implements Runnable{
	
	//creating a static variable to hold the mainThread reference
	static Thread  mainThreadRef ;
	
	@Override
	public void run (){
		
		//childThread has to join after completion of the mainThread
		try {
			mainThreadRef.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 1 ; i<= 10 ; i++){
			System.out.println("Child Thread"+i);
			
			}
			
		
	}

}
