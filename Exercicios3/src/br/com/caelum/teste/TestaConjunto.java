package br.com.caelum.teste;

import br.com.caelum.modelo.Controle;
import br.com.caelum.modelo.Produto;
import br.com.caelum.modelo.TV;

public class TestaConjunto {
	public static void main(String[] args) {
		Produto produto = new Produto(11135);
		produto.setVolume(44);
		Controle controle = new Controle();
		controle.setProduto(produto);
		controle.testaProduto(produto);
		System.out.println(controle);
		
		TV televisao = new TV(11136);
		televisao.setVolume(59);
		Controle controle2 = new Controle();
		controle2.setProduto(televisao);
		controle2.testaProduto(televisao);
		System.out.println(controle2);
		
		if (produto instanceof TV) {
			System.out.println("\nVerdadeiro");
		} else {
			System.out.println("\nFalso");
		}
	}

}
