package br.com.exercicio.modelo;

import java.math.BigDecimal;

public class Conta {
	private String nome;
	private final int codigo;
	private Banco banco;
	private BigDecimal saldo;
	
	//Constructor
	public Conta (String nome, int codigo, BigDecimal saldo) {
		this.nome = nome;
		this.codigo = codigo;
		this.saldo = saldo;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public int getCodigo() {
		return codigo;
	}
	
	//Methods
	public String saca(BigDecimal valor) {
		setSaldo(getSaldo().subtract(valor));
		return "Saldo atual de: " + getSaldo();
	}
	
	public String deposito(Conta outraConta, BigDecimal valor) {
		setSaldo(getSaldo().subtract(valor));
		outraConta.setSaldo(getSaldo().add(valor));
		return "Seu saldo atual é de: " + getSaldo();
	}
	
	public String toString() {
		return "\nNome do Correntista: " + nome +
				"\nCódigo: " + codigo +
				"\nBanco: " + banco.getNome() +
				"\nSaldo: " + saldo;
	}
	
	
}
