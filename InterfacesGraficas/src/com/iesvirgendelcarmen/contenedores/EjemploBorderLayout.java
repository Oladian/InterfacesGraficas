package com.iesvirgendelcarmen.contenedores;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class EjemploBorderLayout {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				crearAplicacion();
			}
			private void crearAplicacion() {
				JFrame frame = new InterfazBoxLayout();
				frame.setVisible(true);
			}
		});
	}
}

@SuppressWarnings("serial")
class InterfazBorderLayout extends JFrame{
	
	private JLabel etiqueta;   	//componente de la frame, se declara como 
								//atributo de clase para que la vea cualquier metodo
	
	private JTextField cajaTexto;
	
	public InterfazBorderLayout() {
		iniciarVentana();
		colocarComponentes();
	}
	
	private void colocarComponentes() {
		
		BorderLayout layout = new BorderLayout();
		this.setLayout(layout);	
		etiqueta = new JLabel("Texto de la etiqueta");
		this.add(etiqueta,BorderLayout.NORTH);							//Arriba
		cajaTexto = new JTextField(6);
		this.add(cajaTexto,BorderLayout.WEST);							// Izquierda
		this.add(new JLabel("Otra etiqueta"),BorderLayout.CENTER);		// Centrado
		this.add(new JTextField("Hola Mundo",10),BorderLayout.SOUTH);	// Abajo
	}
	
	// Desacoplando codigo que establece las opciones de la frame
	private void iniciarVentana() {
		this.setTitle("Frame con BorderLayout"); 		// titulo
		this.setBounds(10, 10, 400, 400);				// establece la posicion en coordenadas (x, y) y el tamaño
		//this.setSize(300, 200);						// tamaño
		this.setLocationRelativeTo(null);				// centrado
		//this.setResizable(false);						// no se puede redimensionar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
