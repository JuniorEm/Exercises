package br.com.teste.modelo;

public class Quadrado extends Quadrilatero {

	public Quadrado(int ladoA, int ladoB) {
			super(ladoA, ladoB);

	}

	public double calculaArea() {
		return (int) ladoA * ladoB;
	}

}
