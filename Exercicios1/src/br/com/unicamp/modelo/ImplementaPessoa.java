package br.com.unicamp.modelo;

public class ImplementaPessoa implements Pessoa {
	private final String cpf;
	private String nome;
	
	//Constructor
	public ImplementaPessoa(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	//Getters and Setters
	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}
	
	//Methods
	public String toString() {
		return "Nome: " + getNome() + " \t " + "CPF: " + getCpf();
	}
}
