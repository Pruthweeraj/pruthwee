package com.listener.window_listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements WindowListener{

	public MyFrame() {

		this.addWindowListener(this);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Window Activeted");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Window Closed");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Window Closing");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window DeActivated");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Window DeIconified");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Window Iconified");
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Window Opened");
		
	}
}
