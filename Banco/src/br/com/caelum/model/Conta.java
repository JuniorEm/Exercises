package br.com.caelum.model;

import java.math.BigDecimal;


public class Conta {
	private String numeroDaConta;
	private BigDecimal saldo;
	
	public Conta(String numeroDaConta, BigDecimal saldo) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}

	//Getters and Setters
	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	//Methods
	public void saca(BigDecimal valor) {
		if ((saldo.compareTo(valor) == 1) || saldo.compareTo(valor) == 0) { //Se o saldo for maior do que o valor, então subtraia
			setSaldo(saldo.subtract(valor));
		} else {
			throw new IllegalArgumentException("Impossível realizar o saque! Saque um valor acima do seu limite");
		}
	}
	
	public void deposita(Conta conta, BigDecimal valor) {
		this.saca(valor);
		conta.setSaldo(conta.saldo.add(valor));
	}
	
	
}
