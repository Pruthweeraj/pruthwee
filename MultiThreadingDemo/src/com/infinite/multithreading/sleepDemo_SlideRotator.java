package com.infinite.multithreading;

public class sleepDemo_SlideRotator {

	public static void main(String[] args) throws InterruptedException{
		for(int i =1; i<=10; i++){
			System.out.println("Slide_"+i);
			Thread.sleep(5000);
		}
		
		
	}
}
