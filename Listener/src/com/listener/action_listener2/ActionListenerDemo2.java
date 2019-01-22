package com.listener.action_listener2;

import javax.swing.JFrame;

public class ActionListenerDemo2 {

	public static void main(String[] args) {
		
		MyFrame myFrame = new MyFrame();
		
		//myFrame.add
		myFrame.setBounds(200,200,500,500);
		myFrame.setTitle("TextFieldActionListener");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}
	
}
