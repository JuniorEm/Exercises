package com.model;

import javax.swing.JOptionPane;

public class Circulo implements FormaGeometrica {
	private final double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public double calculaPerimetro() {
		return 2 * 3.1415 * raio;
	}

	public double calculaArea() {
		return 3.1415 * raio * raio;
	}
	
	public String toString() {
		return "\nC�rculo" +
				"\nRaio: " + raio +
				"\nPer�metro: " + Math.round(calculaPerimetro()) +
				"\n�rea: " + Math.round(calculaArea());
	}
	
}
