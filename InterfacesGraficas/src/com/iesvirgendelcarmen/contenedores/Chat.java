package com.iesvirgendelcarmen.contenedores;

import java.awt.BorderLayout;
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
		colocarComponentes();
	}
	
	private void colocarComponentes() {
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		//GridLayout layout = new GridLayout(4,4);
		panel1.add(new JLabel("Nick"));
		panel1.add(new JTextField(10));
		panel1.add(new JButton("Login"));
		panel1.add(new JButton("Logout"));
		this.add(panel1, BorderLayout.NORTH);
		panel2.add(new JLabel("Conversacion:"),BorderLayout.WEST);
		panel2.add(new JTextField(500));
		this.add(panel2, BorderLayout.CENTER);
		//JPanel panel = new JPanel();
		//panel.setLayout(layout);
		// añadir el panel al border layout
		//this.add(panel, BorderLayout.CENTER);
		
	}
	
	// Desacoplando codigo que establece las opciones de la frame
	private void iniciarVentana() {
		this.setTitle("Chat");			 				// titulo
		this.setBounds(10, 10, 400, 400);				// establece la posicion en coordenadas (x, y) y el tamaño
		//this.setSize(300, 200);						// tamaño
		this.setLocationRelativeTo(null);				// centrado
		//this.setResizable(false);						// no se puede redimensionar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
