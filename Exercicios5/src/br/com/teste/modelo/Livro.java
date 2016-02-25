package br.com.teste.modelo;

import java.math.BigDecimal;

public class Livro extends Produto {
	private String autor;
	
	//Constructor
	public Livro(String nome, BigDecimal preco, int codigoDeBarras, String autor) {
		super(nome, preco, codigoDeBarras);
		this.setAutor(autor);
	}

	//Getter and Setter
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	//Methods
	public String toString() {
		return super.toString() + "\tAutor: " + autor;
	}
	
}
