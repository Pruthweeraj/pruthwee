package com.listener.caret_listener;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements FocusListener {

	Container container;
	JTextArea jTextArea;
	JTextField jTextField;

	public MyFrame() {

		container = this.getContentPane();
		container.setLayout(null);

		jTextField = new JTextField(); 
		jTextField.setFont(new Font("arial",Font.BOLD,18));
		jTextField.setBounds(50, 100, 100, 30);
		container.add(jTextField);
		jTextField.addFocusListener(this);;
		
		jTextArea = new JTextArea();
		jTextArea.setBounds(200, 50, 300, 300);
		jTextArea.setEditable(true);
		container.add(jTextArea);
		

	}

	 @Override
	public void focusGained(FocusEvent e) {
		jTextArea.setText(jTextArea.getText()+"\n"+"TextBox Focus Gained");
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		
		jTextArea.setText(jTextArea.getText()+"\n"+"TextBox Focus Lost");
	}

	

}
