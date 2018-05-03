package com.iesvirgendelcarmen.contenedores;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class EjemploFlowLayout {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				crearAplicacion();
			}
			
			// cuando arranques la aplicacion puede ser que se necesite 
			// cargar datos de una base de datos, desacoplando se consigue 
			// especializar los metodos
			
			private void crearAplicacion() {
				JFrame frame = new InterfazFlowLayout();
				frame.setVisible(true);
			}
		});
	}
}

@SuppressWarnings("serial") 
class InterfazFlowLayout extends JFrame{
	
	private JLabel etiqueta;   	//componente de la frame, se declara como 
								//atributo de clase para que la vea cualquier metodo
	
	private JTextField cajaTexto;
	
	// Creación del constructor, lanza los metodos
	public InterfazFlowLayout() {
		iniciarVentana();
		colocarComponentes();
	}
	
	// Desacoplando codigo que añade una etiqueta
	private void colocarComponentes() {
		
		
		// cambia el segundo layout de la frame
		FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);
		layout.setHgap(50);
		this.setLayout(layout);	
		
		this.setLayout(layout);
		etiqueta = new JLabel("Texto de la etiqueta");
		this.add(etiqueta);
		cajaTexto = new JTextField(6);
		this.add(cajaTexto);
		this.add(new JLabel("Otra etiqueta"));				// JLabel sin crearse como atributo
		this.add(new JTextField("Hola Mundo",10));			// JTextField sin crearse como atributo;
		
		
		this.add(new JLabel("Etiqueta despues del layout")); 
		this.add(new JTextField(5));						
		
	}
	
	// Desacoplando codigo que establece las opciones de la frame
	private void iniciarVentana() {
		this.setTitle("Frame con FlowLayout"); 			// titulo
		this.setBounds(10, 10, 400, 400);				// establece la posicion en coordenadas (x, y) y el tamaño
		//this.setSize(300, 200);						// tamaño
		this.setLocationRelativeTo(null);				// centrado
		//this.setResizable(false);						// no se puede redimensionar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}