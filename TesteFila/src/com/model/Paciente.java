package com.model;

public class Paciente implements Comparable<Paciente>{
	private int ficha;
	private String nome;
	private Gravidade gravidade;
	
	public Paciente(int ficha, String nome, Gravidade gravidade) {
		this.ficha = ficha;
		this.nome = nome;
		this.gravidade = gravidade;
	}

	public int getFicha() {
		return ficha;
	}

	public void setFicha(int ficha) {
		this.ficha = ficha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Gravidade getGravidade() {
		return gravidade;
	}

	public void setGravidade(Gravidade gravidade) {
		this.gravidade = gravidade;
	}
	
	public String toString() {
		return "\nFicha: " + ficha +
				"\nNome: " + nome +
				"\nGravidade: " + gravidade;
	}
	
	public int compareTo(Paciente paciente) {
		if (gravidade.getTipo() > paciente.gravidade.getTipo())
			return -1;
		if (gravidade.getTipo() < paciente.gravidade.getTipo())
			return 1;
		return 0;
	}
	
	
}
