package com.listener.action_listener;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements  ActionListener {

	Container c;
	JButton button;

	public MyFrame() {
		c = this.getContentPane();
		c.setLayout(null);
		button = new JButton("Pr Panda");
		button.setBounds(100,100,100,30);
		c.add(button);
		
		button.addActionListener(this);
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = button.getText();
		button.setText(str.toUpperCase());
		
	}

}
