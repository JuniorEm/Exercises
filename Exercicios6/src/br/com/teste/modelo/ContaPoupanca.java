package br.com.teste.modelo;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {
	private BigDecimal juros;
	
	//Constructor
	public ContaPoupanca( int numeroDaConta, BigDecimal saldo) {
		super(saldo, numeroDaConta);
		juros = new BigDecimal("0.0");
	}

	//Getters and Setters
	public BigDecimal getJuros() {
		return juros;
	}

	public void setJuros(BigDecimal juros) {
		this.juros = juros;
	}
	
	//Method
	public void adicionaJuros(BigDecimal juros) {
		this.juros = this.juros.add(juros);
		this.saldo = this.saldo.subtract(this.juros);
	}
	
	
}
