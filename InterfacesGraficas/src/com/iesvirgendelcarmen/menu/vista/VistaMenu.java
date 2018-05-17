package com.iesvirgendelcarmen.menu.vista;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class VistaMenu {

	private JFrame frame;
	private JMenuItem mntmExit;
	private JMenu mnAbout;
	private JMenuItem mntmAbout;
	private JMenuItem mntmCreateData;
	private JMenuItem mntmGetData;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public VistaMenu() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnData = new JMenu("Data");
		menuBar.add(mnData);
		
		mntmCreateData = new JMenuItem("Create data");
		mntmCreateData.setActionCommand("create");
		mnData.add(mntmCreateData);
		
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

	public JMenuItem getMntmCreateData() {
		return mntmCreateData;
	}

	public JMenuItem getMntmGetData() {
		return mntmGetData;
	}

}
