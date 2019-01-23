package com.listener.key_listener;

import javax.swing.JFrame;

public class KeyListener {
	public static void main(String[] args) {

		MyFrame myFrame = new MyFrame();
		myFrame.setTitle("Key event Listener");
		myFrame.setBounds(100, 100, 700, 700);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
