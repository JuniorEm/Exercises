package br.com.teste.modelo;

public class Retangulo extends Quadrilatero {
	
	public Retangulo(int base, int altura) {
		super(base, altura);
	}

	public double calculaArea() {
		// TODO Auto-generated method stub
		return (int) this.ladoA * this.ladoB;
	}
}
