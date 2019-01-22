package com.listener.action_listener3;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MyFrame extends JFrame implements ActionListener{

	JMenuBar jMenuBar;

	JMenu file, edit;

	JMenuItem newFile, open, save, cut, copy, paste, selectAll;

	// creating the textArea
	JTextArea jTextArea;

	Container container;

	public MyFrame() {

		// getting the container object ref from current Object
		container = this.getContentPane();
		container.setLayout(null);

		// creating a MenuBar
		jMenuBar = new JMenuBar();

		// Creating MenuS
		file = new JMenu("File");
		edit = new JMenu("Edit");

		// creating MenuItems
		newFile = new JMenuItem("New File");
		open = new JMenuItem("Open File");
		save = new JMenuItem("Save File");
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		selectAll = new JMenuItem("SelectAll");

		// Adding MenuItems to file_Menu
		file.add(newFile);
		file.add(open);
		file.add(save);

		// Adding items to edit_Menu
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);

		// Adding menu to the menuBar
		jMenuBar.add(file);
		jMenuBar.add(edit);

		// adding the MenuBar to the JFrame
		this.setJMenuBar(jMenuBar);

		// creating a textArea
		jTextArea = new JTextArea();
		jTextArea.setBounds(30, 30, 600, 600);
		jTextArea.setFont(new Font("arial", Font.BOLD, 20));

		// Adding the TextArea to the container
		container.add(jTextArea);

		newFile.addActionListener(this);
		save.addActionListener(this);
		open.addActionListener(this);
		cut.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		copy.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getSource()) == newFile){
			jTextArea.setText("new file code here...");
		}else if(e.getSource() == open){
			jTextArea.setText("open code here...");
		}else if(e.getSource() == save){
			jTextArea.setText("Save code here...");
		}else if(e.getSource() == cut){
			jTextArea.cut();
		}else if(e.getSource() == copy){
			jTextArea.copy();
		}else if(e.getSource() == paste){
			jTextArea.paste();
		}else if(e.getSource() == selectAll){
			jTextArea.selectAll();
		}
		
	}

	
}
