package br.com.caelum.modelo;

import java.math.BigDecimal;

public class Cartao {
	private Conta conta;
	private String senha;
	
	//Constructor
	public Cartao(Conta conta, String senha) {
		this.conta = conta;
		this.senha = senha;
	}
	
	//Getters and Setters
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//Methods
	public void saca(Conta c, String senha, BigDecimal valor) {
		String verifica = this.getSenha();
		
			if (verifica.equals(senha)) {
				if (c.retira(valor)) {
					c.setSaldo(c.getSaldo().subtract(valor));
					System.out.println("Saque realizado com sucesso!");
				}
		} else {
			System.out.println("Senha inválida!");
		}

	}
}
