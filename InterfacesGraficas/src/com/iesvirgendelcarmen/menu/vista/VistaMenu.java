package com.iesvirgendelcarmen.menu.vista;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.GridLayout;
import javax.swing.JScrollPane;

public class VistaMenu {

	private JFrame frame;
	private JMenuItem mntmExit;
	private JMenu mnAbout;
	private JMenuItem mntmAbout;
	private JMenuItem mntmGetData;
	private JTabbedPane tabbedPane;
	private JSplitPane splitPane;
	private JPanel panelIzquierdo;
	private JPanel panelDerecho;
	private JLabel lblLastName;
	private JLabel lblGender;
	private JLabel lblLanguage;
	private JLabel lblRace;
	private JTextField textFieldRace;
	private JButton buttonMenos;
	private JButton buttonMayor;
	private JButton buttonMayorMayor;
	private JScrollPane scrollPane;
	private JLabel lblFirstName;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldGender;
	private JTextField textFieldLanguage;
	private JButton buttonMenosMenos;

	public VistaMenu() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnData = new JMenu("Data");
		menuBar.add(mnData);
		
		JFileChooser fileChooser = new JFileChooser(".");
		
		mntmGetData = new JMenuItem("Get data");
		mntmGetData.setActionCommand("getdata");
		mnData.add(mntmGetData);
		
		mntmExit = new JMenuItem("Exit");
		mntmExit.setActionCommand("exit");
		mnData.add(mntmExit);
		
		mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		
		mntmAbout = new JMenuItem("About");
		mntmAbout.setActionCommand("about");
		mnAbout.add(mntmAbout);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.25);
		tabbedPane.addTab("FILTROS", null, splitPane, null);
		
		panelIzquierdo = new JPanel();
		splitPane.setLeftComponent(panelIzquierdo);
		panelIzquierdo.setLayout(new GridLayout(1, 0, 0, 0));
		
		panelDerecho = new JPanel();
		splitPane.setRightComponent(panelDerecho);
		panelDerecho.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblFirstName = new JLabel("First Name");
		panelDerecho.add(lblFirstName);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setColumns(10);
		panelDerecho.add(textFieldFirstName);
		
		lblLastName = new JLabel("Last Name");
		panelDerecho.add(lblLastName);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setColumns(10);
		panelDerecho.add(textFieldLastName);
		
		lblGender = new JLabel("Gender");
		panelDerecho.add(lblGender);
		
		textFieldGender = new JTextField();
		textFieldGender.setColumns(10);
		panelDerecho.add(textFieldGender);
		
		lblLanguage = new JLabel("Language");
		panelDerecho.add(lblLanguage);
		
		textFieldLanguage = new JTextField();
		textFieldLanguage.setColumns(10);
		panelDerecho.add(textFieldLanguage);
		
		lblRace = new JLabel("Race");
		panelDerecho.add(lblRace);
		
		textFieldRace = new JTextField();
		textFieldRace.setColumns(10);
		panelDerecho.add(textFieldRace);
		
		JPanel panelBotones = new JPanel();
		
		buttonMenosMenos = new JButton("<<");
		panelBotones.add(buttonMenosMenos);
		
		buttonMenos = new JButton("<");
		panelBotones.add(buttonMenos);
		
		buttonMayor = new JButton(">");
		panelBotones.add(buttonMayor);
		
		buttonMayorMayor = new JButton(">>");
		panelBotones.add(buttonMayorMayor);
		panelDerecho.add(panelBotones);
		
		scrollPane = new JScrollPane();
		tabbedPane.addTab("Tablas", null, scrollPane, null);
	}
	
	public void messageAbout() {
		JOptionPane.showMessageDialog(frame, "Izan Ortiz Serrano", "Sobre mi", JOptionPane.INFORMATION_MESSAGE);
	}

	public JMenuItem getMntmExit() {
		return mntmExit;
	}

	public JMenuItem getMntmAbout() {
		return mntmAbout;
	}

	public JMenuItem getMntmGetData() {
		return mntmGetData;
	}

	public JTextField getTextFieldRace() {
		return textFieldRace;
	}

	public JTextField getTextFieldFirstName() {
		return textFieldFirstName;
	}

	public JTextField getTextFieldLastName() {
		return textFieldLastName;
	}

	public JTextField getTextFieldGender() {
		return textFieldGender;
	}

	public JTextField getTextFieldLanguage() {
		return textFieldLanguage;
	}

	public JButton getButtonMenos() {
		return buttonMenos;
	}

	public JButton getButtonMayor() {
		return buttonMayor;
	}

	public JButton getButtonMayorMayor() {
		return buttonMayorMayor;
	}

	public JButton getButtonMenosMenos() {
		return buttonMenosMenos;
	}

	public JFrame getFrame() {
		return frame;
	}
}
