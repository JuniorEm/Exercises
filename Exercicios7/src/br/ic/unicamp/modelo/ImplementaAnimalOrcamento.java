package br.ic.unicamp.modelo;

import java.math.BigDecimal;

public class ImplementaAnimalOrcamento implements AnimalOrcamento {
	private String especie;
	private String nomeAnimal;
	public Animal[] vetorDeAnimal = new Animal[10];
	public ItemOrcamento[] vetorDeItem = new ItemOrcamento[vetorDeAnimal.length];
	
	//Getters and Setters
	public String getEspecie() {
		return especie;
	}


	public String getNomeAnimal() {
		return nomeAnimal;
	}

	//Methods

	public void adiciona(Animal animal, ItemOrcamento item) {
		
		for (int i = 0; i < vetorDeAnimal.length; i++) {
			if (vetorDeAnimal[i] == null) {
				vetorDeAnimal[i] = animal;
				break;
			}
			
			for (int y = 0; y < vetorDeItem.length; y++) {
				if (vetorDeItem[y] == null) {
					vetorDeItem[y] = item;
					break;
				}
			}
		}
		
		
		
	}
	
	
	public Animal[] getListaAnimal() {
		return vetorDeAnimal;
	}
	
	public ItemOrcamento[] getListaItem() {
		return vetorDeItem;
	}
	
	
	public ItemOrcamentoComplexo orcamentoGastosAnimal() {
		
		for (int i = 0; i < vetorDeItem.length; i++) {
			if (vetorDeItem[i] != null) {
				return (ItemOrcamentoComplexo) vetorDeItem[i];
			}
		}
		
		return null;	
	}
	
	
	public AnimalOrcamento[] questao3 (ImplementaAnimalOrcamento[] novoVetor) {
		return null;
	}
	

	

}
