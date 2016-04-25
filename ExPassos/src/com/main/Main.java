package com.main;

import java.util.List;

import com.model.Contato;
import com.model.ExemploArrayList;

public class Main {
	public static void main(String[] args) {
		
		Contato contato = new Contato("Caiao fudidão", "caiao@fudidao.com");
		Contato contato2 = new Contato("Caiao master zica", "caiao@zica.com");
		Contato contato3 = new Contato("Leo Rod", "leorod@apae.com");
		Contato contato4 = new Contato("Daniel Green", "hazocc@gmail.com");
		
		ExemploArrayList exemplo = new ExemploArrayList();
		exemplo.adiciona(contato);
		exemplo.adiciona(contato2);
		exemplo.adiciona(contato3);
		exemplo.adiciona(contato4);
		
		exemplo.remove("caiao@fudidao.com");
		
		List<Contato> novaLista = exemplo.getLista();
		
		for (Contato novaListaContato : novaLista)
			System.out.println(novaListaContato);
		
		
		try {
			System.out.println("\nContato retornado: " + exemplo.consulta("caiao@zica.gom"));
		} catch (Exception e) {
			throw new RuntimeException("O contato não foi encontrado!");
		}
	}
}
