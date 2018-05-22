package com.iesvirgendelcarmen.menu.modelo;

import java.awt.EventQueue;

import com.iesvirgendelcarmen.menu.controlador.ControladorMenu;
import com.iesvirgendelcarmen.menu.vista.VistaMenu;

public class PrincipalMenu {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaMenu vista = new VistaMenu();
					new ControladorMenu(vista);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
