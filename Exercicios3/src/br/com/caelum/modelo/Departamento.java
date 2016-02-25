package br.com.caelum.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String nome;
	private List<Funcionario> funcionarios = new ArrayList<>(100);
	
	//Constructors
	public Departamento(String nome) {
		this.nome = nome;
	}

	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Funcionario> getFuncionarios() {
		System.out.println("\nFuncionários do Setor: " + nome);
		return funcionarios;
	}
	
	//Methods
	public void adiciona(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void demite(Funcionario funcionario) {
		funcionarios.remove(funcionario);
	}
	
	public void transfere(Departamento departamento, Funcionario funcionario) {
		funcionarios.remove(funcionario);
		departamento.funcionarios.add(funcionario);
	}
	
	public void aumento() {
		for (Funcionario f : funcionarios) {
			f.setSalario(f.getSalario().add((f.getSalario().multiply(new BigDecimal("0.1")))));
		}
	}

	public String toString() {
		return "\nNome: " + nome;
	}
	
}
