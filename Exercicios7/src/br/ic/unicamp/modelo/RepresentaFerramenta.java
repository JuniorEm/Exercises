package br.ic.unicamp.modelo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepresentaFerramenta implements Ferramenta {

	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
		int cont = 0;
		Animal[] oldVetor = new Animal[completo.length];
		Animal[] vetorZerado = new Animal[0];
		
		for (int i = 0; i < completo.length; i++) { //Aqui estamos inicializando um vetor com o tamanho padrão de 10
			for (int j = 0; j < oldVetor.length; j++) {
				if (completo[i] != null && oldVetor[j] == null && completo[i].getEspecie().equals(especieFiltrar)) {
					oldVetor[j] = completo[i];
					cont++;
					break;
				}
			}
		}
		
		Animal[] newVetor = new Animal[cont];
		
		for (int i = 0; i < oldVetor.length; i++) { //Ele itera sobre todo o vetor de velhoVetor cuja posição é 10
			for (int j = 0; j < newVetor.length; j++) { //Itera sobre o contador que no caso da primeira vez seria o 3, na segunda ele voltaria
				if (oldVetor[i] != null && newVetor[j] == null) {
					newVetor[j] = oldVetor[i];
					break;
				}
			}
			
			return newVetor;
		}
		
		return vetorZerado;
	}


	public String[] classificaEspecie(Animal[] completo) {
		String[] guardaEspecie = new String[completo.length];
		
		for (int i = 0; i < completo.length; i++) {
			for (int y = 0; y < guardaEspecie.length; y++) {
				if (completo[i] != null && guardaEspecie[y] == null) {
					guardaEspecie[y] = completo[i].getEspecie();
					break;
				}
			}
			
		}
		
		Set<Animal> animal = new HashSet(Arrays.asList(guardaEspecie));
		String[] listaVetor = animal.toArray(new String[animal.size()]);
		
		String[] novaLista = new String[completo.length];

 		for (int i = 0; i < listaVetor.length; i++) {
				for (int y = 0; y < novaLista.length; y++) {
					if (listaVetor[i] != null && novaLista[y] == null) {
						novaLista[y] = listaVetor[i];
						break;
					}
				}
		}
		
		return novaLista;
	}
	

	
}
