package com.iesvirgendelcarmen.MVC.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.iesvirgendelcarmen.MVC.Modelo.CalculadoraModelo;
import com.iesvirgendelcarmen.MVC.Modelo.ExcepcionCalculadora;
import com.iesvirgendelcarmen.MVC.Vista.CalculadoraMVC;

public class ControladorCalculadora implements ActionListener{

	private CalculadoraModelo modelo;
	private CalculadoraMVC vista;
	String numero = "";
	
	
	public ControladorCalculadora(CalculadoraModelo modelo, CalculadoraMVC vista) {
		this.modelo = modelo;
		this.vista = vista;
		registrarComponentes();
	}

	public void registrarComponentes() {
		
		vista.getBoton7().addActionListener(this);
		vista.getBoton8().addActionListener(this);
		vista.getBoton9().addActionListener(this);
		vista.getBotonMas().addActionListener(this);
		vista.getBoton4().addActionListener(this);
		vista.getBoton5().addActionListener(this);
		vista.getBoton6().addActionListener(this);
		vista.getBotonMenos().addActionListener(this);
		vista.getBoton1().addActionListener(this);
		vista.getBoton2().addActionListener(this);
		vista.getBoton3().addActionListener(this);
		vista.getBotonPor().addActionListener(this);
		vista.getBoton0().addActionListener(this);
		vista.getBotonC().addActionListener(this);
		vista.getBotonDividir().addActionListener(this);
		vista.getBotonIgual().addActionListener(this);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String textoCalculadora = vista.getTextFieldNumeros().getText();
		JButton boton = (JButton)e.getSource();
		String botonString = boton.getText();
		switch (botonString) {
		
		case "=":
			try {
				
				modelo = new CalculadoraModelo(textoCalculadora);
				vista.getTextFieldNumeros().setText(modelo.devolverResultado()+"");
			} catch (ExcepcionCalculadora e1) {
				vista.errorRegex();
				vista.getTextFieldNumeros().setText("");
			}
			break;
		case "C":
			vista.getTextFieldNumeros().setText("");
			break;
		default:
			vista.getTextFieldNumeros().setText(textoCalculadora+botonString);
			break;
		}
	}

}
