package com.iesvirgendelcarmen.menu.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colectivo {
	private List<Persona> listaPersonas = new ArrayList<>();
	
	public Colectivo(String path) {
		cargarDatosFichero(path);
	}

	private void cargarDatosFichero(String path) {
		try(Scanner sc = new Scanner(new File(path));) {
			
			while(sc.hasNextLine()) {
				String[] datos = sc.nextLine().split(",");
				Genero genero = Genero.HOMBRE;
				if(datos[2].equals("Female")) {
					genero=Genero.MUJER;
				}
				listaPersonas.add(new Persona(datos[0], datos[1], genero, datos[3], datos[4]));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
}
