package com.iesvirgendelcarmen.menu.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import com.iesvirgendelcarmen.menu.modelo.ModeloMenu;
import com.iesvirgendelcarmen.menu.vista.VistaMenu;

public class ControladorMenu implements ActionListener {

//	private ModeloMenu modelo;
	private VistaMenu vista;

	public ControladorMenu(ModeloMenu modelo, VistaMenu vista) {
	//	this.modelo = modelo;
		this.vista = vista;
		registerComponent();
	}

	public void registerComponent() {
		vista.getMntmExit().addActionListener(this);
		vista.getMntmAbout().addActionListener(this);
		vista.getMntmCreateData().addActionListener(this);
		vista.getMntmGetData().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String menu = e.getActionCommand();

		if (e.getSource().getClass() == JMenuItem.class) {
			JMenuItem menuItem = (JMenuItem) e.getSource();
			String menuString = menuItem.getText();

			switch (menuString) {
			case "Exit":
				System.exit(0);
			case "About":
				vista.messageAbout();
				break;
			case "Get data":
				System.out.println("Get data");
				break;
			case "Create data":
				System.out.println("Create data");
				break;
			default:
				break;
			}

			/*if(menuString.equals("Exit")) {
				System.exit(0);
			} else if (menuItem.getText().equals("About")) {
				vista.messageAbout();
			} //else if (menuItem.getText().equals(""))
			 */
		}
	}
}
