package com.listener.item_listener;

import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ItemListener {

	TextArea textArea;
	Container container;
	JComboBox<String> jComboBox;

	public MyFrame() {
		container = this.getContentPane();
		container.setLayout(null);

		String[] str = { "A", "B", "C", "D" };
		jComboBox = new JComboBox<String>(str);
		jComboBox.setBounds(50,50,100,100);
		container.add(jComboBox);
		
		textArea = new TextArea();
		textArea.setBounds(200,50,100,100);
		container.add(textArea);
		textArea.setEditable(false);
		
		jComboBox.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String string = jComboBox.getSelectedItem().toString();
		textArea.setText(string);
	}
	
}
