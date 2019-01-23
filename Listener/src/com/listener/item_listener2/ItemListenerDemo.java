package com.listener.item_listener2;

import javax.swing.JFrame;

public class ItemListenerDemo {

	public static void main(String[] args) {

		MyFrame myFrame = new MyFrame();

		myFrame.setBounds(100,100,600,600);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setTitle("ComboBox_ItemListener");
	}

}
