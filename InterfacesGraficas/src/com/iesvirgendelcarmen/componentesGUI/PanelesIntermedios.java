package com.iesvirgendelcarmen.componentesGUI;

import java.awt.GridLayout;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PanelesIntermedios {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrame frame = new VentanaPanelesIntermedios();
				frame.setVisible(true);
			}
		});
	}

}

class VentanaPanelesIntermedios extends JFrame{
	// Campos editables deben ponerse fuera, para que sean visibles por todos los metodos
	
	private static final long serialVersionUID = -2355558854089825387L;
	private JTextArea jTextArea;
	private String text;
	private JTextField textFieldLogin;
	private JPasswordField passwordField;
	private JButton buttonLogin;
	
	public VentanaPanelesIntermedios() {
		crearVentanaPanelesIntermedios();
		iniciarVentanaOPanelesIntermedios();
		crearJScrollPane();
		crearJSplitPane();
	}


	private JSplitPane crearJSplitPane() {
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, crearJScrollPane(), crearPanelDerecho());
		return splitPane;
	}


	private JPanel crearPanelDerecho() {
		JPanel panel = new JPanel(new GridLayout(0, 2, 30, 150));
		JLabel labelLogin = new JLabel("Usuario: ");
		textFieldLogin = new JTextField();
		panel.add(labelLogin);
		panel.add(textFieldLogin);
		
		JLabel labelPassword = new JLabel("Contraseña: ");
		panel.add(labelPassword);
		
		passwordField = new JPasswordField();
		panel.add(passwordField);
		
		buttonLogin = new JButton("ACEPTAR");
		panel.add(buttonLogin);
		
		return panel;
	}


	private JScrollPane crearJScrollPane() {
		try {
			jTextArea = new JTextArea();
			Properties prop = new Properties();
			prop.load(new FileReader("Properties/prop.properties"));
			text = prop.getProperty("FRASE_SCROLL");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jTextArea.setText(text);
		jTextArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(jTextArea);
		return scrollPane;
	}


	private void crearVentanaPanelesIntermedios() {

		JTabbedPane jTabbedPane = new JTabbedPane();
		JPanel pan1 = new JPanel();
		JLabel label = new JLabel("Panel1");
		JTextField textField = new JTextField(10);

		// Añade paneles
		pan1.add(label);
		pan1.add(textField);

		// Añade los paneles al panel de pestañas, el string es el nombre de las pestañas
		jTabbedPane.add("Panel 1",crearJSplitPane());
		jTabbedPane.add("Panel 2",crearJScrollPane());
		
		this.add(jTabbedPane);
	}
	
	
	
	private void iniciarVentanaOPanelesIntermedios() {
		this.setTitle("Chat");			 				// titulo
		this.setBounds(10, 10, 400, 500);				// establece la posicion en coordenadas (x, y) y el tamaño
		this.setLocationRelativeTo(null);				// centrado
		//this.setResizable(false);						// no se puede redimensionar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}