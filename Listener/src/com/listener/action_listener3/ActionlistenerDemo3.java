package com.listener.action_listener3;

import javax.swing.JFrame;

public class ActionlistenerDemo3 {

	public static void main(String[] args) {
		
		
		//creating a object for frame
		MyFrame myFrame  = new MyFrame() ;
		
		//setting the frame Boundaries
		myFrame.setBounds(00,00,700,700);
		
		//setting the The Frame title
		myFrame .setTitle("MenuBarDemo");
		
		//making the frame visible
		myFrame.setVisible(true);
		
		//setting the closing action
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
