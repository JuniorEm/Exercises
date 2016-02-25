package br.com.caelum.modelo;

import java.math.BigDecimal;

public class Conta {
	private String nomeDoCliente;
	private String numeroDaConta;
	private BigDecimal saldo;
	private BigDecimal limite;
	
	//Constructors
	public Conta(String nomeDoCliente, String numeroDaConta, BigDecimal saldo, BigDecimal limite) {
		this.nomeDoCliente = nomeDoCliente;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
		this.limite = limite;
		
			if (!verificaLimite()) {
				this.saldo = new BigDecimal("0.0");
				this.limite = new BigDecimal("0.0");
				throw new RuntimeException("Valor inválido de limite!");
			}
	
	
	}
	
	//Getters and Setters
	public String getNomeDoCliente() {
		return nomeDoCliente;
	}
	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
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
	public BigDecimal getLimite() {
		return limite;
	}
	public void setLimite(BigDecimal limite) {
		this.limite = limite;
		
		if (verificaLimite()) {
			System.out.println("Limite alterado com sucesso!");
		} else {
			this.limite = new BigDecimal ("0.0");
			throw new ArithmeticException("Erro ao efetuar a troca de limite, contate o administrador do sistema!");
		}
	}

	
	//Methods
	public boolean verificaLimite() {
		return (limite.compareTo(saldo) >= 0); //Tem que retornar limite como maior ou igual ao saldo
	} //retorna verdadeiro um limite que for maior ou igual ao saldo
	
	public boolean retira(BigDecimal valor) {
		return (valor.compareTo(saldo) <= 0); //Retorna verdadeiro se o valor passado como parâmetro for menor ou igual ao saldo
	}
	
	public void deposita(Conta outraConta, BigDecimal valor) {
		if (retira(valor)) {
			outraConta.setSaldo(outraConta.getSaldo().add(valor));
		} else {
			throw new ArithmeticException("A operação não pode ser efetuada por saldo insuficiente!");
		}
	}

}
