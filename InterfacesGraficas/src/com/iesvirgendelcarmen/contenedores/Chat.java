package com.iesvirgendelcarmen.contenedores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Chat {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				crearAplicacion();
			}
			private void crearAplicacion() {
				JFrame frame = new InterfazChat();
				frame.setVisible(true);
			}
		});
	}
}

@SuppressWarnings("serial")
class InterfazChat extends JFrame{
	
	private JLabel etiqueta;   	//componente de la frame, se declara como 
								//atributo de clase para que la vea cualquier metodo
	
	private JTextField cajaTexto;
	
	public InterfazChat() {
		iniciarVentana();
		colocarComponentesChat();
	}
	
	private void colocarComponentesChat() {
		
		// Creación de objetos panel
		JPanel panelNorte = new JPanel(new GridLayout(2,0));
		JPanel panelNorteInterior =  new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel panelNorteInterior2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel panelSur = new JPanel(new GridLayout(1, 0));
		JPanel panelSurInterior = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		// Se añaden componentes pertenecientes a PanelNorteInterior y PanelNorteInterior2
		panelNorteInterior.add(new JLabel("Nick")).setForeground(Color.CYAN);
		JTextField jText1 = new JTextField(15);
		panelNorteInterior.add(jText1).setForeground(Color.WHITE);
		panelNorteInterior.add(new JButton("Login"));
		panelNorteInterior.add(new JButton("Logout"));
		
		JLabel label1 = new JLabel("Conversacion");
		label1.setForeground(Color.CYAN);
		panelNorteInterior2.add(label1, BorderLayout.SOUTH);
		
		// Se añaden los paneles interiores al PanelNorte
		panelNorte.add(panelNorteInterior);
		panelNorte.add(panelNorteInterior2);

		// Se añade el panelNorte al layout principal
		this.add(panelNorte, BorderLayout.NORTH);
		
		// Se añade un JTextField al layout principal, ocupará el centro, oeste y este
		this.add(new JTextField()).setBackground(Color.DARK_GRAY);

		// Se añaden componentes pertenecientes a PanelSurInterior
		panelSurInterior.add(new JLabel("Mensaje")).setForeground(Color.CYAN);;
		
		JTextField jText2 = new JTextField(25);
		
		panelSurInterior.add(jText2, FlowLayout.CENTER).setForeground(Color.WHITE);
		panelSurInterior.add(new JButton("Enviar"));
		
		// Se añade el panel interiore al panelSur
		panelSur.add(panelSurInterior);
		
		// Se añade el panelSur al layout principal
		this.add(panelSur, BorderLayout.SOUTH);
		
		// Color de paneles
		
		jText1.setBackground(Color.DARK_GRAY);
		jText2.setBackground(Color.DARK_GRAY);
		panelNorteInterior.setBackground(new Color(43,87,135));
		panelNorteInterior2.setBackground(new Color(43,87,135));
		panelSurInterior.setBackground(new Color(43,87,135));
		
	}
	
	// Desacoplando codigo que establece las opciones de la frame
	private void iniciarVentana() {
		this.setTitle("Chat");			 				// titulo
		this.setBounds(10, 10, 450, 450);				// establece la posicion en coordenadas (x, y) y el tamaño
		//this.setSize(300, 200);						// tamaño
		this.setLocationRelativeTo(null);				// centrado
		this.setResizable(false);						// no se puede redimensionar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
