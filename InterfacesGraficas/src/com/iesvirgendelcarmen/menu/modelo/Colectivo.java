package com.iesvirgendelcarmen.menu.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colectivo {
	private List<Persona> listaPersonas = new ArrayList<>();
	private String[] nombreColumnas;
	private Object[][] data;
	
	public Colectivo(String path) {
		cargarDatosFichero(path);
	}

	private void cargarDatosFichero(String path) {
		try(Scanner sc = new Scanner(new File(path));) {
			nombreColumnas = sc.nextLine().split(",");
			
			while(sc.hasNextLine()) {
				String[] datos = sc.nextLine().split(",");
				Genero genero = Genero.HOMBRE;
				if(datos[2].equals("Female")) {
					genero=Genero.MUJER;
				}
				listaPersonas.add(new Persona(datos[0], datos[1], genero, datos[3], datos[4]));
			}
			completarArrays();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void completarArrays() {
		data = new Object[listaPersonas.size()][5];
		int contador = 0;
		for (Persona persona : listaPersonas) {
			data[contador][0] = persona.getNombre();
			data[contador][1] = persona.getApellido();
			data[contador][2] = persona.getGenero();
			data[contador][3] = persona.getLenguaje();
			data[contador][4] = persona.getRaza();
			contador++;
		}
	}

	public boolean anadirPersona(Persona persona) {
		return listaPersonas.add(persona);
	}
	
	public boolean eliminarPersona(Persona persona) {
		return listaPersonas.remove(persona);
	}
	

	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	public String[] getNombreColumnas() {
		return nombreColumnas;
	}

	public void setNombreColumnas(String[] nombreColumnas) {
		this.nombreColumnas = nombreColumnas;
	}

	public Object[][] getData() {
		return data;
	}

	public void setData(Object[][] data) {
		this.data = data;
	}
}
