package br.com.treino.model;

public class Movimentacao {
	private final String descricao;
	private final double valor;
	private final String tipo;
	
	
	public Movimentacao(String descricao, double valor, String tipo) {
		this.descricao = descricao;
		this.valor = valor;
		this.tipo = tipo;
	}


	public String getDescricao() {
		return descricao;
	}


	public double getValor() {
		return valor;
	}


	public String getTipo() {
		return tipo;
	}
	
	public String toString() {
		return "\nDescri��o: " + descricao +
				"\nValor da Movimenta��o: " + valor +
				"\nTipo: " + tipo;
	}
		
}
