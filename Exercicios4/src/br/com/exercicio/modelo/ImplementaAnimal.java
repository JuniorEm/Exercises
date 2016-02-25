package br.com.exercicio.modelo;

public class ImplementaAnimal implements Animal {
	private String nomeDaEspecie;
	private int quantidade;
	public ImplementaAnimal[] animal;
	
	//Constructors
	public ImplementaAnimal(int size) {
		animal = new ImplementaAnimal[size];
	}
	
	public ImplementaAnimal(String nomeDaEspecie, int quantidade) {
		this.nomeDaEspecie = nomeDaEspecie;
		this.quantidade = quantidade;
	}
	
	//Getters and Setters
	public String getNomeDaEspecie() {
		return nomeDaEspecie;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	//Methods
	
	public void adiciona(ImplementaAnimal animal) {
		for (int i = 0; i < this.animal.length; i++) {
			if (this.animal[i] == null) {
				this.animal[i] = animal;
				//A posição equivale a um tipo animal
				break;
			}
		}
	}
	

 	
	public ImplementaAnimal[] mostra() {
		for (int i = 0; i < this.animal.length; i++) {
			if (this.animal[i] != null) {
				return this.animal;
			}
		}
			return null;
	}
	
	public String toString() {
		return "\nNome da Espécie: " + getNomeDaEspecie() + "\nQuantidade: " + getQuantidade();
	}
	
}
