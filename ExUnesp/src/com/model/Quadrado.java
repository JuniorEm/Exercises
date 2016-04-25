package com.model;

import javax.swing.JOptionPane;

public class Quadrado implements FormaGeometrica {
	private final double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public double calculaPerimetro() {
		return lado * 4;
	}

	public double calculaArea() {
		return lado * lado;
	}
	
	public String toString() {
		return "\nQuadrado" +
				"\nLado: " + lado +
				"\nPerímetro: " + calculaPerimetro() +
				"\nÁrea: " + calculaArea();
	}

}
