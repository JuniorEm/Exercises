package br.com.relembre.modelo;

public class Cliente {
	private String nome;
	private String empresa;
	private String cargo;
	private String cpf;
	
	//Constructor
	public Cliente() {}
	
	public Cliente(String nome, String empresa, String cargo, String cpf) {
		this.nome = nome;
		this.empresa = empresa;
		this.cargo = cargo;
		this.cpf = cpf;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
