package br.com.exercicio.teste;

import br.com.exercicio.modelo.Figura;

public class TestaFigura {
	public static void main(String[] args) {
		Figura f = new Figura(30, 50, 40, 35);
		System.out.println(f.calculaArea());
		System.out.println(f.calculaPerimetro());
	}
}
