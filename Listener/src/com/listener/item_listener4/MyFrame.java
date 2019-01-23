package com.listener.item_listener4;

import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ItemListener {

	TextArea textArea;
	Container container;
	JMenuBar jMenuBar;
	JMenuItem jMenuItem;
	JCheckBoxMenuItem jCheckBoxMenuItem;

	public MyFrame() {
		container = this.getContentPane();
		container.setLayout(null);

		jMenuBar = new JMenuBar();
		jMenuItem = new JMenuItem("File");

		jCheckBoxMenuItem = new JCheckBoxMenuItem("Print");
		jMenuBar.add(jMenuItem);
		jMenuItem.add(jCheckBoxMenuItem);

		jCheckBoxMenuItem.addItemListener(this);

		// adding the MenuBar to the JFrame
		this.setJMenuBar(jMenuBar);

		textArea = new TextArea();
		textArea.setBounds(200, 50, 200, 100);
		container.add(textArea);
		// textArea.setEditable(false);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (jCheckBoxMenuItem.isSelected()) {
			textArea.setText(" Print is ON");
		} else {
			textArea.setText(" Print is OFF");
		}
	}

}
