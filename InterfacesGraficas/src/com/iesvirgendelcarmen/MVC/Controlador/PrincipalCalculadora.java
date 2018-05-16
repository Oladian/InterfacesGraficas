package com.iesvirgendelcarmen.MVC.Controlador;

import java.awt.EventQueue;

import com.iesvirgendelcarmen.MVC.Modelo.CalculadoraModelo;
import com.iesvirgendelcarmen.MVC.Modelo.Usuario;
import com.iesvirgendelcarmen.MVC.Vista.CalculadoraMVC;
import com.iesvirgendelcarmen.MVC.Vista.LoginMVC;

public class PrincipalCalculadora {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraModelo calculadoraModelo = new CalculadoraModelo();
					CalculadoraMVC vista = new CalculadoraMVC();
					new ControladorCalculadora(calculadoraModelo, vista);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
