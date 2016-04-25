package com.model;

import java.text.DecimalFormat;

public class Servico implements Recebivel {
	private String descricao;
	private int horas;
	private double precoHora;
	DecimalFormat decimalFormat = new DecimalFormat("R$###,###,###.00");
	
	public Servico(String descricao, int horas, double precoHora) {
		this.descricao = descricao;
		this.horas = horas;
		this.precoHora = precoHora;	
	}
	
	public double totalizaReceita() {
		return horas * precoHora;
	}
	
	public String toString() {
		return "\nDescrição: " + descricao +
				"\nHoras: " + horas +
				"\nPreço hora: " + decimalFormat.format(precoHora) +
				"\nTotal receita: " + decimalFormat.format(totalizaReceita());
	}
	
}
