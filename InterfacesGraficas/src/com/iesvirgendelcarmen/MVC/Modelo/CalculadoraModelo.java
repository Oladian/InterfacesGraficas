package com.iesvirgendelcarmen.MVC.Modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculadoraModelo {
	private String operacion;
	private int operando1;
	private int operando2;
	private int resultado;
	String regex = "^(\\d+)\\s*([\\+\\*\\-/]+)\\s*([0-9]+)$";
	Pattern patron = Pattern.compile(regex);
	
	public CalculadoraModelo() {}
	
	public CalculadoraModelo(String operacion) throws ExcepcionCalculadora {   // Una operacion: INT + String + INT (25-9)
		/*
		if (operacion.matches(regex)){
			System.out.println("Valido");
		} else
			throw new ExcepcionCalculadora("ERROR");
		*/
		
		// Se usará el matcher para agrupar los valores puestos en el patrón ->[ Numeros - Operación - Numeros ]
		Matcher matcher = patron.matcher(operacion);
		if (matcher.find()) { 
			this.operacion = matcher.group(2);
			this.operando1 = Integer.parseInt(matcher.group(1));
			this.operando2 = Integer.parseInt(matcher.group(3));
			System.out.println(devolverResultado());
		} else
			throw new ExcepcionCalculadora("ERROR");
	}
	
	public int devolverResultado() {
		switch (operacion) {
		case "+":
			return operando1 + operando2;
		case "*":
			return operando1 * operando2;
		case "/":
			return operando1 / operando2;
		default:
			return operando1 - operando2;
		}
	}
/*	
	private int getResultado() {
		return this.resultado = devolverResultado();
	}
	
	
	
	
	public static void main(String[] args) {
		try {
			CalculadoraModelo m = new CalculadoraModelo("0 / 0");
		} catch (ExcepcionCalculadora e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
*/	
}
