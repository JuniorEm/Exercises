package br.ic.unicamp.modelo;

public class Resultado {
	private String nomeEspecie;
	private int quantidade;
	
	//Constructor
	public Resultado(String nomeEspecie, int quantidade) {
		this.nomeEspecie = nomeEspecie;
		this.quantidade = quantidade;
	}
	
	//Getters and Setters
	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	//Methods
	
	public String toString() {
		return "Nome Espécie: " + nomeEspecie +
				"\tQuantidade: " + quantidade;
	}
	
	
	
	
}
