package com.infinite.ThreadLocalDemo;

public class ThreadLocalDemo2 {

	public static void main(String[] args) {
		ThreadLocal threadLocal = new ThreadLocal()
				{
					@Override
					public Object initialValue(){
						return "Pruthwee";
					}
				};
		
			System.out.println(threadLocal.get());//Pruthwee (Default value)	

			threadLocal.set("Arun");
			
			System.out.println(threadLocal.get());//Arun
			
			threadLocal.remove();
			System.out.println(threadLocal.get());//pruthwee (Default Value)
	}
}
