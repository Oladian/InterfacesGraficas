package com.iesvirgendelcarmen.eventosConWindowBuilder;

import java.awt.EventQueue;


public class testEventos {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					new eventoClaseInternaBoton(); // Se puede crear un objeto anónimo
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
