package br.com.caelum.modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Empresa {
	private String nome;
	private String cnpj;
	private Set<Departamento> departamentos = new HashSet<>(10);
	
	//Constructor
	public Empresa(String nome) {
		this.nome = nome;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public Set<Departamento> getDepartamento() {
		return departamentos;
	}
	
	
	//Methods
	public void adicionaDepartamento(Departamento depto) {
		departamentos.add(depto);
	}
	
	public void removeDepartamento (Departamento depto) {
		departamentos.remove(depto);
	}
	
	public String toString() {
		return "\nNome: " + nome +
				"\nCNPJ: "	+ cnpj;
	}	

}
