package com.infinite.ThreadGroup;

public class ThreadGroupDemo2 {

	public static void main(String[] args) {
		ThreadGroup newGroup = new ThreadGroup("newGroup");
		
		Thread thread1 = new Thread(newGroup, "td1");
		Thread thread2 = new Thread(newGroup, "td2");
		
		newGroup.setMaxPriority(3);//Threads in this ThreadGroup already have higher priority will not be affected.
		Thread thread3 = new Thread(newGroup, "td3");
 
		newGroup.setMaxPriority(8);
		Thread thread4 = new Thread(newGroup,"td5");
		
		System.out.println(thread1.getPriority());//5
		System.out.println(thread2.getPriority());//5
		System.out.println(thread3.getPriority());//3
		System.out.println(thread4.getPriority());//5
		
		thread4.setPriority(9);//if we set the priority max than the ThreadGroups priority then the ThreadPriority will changed to maxPriority of that ThreadGroup
		System.out.println(thread4.getPriority());//8
	}
}
