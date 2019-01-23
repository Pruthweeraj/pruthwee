package com.listener.mouse_motion_listener;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class MyFrame extends JFrame implements CaretListener {

	Container container;
	JTextArea jTextArea;
	JTextField jTextField;

	public MyFrame() {

		container = this.getContentPane();
		container.setLayout(null);

		jTextField = new JTextField();
		jTextField.setFont(new Font("arial", Font.BOLD, 18));
		jTextField.setBounds(50, 100, 100, 30);
		container.add(jTextField);
		jTextField.addCaretListener(this);
		
		jTextArea = new JTextArea();
		jTextArea.setBounds(200, 50, 300, 300);
		jTextArea.setEditable(true);
		container.add(jTextArea);

	}

	@Override
	public void caretUpdate(CaretEvent e) {
		jTextArea.setText(jTextArea.getText()+"\n"+" Caret Updated :"+"Get Dot:"+e.getDot()+"..Get Mark :"+e.getMark());
		
	}

}
