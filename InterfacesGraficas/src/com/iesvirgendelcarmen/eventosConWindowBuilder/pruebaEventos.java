package com.iesvirgendelcarmen.eventosConWindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pruebaEventos implements ActionListener{

	private JFrame frame;
	private JTextField textFieldUsuario;
	private JPasswordField passwordField;
	private JLabel labelInfo;
	private JButton btnBorrar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pruebaEventos window = new pruebaEventos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public pruebaEventos() {
		initialize();
	}

	private void initialize() {

		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 228, 262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNick = new JLabel("Nick");
		lblNick.setBounds(10, 29, 112, 23);
		frame.getContentPane().add(lblNick);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(101, 35, 110, 20);
		frame.getContentPane().add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 53, 89, 44);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(101, 63, 110, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnAceptar = new JButton("Aceptar");
		
		btnAceptar.addActionListener(this); // IMPLEMENTA ActionListener, con el metodo actionPerformance()
		
		/*{
			public void actionPerformed(ActionEvent e) {
				String nuevoUsuario=textFieldUsuario.getText();
				char[] password = passwordField.getPassword();
				if(password.length!=0 && nuevoUsuario.length()!=0) {
					labelInfo.setText("Añadido nuevo usuario: "+nuevoUsuario);
					System.out.println(((JButton) e.getSource()).getText());
				}
			}
		});
		*/
		
		btnAceptar.setBounds(10, 115, 89, 23);
		frame.getContentPane().add(btnAceptar);
		
		labelInfo = new JLabel("");
		labelInfo.setBounds(10, 142, 239, 68);
		frame.getContentPane().add(labelInfo);
		
		btnBorrar = new JButton("Borrar");
		
		btnBorrar.addActionListener(this); // IMPLEMENTA ActionListener,  con el metodo actionPerformance()
		
		
		/*
		{
		public void actionPerformed(ActionEvent e) {
				String nuevoUsuario=textFieldUsuario.getText();
				char[] password = passwordField.getPassword();
				if(password.length!=0 && nuevoUsuario.length()!=0) {
					labelInfo.setText("Usuario borrado");
					System.out.println(((JButton) e.getSource()).getText());
					textFieldUsuario.setText("");
					passwordField.setText("");
				}
			}
		});
		*/
		
		btnBorrar.setBounds(122, 115, 89, 23);
		frame.getContentPane().add(btnBorrar);
	}
	
	// Clase interna para los botones. Se ahorra bastante código
/*	
	class PulsarBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String usuario = textFieldUsuario.getText();
			String cabecera = "Creado usuario ";
			char[] password = passwordField.getPassword();
			
			if(((JButton)e.getSource()).getText().equals("Borrar"))
				cabecera="Borrado usuario ";
			
			if(password.length!=0 && usuario.length()!=0&&cabecera.equals("Borrado usuario ")) {
				System.out.println(((JButton) e.getSource()).getText());
				textFieldUsuario.setText("");
				passwordField.setText("");
			}
			labelInfo.setText(cabecera+usuario);
		}
	}
*/
	@Override
	public void actionPerformed(ActionEvent e) {
		String usuario = textFieldUsuario.getText();
		String cabecera = "Creado usuario ";
		char[] password = passwordField.getPassword();
		
		if(((JButton)e.getSource()).getText().equals("Borrar"))
			cabecera="Borrado usuario ";
		
		if(password.length!=0 && usuario.length()!=0&&cabecera.equals("Borrado usuario ")) {
			System.out.println(((JButton) e.getSource()).getText());
			textFieldUsuario.setText("");
			passwordField.setText("");
		}
		labelInfo.setText(cabecera+usuario);
		
	}
	
}

