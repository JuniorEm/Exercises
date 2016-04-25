package com.model;

import javax.swing.JOptionPane;

public class Retangulo implements FormaGeometrica {
	private final double base;
	private final double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double calculaPerimetro() {
		return 2 * (base + altura);
	}

	public double calculaArea() {
		return base * altura;
	}
	
	public String toString() {
		return "\nRetângulo" +
				"\nBase: " + base +
				"\nAltura: " + altura +
				"\nPerímetro: " + calculaPerimetro() +
				"\nÁrea: " + calculaArea();
	}

}
