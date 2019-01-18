package com.infinite.ThreadLocalDemo;

public class ThreadLocalDemo1 {

	public static void main(String[] args) {
		
		ThreadLocal tl = new ThreadLocal();
		
		//Printing the default Attribute value for the current Thread
		System.out.println(tl.get());//null
		
		// Setting the The attribute(String Object) to the current Thread
		tl.set("Arun");
		
		//getting the Attribute (String Object) from current Thread
		System.out.println(tl.get());//Arun
		
		//removing the attribute form current object
		tl.remove();
		
		
		System.out.println(tl.get());//null

		
	}
}
