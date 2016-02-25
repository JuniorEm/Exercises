package Exercicios;

public class Pessoa {
	private String nome;
	private int idade;
	
	//Constructors
	public Pessoa(){

	}
	
	public Pessoa(String nome, int idade){
		this();
		this.nome = nome;
		this.idade = idade;
	}
	
	//Getters & Setters
	
	public String getNome(){
		return this.nome;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	//Methods
	public void fazAniversario(){
		this.idade = this.idade+1;
	}
	
	public String print(){
		String dados = "Nome: "+this.getNome()+
						"\nIdade: "+this.getIdade();
		return dados;
	}

}
