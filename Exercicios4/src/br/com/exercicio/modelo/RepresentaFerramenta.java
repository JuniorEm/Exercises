package br.com.exercicio.modelo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepresentaFerramenta implements Ferramenta {

	@Override
	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
		// TODO Auto-generated method stub
		Animal[] novoVetor = new Animal[completo.length];
			for (int i = 0; i < completo.length; i++) {
				if (completo[i] != null && completo[i].getNomeDaEspecie().equalsIgnoreCase(especieFiltrar)) {
						novoVetor[i] = completo[i];
				} 
			
			}
			
			return novoVetor;
	
		}

	//Temos de verificar se o Array está inteiramente nulo e não apenas uma posição dele para atribuir um valor
	//à qualquer posição. Exemplo: novoVetor inteiro se for igual a nulo, então atribuir a posição dele ao Novo Vetor

	@Override
	public String[] classificaEspecie(Animal[] completo) {
		String[] arrayDeStrings = new String[completo.length];
		int qtd = 0;

		for (int i = 0; i < completo.length; i++) {
			boolean existe = false;
			for (int j = 0; j < qtd; j++) {
				if (completo[i] != null && arrayDeStrings[j] == null && arrayDeStrings[j].equals(completo[i].getNomeDaEspecie())) {
					existe = true;
					break;
				}

			}
			if (!existe && completo[i] != null) {
				arrayDeStrings[qtd++] = completo[i].getNomeDaEspecie();
			}
		}

		arrayDeStrings = Arrays.copyOf(arrayDeStrings, qtd);
		return arrayDeStrings;
	}
	
	/*
	public String[] classificaEspecie(Animal[] completo) {
		// TODO Auto-generated method stub
		String[] arrayDeStrings = new String[10];
		Set<String> string = new HashSet<>();
		for (int i = 0; i < completo.length; i++) {
			if (completo[i] != null) {
				arrayDeStrings[i] = completo[i].getNomeDaEspecie();
				for (String s : arrayDeStrings) { // Itera sobre o
													// arrayDeStrings
					if (s != null) {
						string.add(s); // Adiciona todos os elementos
										// percorridos, porém como é um Set ele
										// adiciona apenas uma vez, sem
										// repetições
					}
				}
			}

		}
		System.out.println(string);
	} */
	

}
