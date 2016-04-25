package com.model;

import javax.swing.JOptionPane;

public class RetanguloGUI implements FormaGeometricaGUI {

	public FormaGeometrica exibeMensagem() {
		double baseRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite base para retângulo: "));
		double alturaRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura para o retângulo: "));
		return new Retangulo(baseRetangulo, alturaRetangulo);
	}

}
