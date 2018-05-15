package com.iesvirgendelcarmen.MVC.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.iesvirgendelcarmen.MVC.Modelo.Sexo;
import com.iesvirgendelcarmen.MVC.Modelo.Usuario;
import com.iesvirgendelcarmen.MVC.Vista.LoginMVC;

public class ControladorLogin implements ActionListener {

	private Usuario usuario; //modelo
	private LoginMVC vista;
	
	
	public ControladorLogin(Usuario usuario, LoginMVC vista) {
		this.usuario = usuario;
		this.vista = vista;
		registrarComponentes(); //fuentes de los eventos
	}
	
	
	private void registrarComponentes() {
		vista.getBtnAceptar().addActionListener(this);  // Registra el boton aceptar
		vista.getBtnSalir().addActionListener(this);    // Registra el boton salir
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//e.getSource(); // Devuelve un objeto, en este caso se usará para devolver un JButton
		
		String boton = e.getActionCommand();
		switch (boton) {
		case "aceptar":
			String nombre = vista.getTextFieldNombre().getText();
			String apellido = vista.getTextFieldApellido().getText();
			int edad = (int)vista.getSpinner().getValue();
			
			Sexo sexo = Sexo.Hombre;
			if (vista.getRdbtnMujer().isSelected())
				sexo = Sexo.Mujer;
			
			Usuario usuario = new Usuario(nombre, apellido, edad, sexo);
			vista.lanzarDialogo(usuario);
			
			break;
		case "salir":
			System.exit(0);
			break;
		default:
			break;
		}
	}


}
