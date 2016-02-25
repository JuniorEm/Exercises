package br.com.teste.main;

import javax.swing.JOptionPane;

import br.com.teste.modelo.Circulo;
import br.com.teste.modelo.FormaGeometrica;
import br.com.teste.modelo.Quadrado;
import br.com.teste.modelo.Quadrilatero;
import br.com.teste.modelo.Retangulo;
import br.com.teste.modelo.Vetor;

public class Main3 {
	public static void main(String[] args) {
		int aux = 0;
		int cont = Integer.parseInt(
		JOptionPane.showInputDialog("Quantas formas deseja criar? (Você PRECISA criar uma das três)", null));
		
		Vetor vetor = new Vetor(cont);
		
		while (aux < cont) {
			String quadrado = JOptionPane.showInputDialog("Deseja criar um quadrado?", null);
			if (quadrado.equalsIgnoreCase("sim") || quadrado.equalsIgnoreCase("s")) {
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado para seu quadrado!", null));
				vetor.adiciona(new Quadrado(lado, lado));
				aux++;
			} else if (quadrado.equalsIgnoreCase("nao") || quadrado.equalsIgnoreCase("não")
					|| quadrado.equalsIgnoreCase("n")) {
				String retangulo = JOptionPane.showInputDialog("Deseja criar um retângulo?", null);
				if (retangulo.equalsIgnoreCase("sim") || retangulo.equalsIgnoreCase("s")) {
					int ladoA = Integer
							.parseInt(JOptionPane.showInputDialog("Digite o lado para seu retângulo!", null));
					int ladoB = Integer
							.parseInt(JOptionPane.showInputDialog("Digite outro lado para seu retângulo!", null));
					vetor.adiciona(new Retangulo(ladoA, ladoB));
					aux++;
				} else if (retangulo.equalsIgnoreCase("nao") || retangulo.equalsIgnoreCase("não")
						|| retangulo.equalsIgnoreCase("n")) {
					String circulo = JOptionPane.showInputDialog("Deseja criar um círculo?", null);
					if (circulo.equalsIgnoreCase("sim") || circulo.equalsIgnoreCase("s")) {
						int raio = Integer
								.parseInt(JOptionPane.showInputDialog("Digite o raio para seu circulo!", null));
						vetor.adiciona(new Circulo(raio));
						aux++;
					}
				}
			}
		}
		
		FormaGeometrica[] lista = vetor.getListaForma();
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof Quadrilatero) {
				System.out.println("\nÉ um quadrilátero!");
				System.out.println(lista[i]);
				System.out.println("Perímetro: " + lista[i].calculaPerimetro());
				System.out.println("Área: " + lista[i].calculaArea());
			}
			
			if (lista[i] instanceof Circulo) {
				System.out.println("\nÉ um círculo!");
				System.out.println(lista[i]);
				System.out.println("Perímetro: " + lista[i].calculaPerimetro());
				System.out.println("Área: " + lista[i].calculaArea());
			}
		}
	}
}
			
		
