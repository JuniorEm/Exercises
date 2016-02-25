package br.com.exercicio.modelo;

import java.util.HashSet;
import java.util.Set;

public class Resultado {
	private String nomeEspecie; // nome da especie
	private int quantidade; // quantidade de animais da especie
	
	public Resultado() {}
	
	public Resultado(String nomeEspecie, int quantidade) {
	this.nomeEspecie = nomeEspecie;
	this.quantidade = quantidade;
	}
	
	public String getNomeDaEspecie() {
		return nomeEspecie;
	}
		 
	public int getQuantidade() {
		return quantidade;
	}
	
	//Methods
	public Resultado[] questao(ImplementaAnimal[] animal, RepresentaFerramenta rf) {
		String[] especies = rf.classificaEspecie(animal); //Atribui o classifica espécies a uma variável do tipo String passando o vetor
		int[] quantidade = new int [especies.length]; //Pega a quantidade total do Array
		
		for (int i = 0; i < quantidade.length; i++) { //Itera sobre a quantidade total do vetor de inteiros quantidade
			Animal[] temp = rf.filtraEspecie(animal, especies[i]);
			quantidade[i] = temp.length;
		}
		
		Resultado[] result = new Resultado[especies.length];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = new Resultado(especies[i], quantidade[i]);
		}
		
		return result;
		
	}
	
	public String toString() {
		return "\nNome da Espécie: " + getNomeDaEspecie() + "\nQuantidade: " + getQuantidade();
	}
	

}
