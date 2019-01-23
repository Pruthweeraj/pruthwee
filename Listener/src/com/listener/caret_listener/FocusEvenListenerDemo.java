package com.listener.caret_listener;

import javax.swing.JFrame;

public class FocusEvenListenerDemo {
	public static void main(String[] args) {

		MyFrame myFrame = new MyFrame();
		myFrame.setTitle("Mouse event Listener");
		myFrame.setBounds(100, 100, 700, 500);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
