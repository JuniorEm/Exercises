package br.com.teste.modelo;

import java.math.BigDecimal;

public class Cd extends Produto {
	private int numeroDeFaixa;
	
	//Constructor
	public Cd(String nome, BigDecimal preco, int codigoDeBarras, int numeroDeFaixa) {
		super(nome, preco, codigoDeBarras);
		this.setNumeroDeFaixa(numeroDeFaixa);
	}
	
	//Getter and Setter
	public int getNumeroDeFaixa() {
		return numeroDeFaixa;
	}

	public void setNumeroDeFaixa(int numeroDeFaixa) {
		this.numeroDeFaixa = numeroDeFaixa;
	}
	
	//Methods
	public String toString() {
		return super.toString() + "\tNúmero de Faixa: " + numeroDeFaixa + " faixas";
	}
	

}
