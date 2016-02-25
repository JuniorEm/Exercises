package br.com.teste.modelo;

public class Circulo implements FormaGeometrica {
	private double raio;
	private final double pi = 3.1415;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	public double calculaPerimetro() {
		return 2 * pi * raio;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return pi * (raio * raio);
	}
	
	public String toString() {
		return "Raio: " + raio;
	}
}
