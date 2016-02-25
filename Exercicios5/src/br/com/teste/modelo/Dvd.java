package br.com.teste.modelo;

import java.math.BigDecimal;

public class Dvd extends Produto {
	private int duracao;
	
	//Constructor
	public Dvd(String nome, BigDecimal preco, int codigoDeBarras, int duracao) {
		super(nome, preco, codigoDeBarras);
		this.setDuracao(duracao);
	}

	//Getter and Setter
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	//Methods
	public String toString() {
		return super.toString() + "\tDuração: " + duracao + " mins";
	}
	

}
