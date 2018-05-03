package com.iesvirgendelcarmen.contenedores;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ImplementacionOptimaFrame {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				crearAplicacion();
			}
			
			// cuando arranques la aplicacion puede ser que se necesite 
			// cargar datos de una base de datos, desacoplando se consigue 
			// especializar los metodos
			
			private void crearAplicacion() {
				JFrame frame = new Interfaz();
				frame.setVisible(true);
			}
		});
	}
}

@SuppressWarnings("serial")
class Interfaz extends JFrame{
	
	private JLabel etiqueta;   	//componente de la frame, se declara como 
								//atributo de clase para que la vea cualquier metodo
	
	// Creación del constructor, lanza los metodos
	public Interfaz() {
		iniciarVentana();
		colocarComponentes();
	}
	
	// Desacoplando codigo que añade una etiqueta
	private void colocarComponentes() {
		etiqueta = new JLabel("Texto de la etiqueta");
		this.add(etiqueta);
	}
	
	// Desacoplando codigo que establece las opciones de la frame
	private void iniciarVentana() {
		this.setTitle("Frame con Interfaz separada"); 	// titulo
		this.setBounds(10, 10, 400, 400);				// establece la posicion en coordenadas (x, y) y el tamaño
		//this.setSize(300, 200);						// tamaño
		this.setLocationRelativeTo(null);				// centrado
		//this.setResizable(false);						// no se puede redimensionar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
