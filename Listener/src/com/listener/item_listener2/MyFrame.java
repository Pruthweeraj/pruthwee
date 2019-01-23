package com.listener.item_listener2;

import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ItemListener {

	TextArea textArea;
	Container container;
	JRadioButton male, female;

	public MyFrame() {
		container = this.getContentPane();
		container.setLayout(null);

		male = new JRadioButton("Male");
		male.setBounds(50,50,100,20);
		female = new JRadioButton("Female");
		female.setBounds(50,100,100,20);
		container.add(male);
		container.add(female);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(male);
		buttonGroup.add(female);
		
		male.addItemListener(this);
		female.addItemListener(this);
		
		textArea = new TextArea();
		textArea.setBounds(200,50,200,100);
		container.add(textArea);
		textArea.setEditable(false);

		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == male) {
			textArea.setText("Male Button clicked");
		}else if(e.getSource() == female){
			textArea.setText("Female Button clicked");
		}
	}

}
