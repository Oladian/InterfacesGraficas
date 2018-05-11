package com.iesvirgendelcarmen.componentesGUI;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
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
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("Properties/prop.properties"));
			final String text = prop.getProperty("FRASE_SCROLL");
			JTabbedPane tabbed = new JTabbedPane();
			JScrollPane scroll = new JScrollPane();
			JPanel panel2 = new JPanel();
			
			JLabel label = new JLabel("Enter username:");
			JTextArea userName = new JTextArea(text);
			
			panel2.add(label);
			scroll.add(userName);
			
			tabbed.add(new JScrollPane(userName));
			tabbed.add(panel2);
			
			this.add(tabbed);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
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

