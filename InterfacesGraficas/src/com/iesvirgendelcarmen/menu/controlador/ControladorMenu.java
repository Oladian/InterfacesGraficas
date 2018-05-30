package com.iesvirgendelcarmen.menu.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JTable;

import com.iesvirgendelcarmen.MVC.Modelo.Sexo;
import com.iesvirgendelcarmen.menu.modelo.Colectivo;
import com.iesvirgendelcarmen.menu.modelo.Persona;
import com.iesvirgendelcarmen.menu.vista.VistaMenu;

public class ControladorMenu implements ActionListener {

	private Colectivo colectivo;
	private VistaMenu vista;
	private List<Persona> listaPersona;
	private List<Persona> listaReset;
	private Set<String> conjuntoLenguajes = new HashSet<>();  // Una lista para añadir valores únicos
	private Set<String> conjuntoRazas = new HashSet<>();
	private int posicion = 0;
	private String path;
	
	private List<Persona> listaFiltrado = new ArrayList<>();
	
	public ControladorMenu(VistaMenu vista) {
		this.vista = vista;
		registerComponent();
	}

	// Añade los campos del csv a los textfield de la vista
	
	private void colocarFormularioPersona(int i, List<Persona> lista) {
		vista.getTextFieldFirstName().setText(
				lista.get(i).getNombre());
		vista.getTextFieldLastName().setText(
				lista.get(i).getApellido());
		vista.getTextFieldGender().setText(
				lista.get(i).getGenero()+"");
		vista.getTextFieldLanguage().setText(
				lista.get(i).getLenguaje());
		vista.getTextFieldRace().setText(
				lista.get(i).getRaza());
	}

	// Metodo para registrar componentes
	
	public void registerComponent() {
		vista.getMntmExit().addActionListener(this);
		vista.getMntmAbout().addActionListener(this);
		vista.getMntmGetData().addActionListener(this);
		vista.getButtonMayor().addActionListener(this);
		vista.getButtonMayorMayor().addActionListener(this);
		vista.getButtonMenos().addActionListener(this);
		vista.getButtonMenosMenos().addActionListener(this);
		vista.getBtnFind().addActionListener(this);
		vista.getBtnReset().addActionListener(this);
		vista.getBtnExit().addActionListener(this);
		
	}

	// Metodo sobreescrito de actionPerformed para escuchar menus y botones
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
		if(e.getSource().getClass()==JButton.class) {
			JButton jButton = (JButton) e.getSource();
			String textoBoton = jButton.getText();
			switch (textoBoton) {
			case ">":
				posicion++;
				break;
			case ">>":
				posicion+=10;
				break;
			case "<":
				posicion--;
				break;
			case "<<":
				posicion-=10;
				break;
			case "Exit":
				System.exit(0);
				break;
			case "Find":
				//listaFiltrado.set(0, null);
				Sexo sexo = Sexo.Hombre;
				String lenguaje = (String) vista.getComboBoxLanguage().getSelectedItem();
				String raza = (String) vista.getComboBoxRace().getSelectedItem();
				String sex = vista.getRadioButtonGroup().getSelection().getActionCommand();
				if (sex.equals("Female"))
					sexo=Sexo.Mujer;
				for (Persona persona : listaPersona	) {
					if(persona.getLenguaje().equals(lenguaje) || persona.getRaza().equals(raza) ||
							persona.getGenero().toString().toUpperCase().equals(sexo.toString().toUpperCase())) {
						listaFiltrado.add(persona);
					}
				}
				listaPersona = listaFiltrado;
				posicion = 0;
				break;
			case "Reset":
				listaPersona = listaReset;
				posicion=0;
			default:
				break;
			}
			// Normaliza para que si sobrepasa el máximo o el mínimo continúe por el principio o el final
			// contador%=listaPersona.size();
			posicion%=listaPersona.size();
			if(posicion<0)
				posicion+=listaPersona.size();
			colocarFormularioPersona(posicion, listaPersona);
		}
		
		if (e.getSource().getClass() == JMenuItem.class) {
			
			if(e.getSource().getClass()==JMenuItem.class) {
				JMenuItem menuItem = (JMenuItem) e.getSource();
				String menuString = menuItem.getText();
				switch (menuString) {
				case "Exit":
					System.exit(0);
				case "About":
					vista.messageAbout();
					break;
				case "Get data":
					lanzarEleccionFichero();
					break;
				default:
					break;
				}
			}

			/*if(menuString.equals("Exit")) {
				System.exit(0);
			} else if (menuItem.getText().equals("About")) {
				vista.messageAbout();
			} //else if (menuItem.getText().equals(""))
			 */
		}
	}

	private void lanzarEleccionFichero() {
		JFileChooser fileChooser = new JFileChooser(".");
		int resultado = fileChooser.showOpenDialog(vista.getFrame());
		
		
		if(resultado==fileChooser.APPROVE_OPTION) {
			path = fileChooser.getSelectedFile().getPath();
			colectivo = new Colectivo(path);
			listaPersona = colectivo.getListaPersonas();
			listaReset = colectivo.getListaPersonas();
			//JTable tabla = new JTable(colectivo.getData(),colectivo.getNombreColumnas());
			
			for (Persona persona : listaPersona) {
				conjuntoLenguajes.add(persona.getLenguaje()); // Añade lenguajes y no se repiten
				conjuntoRazas.add(persona.getRaza());
			}
			for (String string : conjuntoLenguajes) {
				vista.getComboBoxLanguage().addItem(string);
			}
			for (String string : conjuntoRazas) {
				vista.getComboBoxRace().addItem(string);
			}
			colocarFormularioPersona(posicion, listaPersona);
			vista.getButtonMayor().setEnabled(true);
			vista.getButtonMayorMayor().setEnabled(true);
			vista.getButtonMenos().setEnabled(true);
			vista.getButtonMenosMenos().setEnabled(true);
			vista.getBtnFind().setEnabled(true);
			vista.getBtnReset().setEnabled(true);
			vista.getComboBoxLanguage().setEnabled(true);
			vista.getComboBoxRace().setEnabled(true);
			vista.getMntmGetData().setEnabled(false);
			vista.getScrollPane().setViewportView(new JTable(colectivo.getData(),colectivo.getNombreColumnas()));
			
		} else if (resultado==JFileChooser.CANCEL_OPTION) {
			path=".";
		}
		else
			lanzarEleccionFichero();
		
	}
	
}
