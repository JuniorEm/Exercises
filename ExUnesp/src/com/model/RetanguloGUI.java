package com.model;

import javax.swing.JOptionPane;

public class RetanguloGUI implements FormaGeometricaGUI {

	public FormaGeometrica exibeMensagem() {
		double baseRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite base para ret�ngulo: "));
		double alturaRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura para o ret�ngulo: "));
		return new Retangulo(baseRetangulo, alturaRetangulo);
	}

}
