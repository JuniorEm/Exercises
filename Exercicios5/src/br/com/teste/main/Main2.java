package br.com.teste.main;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.teste.modelo.Cd;
import br.com.teste.modelo.Dvd;
import br.com.teste.modelo.Livro;
import br.com.teste.modelo.Loja;
import br.com.teste.modelo.Produto;

public class Main2 {
	
	
	public static void main(String[] args) {
		Loja loja = new Loja();
		Produto produto1 = new Cd("Guns N' Roses: Apetitte for Destruction", new BigDecimal("50.45"),  987654323, 12);
		Produto produto2 = new Dvd("Harry Potter: E as Relíquias da Morte", new BigDecimal("120.99"),  987654324, 161);
		Produto produto3 = new Livro("Design Patterns", new BigDecimal("300.85"), 123427654, "Erich Gamma");
		Produto produto4 = new Cd("Led Zeppelin IV", new BigDecimal("30.85"),  987654327, 45);
		Produto produto5 = new Livro("Effective JAVA", new BigDecimal("400.22"), 454342331, "Joshua Bloch");
		Produto produto6 = new Livro("Effec", new BigDecimal("400.32"), 454342321, "GOF");
		Produto produto8 = new Livro("DEITEL JAVA", new BigDecimal(40.5), 345423457, "DEITEL");
		
		
		
		loja.adiciona(produto1, produto5, produto3, produto4, produto6);
		
		Produto[] novaLista = loja.getLista();
		Arrays.sort(novaLista); //Coloca em ordem alfabética pelo Comparable, método CompareTo
		
		for (Produto produto : novaLista) {
			System.out.println(produto);
		}
		
		System.out.println(produto1.equals(produto2));
		
		System.out.println("\n" + loja.getProduto(produto6));
		
		

	


		

	}
}
