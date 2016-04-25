package com.model;

import javax.swing.JOptionPane;

public class QuadradoGUI implements FormaGeometricaGUI {

	public FormaGeometrica exibeMensagem() {
		double lado = Double.parseDouble(JOptionPane.showInputDialog("Digite lado para seu quadrado: "));
		return new Quadrado(lado);
	}

}
