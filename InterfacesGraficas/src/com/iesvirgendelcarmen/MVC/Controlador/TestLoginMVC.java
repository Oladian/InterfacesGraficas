package com.iesvirgendelcarmen.MVC.Controlador;

import java.awt.EventQueue;
import com.iesvirgendelcarmen.MVC.Vista.LoginMVC;

public class TestLoginMVC {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new LoginMVC();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
