package com.listener.item_listener3;

import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ItemListener {

	TextArea textArea;
	Container container;
	JCheckBox c1,c2,c3,c4;  

	public MyFrame() {
		container = this.getContentPane();
		container.setLayout(null);

		c1 = new JCheckBox("10th");
		c2 = new JCheckBox("12th");
		c3 = new JCheckBox("Graguate");
		c4 = new JCheckBox("PostGraduate");
		
		c1.setBounds(50,50,100,30);
		c2.setBounds(50,100,100,30);
		c3.setBounds(50,150,100,30);
		c4.setBounds(50,200,100,30);
		
		
		container.add(c1);
		container.add(c2);
		container.add(c3);
		container.add(c4);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		
		textArea = new TextArea();
		textArea.setBounds(200,50,200,100);
		container.add(textArea);
		//textArea.setEditable(false);

		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(c1.isSelected()) {
			textArea.setText(" 10Th");
		}
		if(c2.isSelected()) {
			textArea.setText(textArea.getText()+"\n 12th");
		}
		if(c3.isSelected()) {
			textArea.setText(textArea.getText()+"\n Gradutate");
		}
		if(c4.isSelected()) {
			textArea.setText(textArea.getText()+"\n Post-Graduate");
		}
	}

}
