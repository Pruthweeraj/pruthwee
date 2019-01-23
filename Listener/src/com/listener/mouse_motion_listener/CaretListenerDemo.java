package com.listener.mouse_motion_listener;

import javax.swing.JFrame;

public class CaretListenerDemo {
	public static void main(String[] args) {

		MyFrame myFrame = new MyFrame();
		myFrame.setTitle("Caret event Listener");
		myFrame.setBounds(100, 100, 700, 500);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
