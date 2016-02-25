package br.com.caelum.modelo;

import java.math.BigDecimal;

public class Funcionario {
	private String nome;
	private BigDecimal salario;
	private String dataDeAdmissao;
	
	//Constructor
	public Funcionario(String nome, BigDecimal salario, String dataDeAdmissao) {
		this.nome = nome;
		this.salario = salario;
		this.dataDeAdmissao = dataDeAdmissao;
	}
	
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getData() {
		return dataDeAdmissao;
	}

	public void setData(String data) {
		this.dataDeAdmissao = data;
	}
	
	//Methods
	public String toString() {
		return "\nNome: " + nome +
				"\nSalário: "	+ salario +
				"\nData de Admissão: " + dataDeAdmissao;
	}			
	
	
}
