package com.model;

import javax.swing.JOptionPane;

public class CirculoGUI implements FormaGeometricaGUI {

	public FormaGeometrica exibeMensagem() {
		double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio para o c�rculo: "));
		return new Circulo(raio);
	}

}
