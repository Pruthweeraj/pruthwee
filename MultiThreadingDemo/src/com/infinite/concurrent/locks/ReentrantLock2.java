package com.infinite.concurrent.locks;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock2 {

	public static void main(String[] args) {
		//creating a ReentrantLock instance with default fairPolicy as false  
		ReentrantLock l = new ReentrantLock();
		
		//getting lock by the current thread
		l.lock();
		//increasing holdCount  by +1
		l.lock();
		
		System.out.println(l.isLocked());//true
		System.out.println(l.isHeldByCurrentThread());//true
		System.out.println(l.getQueueLength());//0
		
		l.unlock();
		
		System.out.println(l.getHoldCount());//1
		System.out.println(l.isLocked());//true
		
		l.unlock();
		
		System.out.println(l.isLocked());//false
		System.out.println(l.isFair());//false		
		
		
		
	}
}
