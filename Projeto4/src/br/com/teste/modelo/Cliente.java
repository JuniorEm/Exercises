package br.com.teste.modelo;

//My JAVA BEAN
public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String fone;
	private float renda;
	

	//Constructors
	public Cliente() {}
	
	
	//Get & Set
	public int getId() {
		return id;
	}


	public void setId(int id) {
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
	public float getRenda() {
		return renda;
	}
	public void setRenda(float renda) {
		this.renda = renda;
	}
	

}
