package br.com.unicamp.modelo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Utilitario {
	
	//Constructor
	public Utilitario() {}
	
	//Methods
	public void duplica(ImplementaRepositorioA repositorioA, ImplementaRepositorioB repositorioB) {
		Pessoa[] novoVetorA = repositorioA.getVetor();
		Pessoa[] novoVetorB = repositorioB.getVetor();

		for (int i = 0; i < novoVetorB.length; i++) { // Apaga todos os dados do
														// vetor
			if (novoVetorB[i] != null) {
				novoVetorB[i] = null;
				break;
			}
		}

		for (int i = 0; i < novoVetorA.length; i++) { // Copia de um vetor para
														// outro
			for (int y = 0; y < novoVetorB.length; y++) {
				if (novoVetorB[y] == null && novoVetorA[i] != null) {
					novoVetorB[y] = novoVetorA[i];
					break;
				}
			}
		}
	}
	
	public void diferenca(ImplementaRepositorioA repositorioA, ImplementaRepositorioB repositorioB,
			ImplementaRepositorioC repositorioC) {

		Pessoa[] vetorA = repositorioA.getVetor();
		Pessoa[] vetorB = repositorioB.getVetor();
		Pessoa[] vetorC = repositorioC.getVetor();
		Pessoa[] vetorAuxiliar = new Pessoa[10];

		for (int i = 0; i < vetorA.length; i++) {
			for (int y = 0; y < vetorAuxiliar.length; y++) {
				if (vetorA[i] != null && vetorAuxiliar[y] == null) {
					vetorAuxiliar[y] = vetorA[i];
					break;
				}
			}
		}

		for (int i = 0; i < vetorAuxiliar.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				if (vetorAuxiliar[i] != null && vetorB[j] != null) {
					if (vetorAuxiliar[i] == vetorB[j]) {
						vetorAuxiliar[i] = null;
						break;
					}

				}
			}
		}

		for (int i = 0; i < vetorAuxiliar.length; i++) {
			for (int y = 0; y < vetorC.length; y++) {
				if (vetorAuxiliar[i] != null && vetorC[y] == null) {
					vetorC[y] = vetorAuxiliar[i];
					break;
				}
			}
		}
	}
	
}
