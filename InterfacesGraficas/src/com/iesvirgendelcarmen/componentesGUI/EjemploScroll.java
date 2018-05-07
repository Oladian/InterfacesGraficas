package com.iesvirgendelcarmen.componentesGUI;

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

public class EjemploScroll {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				crearAplicacion();
			}
			private void crearAplicacion() {
				JFrame frame = new InterfazScroll();
				frame.setVisible(true);
			}
		});
	}
}

@SuppressWarnings("serial")
class InterfazScroll extends JFrame{
	
	public InterfazScroll() {
		iniciarVentana();
		colocarComponentesScroll();
	}
	
	private void colocarComponentesScroll() {
		JLabel label = new JLabel("Enter username:");
		JTextField userName = new JTextField(20);
		this.add(label);
		this.add(userName);
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

