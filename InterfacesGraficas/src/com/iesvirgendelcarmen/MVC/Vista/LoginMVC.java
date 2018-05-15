package com.iesvirgendelcarmen.MVC.Vista;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import com.iesvirgendelcarmen.MVC.Modelo.Usuario;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;

public class LoginMVC{

	private JFrame frame;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JButton btnAceptar;
	private JButton btnSalir;
	private JSpinner spinner;
	private ButtonGroup radioButtonGroup;
	private JRadioButton rdbtnMujer;

	public LoginMVC() {
		initialize();
		//frame.setVisible(true);
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Creación de Usuarios");
		frame.setBounds(100, 100, 385, 251);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(83, 29, 46, 23);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(83, 63, 46, 23);
		frame.getContentPane().add(lblApellido);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(83, 97, 46, 23);
		frame.getContentPane().add(lblEdad);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(162, 30, 125, 20);
		frame.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(162, 64, 125, 20);
		frame.getContentPane().add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		SpinnerModel sm = new SpinnerNumberModel(0, 0, 100, 1); //default value,lower bound,upper bound,increment by
		spinner = new JSpinner(sm);
		spinner.setToolTipText("");
		spinner.setBounds(162, 98, 46, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(83, 131, 46, 14);
		frame.getContentPane().add(lblSexo);
		
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setBounds(162, 127, 87, 23);
		rdbtnHombre.setActionCommand("hombre");
		frame.getContentPane().add(rdbtnHombre);
		
		rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(162, 153, 87, 23);
		rdbtnMujer.setActionCommand("mujer");
		frame.getContentPane().add(rdbtnMujer);
		
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(rdbtnHombre);
		radioButtonGroup.add(rdbtnMujer);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setActionCommand("aceptar");
		
/*		btnAceptar.addActionListener(e -> { 								// Expresión ¿landa? - Programación funcional - Función flecha
				String nombre = textFieldNombre.getText();
				String apellido = textFieldApellido.getText();
				int edad = (int)spinner.getValue();
				
				Sexo sexo = Sexo.Hombre;
				if (rdbtnMujer.isSelected())
					sexo = Sexo.Mujer;
				
				Usuario usuario = new Usuario(nombre, apellido, edad, sexo);
				
				JOptionPane.showMessageDialog(frame, "Usuario creado \n\n"+usuario, "Informacion de Usuario",JOptionPane.INFORMATION_MESSAGE);

		});
 */
		btnAceptar.setBounds(83, 183, 89, 23);
		frame.getContentPane().add(btnAceptar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setActionCommand("salir");
		
		btnSalir.setBounds(205, 183, 89, 23);
		frame.getContentPane().add(btnSalir);
/*		btnSalir.addActionListener(e -> { 
			System.exit(0);
		});
*/
		
	}

	// Getters necesarios
	
	public JButton getBtnAceptar() {
		return btnAceptar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public JTextField getTextFieldApellido() {
		return textFieldApellido;
	}

	public JSpinner getSpinner() {
		return spinner;
	}

	public ButtonGroup getRadioButtonGroup() {
		return radioButtonGroup;
	}

	public JRadioButton getRdbtnMujer() {
		return rdbtnMujer;
	}

	// Metodo para lanzar el dialogo
	
	public void lanzarDialogo(Usuario usuario) {
		JOptionPane.showMessageDialog(frame, "Usuario creado \n\n"+usuario, "Informacion de Usuario",JOptionPane.INFORMATION_MESSAGE);
	}
}

