package com.model;

import javax.swing.JOptionPane;

public class EDadoInvalido {

	public static String validaCampoVazio(String jOption, String inputMessage, String alertMessage) {
		while (jOption.isEmpty()) {
			jOption = JOptionPane.showInputDialog(inputMessage);
			if (jOption.isEmpty()) {
				JOptionPane.showMessageDialog(null, alertMessage);
			}
		}
		return jOption;
	} 
	
	

}
