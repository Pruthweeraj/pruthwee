package com.infinite.ThreadLocalDemo;

public class CustomerThread  extends Thread{

	static int custId = 0;
	
	public static  ThreadLocal threadLocal = new ThreadLocal(){
		
		@Override
		public Integer initialValue(){
			return ++custId;
		}
	};
	
	CustomerThread (String name){
		super(name);
	}
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName()+ "executing with Customer Id : "+ threadLocal.get());
	}
}
