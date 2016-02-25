package br.com.teste.modelo;

public abstract class Quadrilatero implements FormaGeometrica {
	protected int ladoA;
	protected int ladoB;

	//Constructor
	public Quadrilatero(int ladoA, int ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	//Getters and Setters
	
	//Methods
	public double calculaPerimetro() {
		return (int) (ladoA * 2) + (ladoB * 2);
	}
	
	public String toString() {
		return "Lados: " + ladoA + " e " + ladoB;
	}
}
