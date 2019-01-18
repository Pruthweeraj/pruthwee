package com.infinite.ThreadGroup;

public class ThreadGroupDemo3 {
public static void main(String[] args) throws InterruptedException {
	
	ThreadGroup pg = new ThreadGroup("ParentGroup");
	ThreadGroup cg = new ThreadGroup(pg,"ChildGroup");
	
	MyThread t1 = new MyThread(pg, "FirstThread");
	MyThread t2 = new MyThread(pg, "SecondThread");
	t1.start();
	t2.start();
	
	System.out.println(pg.activeCount());//2- threads are active now
	System.out.println(pg.activeGroupCount());//1 i.e ChildGroup
	pg.list();
	Thread.sleep(10000);
	System.out.println(pg.activeCount());//0
	System.out.println(pg.activeGroupCount());//1
	pg.list();
}
}

class MyThread extends Thread{
	public MyThread(ThreadGroup groupName , String name) {
		super(groupName,name);
	}
	
	@Override
	public void run(){
		System.out.println("child Thread");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}