package br.com.estudomvc.modelo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Assento {
	private final int linhaNumero;
	private int assentoNumero;
	private final BigDecimal preco;
	private String estado;
	private Set<Assento> setDeAssento = new HashSet<>();
	private int quantidade;
	
	public Assento(int linhaNumero, int assentoNumero, BigDecimal preco, String estado, int quantidade) {
		this.linhaNumero = linhaNumero;
		this.assentoNumero = assentoNumero;
		this.preco = preco;
		this.estado = estado;
		this.quantidade = quantidade;
	}
	
	//Getters and Setters
	public int getLinhaNumero() {
		return linhaNumero;
	}

	public int getAssentoNumero() {
		return assentoNumero;
	}

	public void setAssentoNumero(int assentoNumero) {
		this.assentoNumero = assentoNumero;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	//Methods
	public String toString() {
		return "\nNúmero da Linha: " + linhaNumero +
				"Número do Assento: " + assentoNumero +
				"Preço: " + preco +
				"Estado do Assento: " + estado;
	}
	
	public void adicionaAssento(Assento assento) {
		setDeAssento.add(assento);
	}
	
	public void removeAssento(Assento assento) {
		setDeAssento.remove(assento);
	}
	
	public Set<Assento> listaDeAssentos() {
		return setDeAssento;
	}
}
