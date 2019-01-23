package com.listener.focus_listener;

import java.awt.Container;
import java.awt.Font;
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

public class MyFrame extends JFrame implements MouseMotionListener,MouseWheelListener  {

	Container container;
	JTextArea jTextArea;
	JLabel jLabel;

	public MyFrame() {

		container = this.getContentPane();
		container.setLayout(null);

		jLabel = new JLabel("MY Lable");
		jLabel.setFont(new Font("arial", Font.BOLD, 18));
		jLabel.setBounds(50, 100, 100, 30);
		container.add(jLabel);
		jLabel.addMouseMotionListener(this);

		jTextArea = new JTextArea();
		jTextArea.setBounds(200, 50, 300, 300);
		jTextArea.setEditable(true);
		container.add(jTextArea);
		jTextArea.addMouseWheelListener(this);

	}

	//Mouse_Motion methods
	@Override
	public void mouseDragged(MouseEvent e) {
		jTextArea.setText(jTextArea.getText()+"\n"+"Mouse is Dragged.");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		jTextArea.setText(jTextArea.getText()+"\n"+"Mouse is Moved.");
		
	}

	//Mouse_wheelListener methods
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		jTextArea.setText(jTextArea.getText()+"\n"+"Mouse wheel is Moved.");
		
		  String message;
		  String newline ="\n";
	       int notches = e.getWheelRotation();
	       if (notches < 0) {
	           message = "Mouse wheel moved UP "
	                        + -notches + " notch(es)" + newline;
	       } else {
	           message = "Mouse wheel moved DOWN "
	                        + notches + " notch(es)" + newline;
	       }
	       if (e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL) {
	           message += "    Scroll type: WHEEL_UNIT_SCROLL" + newline;
	           message += "    Scroll amount: " + e.getScrollAmount()
	                   + " unit increments per notch" + newline;
	           message += "    Units to scroll: " + e.getUnitsToScroll()
	                   + " unit increments" + newline;
	          /* message += "    Vertical unit increment: "
	               + scrollPane.getVerticalScrollBar().getUnitIncrement(1)
	               + " pixels" + newline;*/
	       } else { //scroll type == MouseWheelEvent.WHEEL_BLOCK_SCROLL
	           message += "    Scroll type: WHEEL_BLOCK_SCROLL" + newline;
	          /* message += "    Vertical block increment: "
	               + scrollPane.getVerticalScrollBar().getBlockIncrement(1)
	               + " pixels" + newline;*/
	       }
	       jTextArea.setText(jTextArea.getText()+"\n"+message);
		
	}

}
