package com.iesvirgendelcarmen.contenedores;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class EjemploGridLayout {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				crearAplicacion();
			}
			private void crearAplicacion() {
				JFrame frame = new InterfazGridLayout();
				frame.setVisible(true);
			}
		});
	}
}

@SuppressWarnings("serial")
class InterfazGridLayout extends JFrame{
	
	private JLabel etiqueta;   	//componente de la frame, se declara como 
								//atributo de clase para que la vea cualquier metodo
	
	private JTextField cajaTexto;
	
	public InterfazGridLayout() {
		iniciarVentana();
		colocarComponentes();
	}
	
	private void colocarComponentes() {
		
		GridLayout layout = new GridLayout(2, 0);		// layout con filas y columnas - dos filas, cero columnas
		layout.setHgap(50);
		layout.setVgap(20);
		this.setLayout(layout);	
		this.setLayout(layout);
		etiqueta = new JLabel("Texto de la etiqueta");
		this.add(etiqueta);
		cajaTexto = new JTextField(6);
		this.add(cajaTexto);
		this.add(new JLabel("Otra etiqueta"));				// JLabel sin crearse como atributo
		this.add(new JTextField("Hola Mundo",10));			// JTextField sin crearse como atributo;
		
	}
	
	// Desacoplando codigo que establece las opciones de la frame
	private void iniciarVentana() {
		this.setTitle("Frame con GridLayout"); 			// titulo
		this.setBounds(10, 10, 400, 400);				// establece la posicion en coordenadas (x, y) y el tamaño
		//this.setSize(300, 200);						// tamaño
		this.setLocationRelativeTo(null);				// centrado
		//this.setResizable(false);						// no se puede redimensionar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}