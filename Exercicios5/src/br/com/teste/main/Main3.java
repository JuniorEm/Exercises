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
		JOptionPane.showInputDialog("Quantas formas deseja criar? (Voc� PRECISA criar uma das tr�s)", null));
		
		Vetor vetor = new Vetor(cont);
		
		while (aux < cont) {
			String quadrado = JOptionPane.showInputDialog("Deseja criar um quadrado?", null);
			if (quadrado.equalsIgnoreCase("sim") || quadrado.equalsIgnoreCase("s")) {
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado para seu quadrado!", null));
				vetor.adiciona(new Quadrado(lado, lado));
				aux++;
			} else if (quadrado.equalsIgnoreCase("nao") || quadrado.equalsIgnoreCase("n�o")
					|| quadrado.equalsIgnoreCase("n")) {
				String retangulo = JOptionPane.showInputDialog("Deseja criar um ret�ngulo?", null);
				if (retangulo.equalsIgnoreCase("sim") || retangulo.equalsIgnoreCase("s")) {
					int ladoA = Integer
							.parseInt(JOptionPane.showInputDialog("Digite o lado para seu ret�ngulo!", null));
					int ladoB = Integer
							.parseInt(JOptionPane.showInputDialog("Digite outro lado para seu ret�ngulo!", null));
					vetor.adiciona(new Retangulo(ladoA, ladoB));
					aux++;
				} else if (retangulo.equalsIgnoreCase("nao") || retangulo.equalsIgnoreCase("n�o")
						|| retangulo.equalsIgnoreCase("n")) {
					String circulo = JOptionPane.showInputDialog("Deseja criar um c�rculo?", null);
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
				System.out.println("\n� um quadril�tero!");
				System.out.println(lista[i]);
				System.out.println("Per�metro: " + lista[i].calculaPerimetro());
				System.out.println("�rea: " + lista[i].calculaArea());
			}
			
			if (lista[i] instanceof Circulo) {
				System.out.println("\n� um c�rculo!");
				System.out.println(lista[i]);
				System.out.println("Per�metro: " + lista[i].calculaPerimetro());
				System.out.println("�rea: " + lista[i].calculaArea());
			}
		}
	}
}
			
		
