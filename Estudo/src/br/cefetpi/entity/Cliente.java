package br.cefetpi.entity;

public class Cliente {
	private int id;
	private String cpf;
	private String nome;
	private String fone;
	private double renda;
	
	//Constructors
	public Cliente() {
		//Empty Constructor
	}
	
	public Cliente(int id, String cpf, String nome, String fone, double renda) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.fone = fone;
		this.renda = renda;
	}
	
	//Get & Set
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public String getFone() {
		return this.fone;
	}
	
	public void setRenda (double renda) {
		this.renda = renda;
	}
	
	public double getRenda() {
		return this.renda;
	}
	
	//Methods
	@Override
	public String toString() {
		return "\nId : " +this.id+
				"\nNome: "+this.nome+
				"\nCPF: "+this.cpf+
				"\nFone: "+this.fone+
				"\nRenda: "+this.renda;
				
	}

}
