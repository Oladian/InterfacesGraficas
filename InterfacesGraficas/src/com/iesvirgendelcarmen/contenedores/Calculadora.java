package com.iesvirgendelcarmen.contenedores;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Calculadora {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				crearAplicacion();
			}
			private void crearAplicacion() {
				JFrame frame = new InterfazCalculadora();
				frame.setVisible(true);
			}
		});
	}
}

@SuppressWarnings("serial")
class InterfazCalculadora extends JFrame{
	
	private JLabel etiqueta;   	//componente de la frame, se declara como 
								//atributo de clase para que la vea cualquier metodo
	
	private JTextField cajaTexto;
	
	public InterfazCalculadora() {
		iniciarVentana();
		colocarComponentes();
	}
	
	private void colocarComponentes() {
		
		GridLayout layout = new GridLayout(4,4);
		this.add(new JTextField(10),BorderLayout.NORTH);
		JPanel panel = new JPanel();
		panel.setLayout(layout);
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		panel.add(new JButton("+"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("-"));
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("*"));
		panel.add(new JButton("0"));
		panel.add(new JButton("."));
		panel.add(new JButton("/"));
		panel.add(new JButton("="));
		// añadir el panel al border layout
		this.add(panel, BorderLayout.CENTER);
		
	}
	
	// Desacoplando codigo que establece las opciones de la frame
	private void iniciarVentana() {
		this.setTitle("Calculadora");			 		// titulo
		this.setBounds(10, 10, 200, 200);				// establece la posicion en coordenadas (x, y) y el tamaño
		//this.setSize(300, 200);						// tamaño
		this.setLocationRelativeTo(null);				// centrado
		//this.setResizable(false);						// no se puede redimensionar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
