package br.com.projeto.modelo;

import java.util.ArrayList;
import java.util.List;

public final class Pais {
	private final String nome;
	private final String nomeDaCapital;
	private final double dimensao;
	private final List<Pais> fronteiras = new ArrayList<>();
	
	//Constructor
	public Pais(String nome, String nomeDaCapital, double dimensao) {
		this.nome = nome;
		this.nomeDaCapital = nomeDaCapital;
		this.dimensao = dimensao;
	}
	
	//Getters, it's final
	public String getNome() {
		return nome;
	}

	public String getNomeDaCapital() {
		return nomeDaCapital;
	}

	public double getDimensao() {
		return dimensao;
	}

	public List<Pais> getFronteiras() {
		return fronteiras;
	}
	
	//Methods
	public void adicionaFronteira (Pais pais) {
		if (!(this.nome == pais.nome)) {
			fronteiras.add(pais);
		} else {
			System.out.println("Não pode adicionar o próprio país como uma fronteira!");
		}
	}
	
	
	public boolean equals(final Pais outro) {
		return this.getNome().equals(outro.getNome()) 
				&& this.getNomeDaCapital().equals(outro.getNomeDaCapital());
	}
	
	public String toString() {
		return 	"\n" +
				"\nNome: " + nome +
				"\nCapital: " + nomeDaCapital +
				"\nDimensão: " + dimensao;
	}
	
	public List<Pais> paisesEmComum(Pais outroPais) {
		List<Pais> paises = new ArrayList<>();
		
		for (int i = 0; i < this.fronteiras.size(); i++) {
			for (int y = 0; y < outroPais.fronteiras.size(); y++) {
				if (this.fronteiras.get(i).equals(outroPais.getFronteiras().get(y))) {
				paises.add(outroPais.getFronteiras().get(y));
			}
			}
		}

		return paises;
	
	}
	

}
