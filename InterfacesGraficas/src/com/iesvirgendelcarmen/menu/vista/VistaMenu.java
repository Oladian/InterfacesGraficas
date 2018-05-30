package com.iesvirgendelcarmen.menu.vista;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

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
	private JPanel panelRadioButton;
	private JRadioButton radioButtonMale;
	private JRadioButton radioButtonFemale;
	private JPanel panelComboBox_1;
	private JLabel lblLanguageCombobox;
	private JLabel lblRaceCombobox;
	private JPanel panelComboBox_2;
	private JPanel panelFindResetExitButtons;
	private JButton btnFind;
	private JButton btnReset;
	private JButton btnExit;
	private JComboBox comboBoxLanguage;
	private JComboBox comboBoxRace;
	private ButtonGroup radioButtonGroup = new ButtonGroup();
	private JTable table;

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
		panelIzquierdo.setLayout(new GridLayout(0, 1, 0, 0));
		
		panelRadioButton = new JPanel();
		panelIzquierdo.add(panelRadioButton, BorderLayout.NORTH);
		//panelRadioButton.setLayout(new BorderLayout());
		
		radioButtonMale = new JRadioButton("Male");
		radioButtonMale.setActionCommand("Male");
		panelRadioButton.add(radioButtonMale);
		
		radioButtonFemale = new JRadioButton("Female");
		radioButtonFemale.setActionCommand("Female");
		panelRadioButton.add(radioButtonFemale);
		
		
		radioButtonGroup.add(radioButtonMale);
		radioButtonGroup.add(radioButtonFemale);
		
		panelComboBox_1 = new JPanel();
		panelIzquierdo.add(panelComboBox_1,BorderLayout.CENTER);
		//panelComboBox_1.setLayout(new BorderLayout(0, 0));
		
		lblLanguageCombobox = new JLabel("LANGUAGE");
		panelComboBox_1.add(lblLanguageCombobox);
		
		
		
		String[] items = {"item1","item2","item3","item4","item5"};
		comboBoxLanguage = new JComboBox();
		panelComboBox_1.add(comboBoxLanguage);
		
		
		
		panelComboBox_2 = new JPanel();
		panelIzquierdo.add(panelComboBox_2,BorderLayout.CENTER);
		
		lblRaceCombobox = new JLabel("RACE");
		panelComboBox_2.add(lblRaceCombobox);
		
		comboBoxRace = new JComboBox();
		panelComboBox_2.add(comboBoxRace);
		
		panelFindResetExitButtons = new JPanel();
		panelIzquierdo.add(panelFindResetExitButtons);
		
		btnFind = new JButton("Find");
		panelFindResetExitButtons.add(btnFind);
		
		btnReset = new JButton("Reset");
		panelFindResetExitButtons.add(btnReset);
		
		btnExit = new JButton("Exit");
		panelFindResetExitButtons.add(btnExit);
		
		panelDerecho = new JPanel();
		splitPane.setRightComponent(panelDerecho);
		panelDerecho.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblFirstName = new JLabel("First Name");
		panelDerecho.add(lblFirstName);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setEditable(false);
		textFieldFirstName.setColumns(10);
		panelDerecho.add(textFieldFirstName);
		
		lblLastName = new JLabel("Last Name");
		panelDerecho.add(lblLastName);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setEditable(false);
		textFieldLastName.setColumns(10);
		panelDerecho.add(textFieldLastName);
		
		lblGender = new JLabel("Gender");
		panelDerecho.add(lblGender);
		
		textFieldGender = new JTextField();
		textFieldGender.setEditable(false);
		textFieldGender.setColumns(10);
		panelDerecho.add(textFieldGender);
		
		lblLanguage = new JLabel("Language");
		panelDerecho.add(lblLanguage);
		
		textFieldLanguage = new JTextField();
		textFieldLanguage.setEditable(false);
		textFieldLanguage.setColumns(10);
		panelDerecho.add(textFieldLanguage);
		
		lblRace = new JLabel("Race");
		panelDerecho.add(lblRace);
		
		textFieldRace = new JTextField();
		textFieldRace.setEditable(false);
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
		/*
		String[] columnNames = {"First Name", "Last Name", "Sport", "# of Years", "Vegetarian"};
		Object[][] data = {
		    {"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
		    {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
		    {"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},
		    {"Jane", "White", "Speed reading", new Integer(20), new Boolean(true)},
		    {"Joe", "Brown", "Pool", new Integer(10), new Boolean(false)}
		};
		*/
		table = new JTable();
		
		scrollPane.setViewportView(table);
		
		
		
		// Elementos Ocultos hasta activación del fichero
		buttonMayor.setEnabled(false);
		buttonMayorMayor.setEnabled(false);
		buttonMenos.setEnabled(false);
		buttonMenosMenos.setEnabled(false);
		btnFind.setEnabled(false);
		btnReset.setEnabled(false);
		comboBoxLanguage.setEnabled(false);
		comboBoxRace.setEnabled(false);
		
		
	}
	
	public ButtonGroup getRadioButtonGroup() {
		return radioButtonGroup;
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

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public JSplitPane getSplitPane() {
		return splitPane;
	}

	public JPanel getPanelIzquierdo() {
		return panelIzquierdo;
	}

	public JPanel getPanelDerecho() {
		return panelDerecho;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public JPanel getPanelRadioButton() {
		return panelRadioButton;
	}

	public JRadioButton getRadioButtonMale() {
		return radioButtonMale;
	}

	public JRadioButton getRadioButtonFemale() {
		return radioButtonFemale;
	}

	public JPanel getPanelComboBox_1() {
		return panelComboBox_1;
	}

	public JPanel getPanelComboBox_2() {
		return panelComboBox_2;
	}

	public JPanel getPanelFindResetExitButtons() {
		return panelFindResetExitButtons;
	}

	public JButton getBtnFind() {
		return btnFind;
	}

	public JButton getBtnReset() {
		return btnReset;
	}

	public JButton getBtnExit() {
		return btnExit;
	}

	public JComboBox getComboBoxLanguage() {
		return comboBoxLanguage;
	}

	public JComboBox getComboBoxRace() {
		return comboBoxRace;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
}
