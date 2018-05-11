package com.iesvirgendelcarmen.windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;

public class CalculadoraWindowBuilder {

	private JFrame frame;
	private JTextField textField;
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
	private JButton botonPunto;
	private JButton botonDividir;
	private JButton botonIgual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraWindowBuilder window = new CalculadoraWindowBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculadoraWindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.ITALIC, 16));
		frame.setBounds(100, 100, 350, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculadora con WindowBuilder");
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setForeground(Color.DARK_GRAY);
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Dialog", Font.ITALIC, 16));
		textField.setEditable(false);
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(textField);
		textField.setColumns(30);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(4, 4, 0, 0));
		
		boton7 = new JButton("7");
		panel_1.add(boton7);
		
		boton8 = new JButton("8");
		panel_1.add(boton8);
		
		boton9 = new JButton("9");
		panel_1.add(boton9);
		
		botonMas = new JButton("+");
		panel_1.add(botonMas);
		
		boton4 = new JButton("4");
		panel_1.add(boton4);
		
		boton5 = new JButton("5");
		panel_1.add(boton5);
		
		boton6 = new JButton("6");
		panel_1.add(boton6);
		
		botonMenos = new JButton("-");
		panel_1.add(botonMenos);
		
		boton1 = new JButton("1");
		panel_1.add(boton1);
		
		boton2 = new JButton("2");
		panel_1.add(boton2);
		
		boton3 = new JButton("3");
		panel_1.add(boton3);
		
		botonPor = new JButton("*");
		panel_1.add(botonPor);
		
		boton0 = new JButton("0");
		panel_1.add(boton0);
		
		botonPunto = new JButton(".");
		panel_1.add(botonPunto);
		
		botonDividir = new JButton("/");
		panel_1.add(botonDividir);
		
		botonIgual = new JButton("=");
		panel_1.add(botonIgual);
	}

}
