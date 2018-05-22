package com.iesvirgendelcarmen.menu.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;

import com.iesvirgendelcarmen.menu.modelo.Colectivo;
import com.iesvirgendelcarmen.menu.modelo.Persona;
import com.iesvirgendelcarmen.menu.vista.VistaMenu;

public class ControladorMenu implements ActionListener {

	private Colectivo colectivo;
	private VistaMenu vista;
	private List<Persona> listaPersona;
	private int posicion = 0;
	private String path; 
	
	public ControladorMenu(VistaMenu vista) {
		this.vista = vista;
		colectivo = new Colectivo("datos\\data.csv");
		listaPersona = colectivo.getListaPersonas();
		registerComponent();
		if (posicion>=0 && posicion<=1000)
			colocarFormularioPersona(posicion);
	}

	// Añade los campos del csv a los textfield de la vista
	
	private void colocarFormularioPersona(int i) {
		vista.getTextFieldFirstName().setText(
				listaPersona.get(i).getNombre());
		vista.getTextFieldLastName().setText(
				listaPersona.get(i).getApellido());
		vista.getTextFieldGender().setText(
				listaPersona.get(i).getGenero()+"");
		vista.getTextFieldLanguage().setText(
				listaPersona.get(i).getLenguaje());
		vista.getTextFieldRace().setText(
				listaPersona.get(i).getRaza());
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
			default:
				break;
			}
			posicion%=listaPersona.size();
			if(posicion<0)
				posicion+=listaPersona.size();
			colocarFormularioPersona(posicion);
		}
		
		if (e.getSource().getClass() == JMenuItem.class) {
			
			if(e.getSource().getClass()==JMenuItem.class) {
				JMenuItem menuItem = (JMenuItem) e.getSource();
				String menuString = menuItem.getText();
				System.out.println(menuString);
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
		if(resultado==fileChooser.APPROVE_OPTION)
			System.out.println(fileChooser.getSelectedFile().getPath());
		else
			lanzarEleccionFichero();
	}
}
