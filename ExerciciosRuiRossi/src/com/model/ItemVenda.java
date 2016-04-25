package com.model;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ItemVenda implements Recebivel {
	private String produto;
	private int quantidade;
	private double precoUnitario;
	DecimalFormat decimalFormat = new DecimalFormat("R$###,###,###.00");
	
	public ItemVenda(String produto, int quantidade, double precoUnitario) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		
	}

	public double totalizaReceita() {
		return quantidade * precoUnitario;
	}
	
	public String toString() {
		return "\nProduto: " + produto +
				"\nQuantidade: " + quantidade +
				"\nPreço unitário: " + decimalFormat.format(precoUnitario) +
				"\nTotal Receita: " + decimalFormat.format(totalizaReceita());
	}
	


}
