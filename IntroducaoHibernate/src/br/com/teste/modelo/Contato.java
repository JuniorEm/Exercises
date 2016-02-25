package br.com.teste.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contato {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String cpf;
	private String fone;
	private Float renda;
	
	//Constructor
	public Contato() {}
	
	
	
	//Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Float getRenda() {
		return renda;
	}
	public void setRenda(Float renda) {
		this.renda = renda;
	}

}
