package com.infinite.ThreadGroup;

public class ThreadGroupDemo1 {
	public static void main(String[] args) {
		// Printing the ThreadGroup for mainThread
		System.out.println(Thread.currentThread().getThreadGroup().getName()); // main

		// printing the main-ThreadGroups parentThread
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());// system

		// creating a new ThreadGroup of name pruthwee
		ThreadGroup group1 = new ThreadGroup("pruthwee");
		// Printing the threadGroup Name
		System.out.println(group1.getName());// pruthwee

		// finding the parentThread of pruthwee-ThreadGroup
		System.out.println(group1.getParent().getName());// main

		// creating a sub-ThreadGroup 'pupa' under pruthwee-ThreadGroup
		ThreadGroup group2 = new ThreadGroup(group1, "pupa");

		// printing the parentThread of 'pupa'
		System.out.println(group2.getParent().getName());// pruthwee
	}
}
