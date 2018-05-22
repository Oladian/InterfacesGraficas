package com.iesvirgendelcarmen.menu.modelo;

public class Persona {
	private String nombre;
	private String apellido;
	private Genero genero;
	private String lenguaje;
	private String raza;
	
	public Persona(String nombre, String apellido, Genero genero, String lenguaje, String raza) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.lenguaje = lenguaje;
		this.raza = raza;
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

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", lenguaje=" + lenguaje
				+ ", raza=" + raza + "]";
	}
	
	
}
