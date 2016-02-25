package br.com.unicamp.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import br.com.unicamp.modelo.ImplementaPessoa;
import br.com.unicamp.modelo.ImplementaRepositorioA;
import br.com.unicamp.modelo.ImplementaRepositorioB;
import br.com.unicamp.modelo.ImplementaRepositorioC;
import br.com.unicamp.modelo.Pessoa;
import br.com.unicamp.modelo.Utilitario;

public class TesteUtilitario {
	public static void main(String[] args) {
		ImplementaPessoa implementaPessoa1 = new ImplementaPessoa("38423197832", "José Alves Figueiredo");
		ImplementaPessoa implementaPessoa2 = new ImplementaPessoa("14798818488", "Amarildo da Cunha");
		ImplementaPessoa implementaPessoa3 = new ImplementaPessoa("28051010221", "Marta Pascadini");
		ImplementaPessoa implementaPessoa4 = new ImplementaPessoa("36761515343", "Manoel Silva");
		ImplementaPessoa implementaPessoa5 = new ImplementaPessoa("89076632464", "Silmara Lopez");
		ImplementaPessoa implementaPessoa6 = new ImplementaPessoa("73304854118", "Juan Martinez");
		ImplementaPessoa implementaPessoa7 = new ImplementaPessoa("31470143631", "Letícia Mahal");
		ImplementaPessoa implementaPessoa8 = new ImplementaPessoa("58377506068", "Benhur Griggiote");
		
		ImplementaRepositorioA repositorioA = new ImplementaRepositorioA();
		ImplementaRepositorioB repositorioB = new ImplementaRepositorioB();
		ImplementaRepositorioC repositorioC = new ImplementaRepositorioC();
		
		repositorioA.guarda(implementaPessoa1);
		repositorioA.guarda(implementaPessoa2);
		repositorioA.guarda(implementaPessoa3);
		repositorioA.guarda(implementaPessoa4);
		repositorioA.guarda(implementaPessoa5);
		repositorioA.guarda(implementaPessoa6);
		repositorioA.guarda(implementaPessoa7);
		repositorioA.guarda(implementaPessoa8);
		
		//repositorioB.guarda(implementaPessoa4);
		repositorioB.guarda(implementaPessoa5); //Em B temos SilmaraLopez, Juan Martinez, Letícia Mahal, e Benhur Grigiote.
		repositorioB.guarda(implementaPessoa1); //C deveria ter José Alves Figueiredo, Amarildo da Cunha, Marta Pascadini e Manoel Silva
		repositorioB.guarda(implementaPessoa7);
		repositorioB.guarda(implementaPessoa8);
		
		Pessoa[] vetorA = repositorioA.getVetor();
		Pessoa[] vetorB = repositorioB.getVetor();
		Pessoa[] vetorC = repositorioC.getVetor();
		
		Utilitario utilitario = new Utilitario();
		
		//utilitario.duplica(repositorioA, repositorioB);
		
		utilitario.diferenca(repositorioA, repositorioB, repositorioC);
		
		//FOR do Java5
	
		
		for (Pessoa novaLista : vetorA) {
			if (novaLista != null) {
				System.out.println("Vetor A: " + novaLista);
			}
		} 
		
		System.out.println("");
		
		
		for (Pessoa novaLista : vetorB) {
			if (novaLista!= null) {
				System.out.println("Vetor B: " + novaLista);
			}
		}
		
		System.out.println("");
		for (Pessoa maisNovaLista : vetorC) {
			if (maisNovaLista != null) {
				System.out.println("Vetor C: " + maisNovaLista);
			}
		}
		
	
		
	}
}
