package com.listener.key_listener;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame extends JFrame implements KeyListener{

	Container container;
	JTextArea jTextArea;
	
	public MyFrame() {
	
		container = this.getContentPane();
		container.setLayout(null);
		
		jTextArea = new JTextArea();
		jTextArea.setBounds(10,10,370,330);
		jTextArea.setEditable(true);
		container.add(jTextArea);
		jTextArea.addKeyListener(this);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		jTextArea.setText(jTextArea.getText()+"\n"+e.getKeyChar()+"-Key is Plased: ");		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		jTextArea.setText(jTextArea.getText()+"\n"+e.getKeyChar()+"-Key is Released: ");	
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		jTextArea.setText(jTextArea.getText()+"\n"+e.getKeyChar()+"-Key is Typed: ");	
		
	}
}
