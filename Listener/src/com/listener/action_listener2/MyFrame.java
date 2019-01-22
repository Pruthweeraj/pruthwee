package com.listener.action_listener2;

import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

	Container container;
	TextField textField;
	
	public MyFrame() {

		container = this.getContentPane();
		container.setLayout(null);
		textField = new TextField();
		textField.setBounds(100, 00, 300, 100);
		container.add(textField);
		
		textField.setFont(new Font("arial",Font.BOLD, 20));
		
		textField.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String str =  textField.getText();
		System.out.println(str);
		textField.setText(str.toUpperCase());
		
	}
	
	

	
}
