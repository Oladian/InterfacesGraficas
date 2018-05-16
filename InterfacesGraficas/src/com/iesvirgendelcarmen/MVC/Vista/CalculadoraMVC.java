package com.iesvirgendelcarmen.MVC.Vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraMVC {

	private JFrame frame;
	private JTextField textFieldNumeros;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton botonMas;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton botonMenos;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton0;
	private JButton botonPor;
	private JButton botonC;
	private JButton botonDividir;
	private JButton botonIgual;
	private String textoOperacion;

	
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						CalculadoraMVC vista = new CalculadoraMVC();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	/**
	 * Create the application.
	 */
	public CalculadoraMVC() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.ITALIC, 16));
		frame.setBounds(100, 100, 350, 300);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculadora con WindowBuilder");
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		textFieldNumeros = new JTextField();
		textFieldNumeros.setForeground(Color.DARK_GRAY);
		textFieldNumeros.setBackground(Color.WHITE);
		textFieldNumeros.setFont(new Font("Dialog", Font.ITALIC, 16));
		textFieldNumeros.setEditable(false);
		textFieldNumeros.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(textFieldNumeros);
		textFieldNumeros.setColumns(30);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(4, 4, 0, 0));
		
		/*
		 *  BOTONES
		 */
		
		boton7 = new JButton("7");
		boton7.setActionCommand("boton7");
		panel_1.add(boton7);
		
		boton8 = new JButton("8");
		boton8.setActionCommand("boton8");
		panel_1.add(boton8);
		
		boton9 = new JButton("9");
		boton9.setActionCommand("boton9");
		panel_1.add(boton9);
		
		botonMas = new JButton("+");
		botonMas.setActionCommand("botonMas");
		panel_1.add(botonMas);
		
		boton4 = new JButton("4");
		boton4.setActionCommand("boton4");
		panel_1.add(boton4);
		
		boton5 = new JButton("5");
		boton5.setActionCommand("boton5");
		panel_1.add(boton5);
		
		boton6 = new JButton("6");
		boton6.setActionCommand("boton6");
		panel_1.add(boton6);
		
		botonMenos = new JButton("-");
		botonMenos.setActionCommand("botonMenos");
		panel_1.add(botonMenos);
		
		boton1 = new JButton("1");
		boton1.setActionCommand("boton1");
		panel_1.add(boton1);
		
		boton2 = new JButton("2");
		boton2.setActionCommand("boton2");
		panel_1.add(boton2);
		
		boton3 = new JButton("3");
		boton3.setActionCommand("boton3");
		panel_1.add(boton3);
		
		botonPor = new JButton("*");
		botonPor.setActionCommand("botonPor");
		panel_1.add(botonPor);
		
		boton0 = new JButton("0");
		boton0.setActionCommand("boton0");
		panel_1.add(boton0);
		
		botonC = new JButton("C");
		botonC.setActionCommand("botonC");
		panel_1.add(botonC);
		
		botonDividir = new JButton("/");
		botonDividir.setActionCommand("botonDividir");
		panel_1.add(botonDividir);
		
		botonIgual = new JButton("=");
		botonIgual.setActionCommand("botonIgual");
		panel_1.add(botonIgual);
		
		
	}
	
	public void errorRegex() {
		JOptionPane.showMessageDialog(frame, "Datos introducidos de forma incorrecta.", "Datos erróneos", 1);
	}
	
	public String getTextoOperacion() {
		return textoOperacion;
	}
	public JTextField getTextFieldNumeros() {
		return textFieldNumeros;
	}
	public JButton getBoton7() {
		return boton7;
	}
	public JButton getBoton8() {
		return boton8;
	}
	public JButton getBoton9() {
		return boton9;
	}
	public JButton getBotonMas() {
		return botonMas;
	}
	public JButton getBoton4() {
		return boton4;
	}
	public JButton getBoton5() {
		return boton5;
	}
	public JButton getBoton6() {
		return boton6;
	}
	public JButton getBotonMenos() {
		return botonMenos;
	}
	public JButton getBoton1() {
		return boton1;
	}
	public JButton getBoton2() {
		return boton2;
	}
	public JButton getBoton3() {
		return boton3;
	}
	public JButton getBoton0() {
		return boton0;
	}
	public JButton getBotonPor() {
		return botonPor;
	}
	public JButton getBotonC() {
		return botonC;
	}
	public JButton getBotonDividir() {
		return botonDividir;
	}
	public JButton getBotonIgual() {
		return botonIgual;
	}
	

}
