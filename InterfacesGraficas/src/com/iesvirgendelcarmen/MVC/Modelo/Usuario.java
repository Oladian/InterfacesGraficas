package com.iesvirgendelcarmen.MVC.Modelo;

public class Usuario {
	private String nombre;
	private String apellido;
	private int edad;
	private Sexo sexo;
	
	public Usuario() {} // Constructor por defecto
	
	public Usuario(String nombre, String apellido, int edad, Sexo sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nSexo: " + sexo;
	}
	
}
