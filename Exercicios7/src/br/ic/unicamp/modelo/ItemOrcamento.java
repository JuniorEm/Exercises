package br.ic.unicamp.modelo;

import java.math.BigDecimal;

public class ItemOrcamento {
	private String historico;
	private BigDecimal valor;
	
	//Constructor
	public ItemOrcamento(String historico, BigDecimal valor) {
		this.historico = historico;
		this.valor = valor;
	}
	
	//Getters
	public String getHistorico() {
		return historico;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	//Method
	public String toString() {
		return "\nHistórico: " + getHistorico() +
				"\nValor: " + getValor();
	}
}
