package br.com.exercicio.modelo;

import br.com.exercicio.modelo.Conta;

public class Banco {
	private String nome;
	private final int codigo;
	
	//Constructor
	public Banco(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	//Methods
	public Conta adicionaConta(Conta conta) {
		conta.setBanco(new Banco(nome, codigo));
		return conta;
	}
	
	public String toString() {
		return "\nNome do Banco: " + nome +
				"\nCódigo: " +codigo;
	}

}
