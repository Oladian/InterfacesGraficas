package com.iesvirgendelcarmen.windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JButton;
import java.awt.Color;

public class ScrollWindowBuilder {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScrollWindowBuilder window = new ScrollWindowBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScrollWindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		String text;
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("Properties/prop.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (prop.getProperty("FRASE_SCROLL")!=null)
			text = prop.getProperty("FRASE_SCROLL");
		else
			text = "Fichero no existe o datos NULL";
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.NORTH);
		
		JSplitPane splitPane = new JSplitPane();
		tabbedPane.addTab("Panel 1", null, splitPane, null);
		tabbedPane.setBackgroundAt(0, Color.CYAN);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		splitPane.setLeftComponent(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea(text);
		scrollPane_1.setViewportView(textArea_1);
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		panel.setLayout(new GridLayout(0, 2, 10, 80));
		
		JLabel lblUsuario = new JLabel("Usuario");
		panel.add(lblUsuario);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		panel.add(lblContrasea);
		
		passwordField = new JPasswordField();
		panel.add(passwordField);
		
		JButton button = new JButton("Login");
		panel.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("Panel 2", null, scrollPane, null);
		tabbedPane.setBackgroundAt(1, Color.RED);
		
		JTextArea textArea = new JTextArea(text);
		scrollPane.setViewportView(textArea);
	}

}
