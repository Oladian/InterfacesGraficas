package com.iesvirgendelcarmen.MVC.Controlador;

import java.awt.EventQueue;
import com.iesvirgendelcarmen.MVC.Modelo.Usuario;
import com.iesvirgendelcarmen.MVC.Vista.LoginMVC;

public class PrincipalLogin {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario usuario = new Usuario();
					LoginMVC vista = new LoginMVC();
					new ControladorLogin(usuario, vista);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
