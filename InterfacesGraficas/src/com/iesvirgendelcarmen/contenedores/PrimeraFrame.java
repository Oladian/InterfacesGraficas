package com.iesvirgendelcarmen.contenedores;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PrimeraFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Primera frame"); // crea una frame
		JButton jbkOK = new JButton("Boton");
		frame.add(jbkOK);
		frame.setResizable(false);
		frame.setSize(300, 300); // Tamaño
		frame.setLocationRelativeTo(null); // Centra
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cierre
		frame.setVisible(true); // Display la frame
		
	}
}
