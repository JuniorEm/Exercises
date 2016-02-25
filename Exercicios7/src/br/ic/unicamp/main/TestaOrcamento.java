package br.ic.unicamp.main;

import java.math.BigDecimal;

import br.ic.unicamp.modelo.Animal;
import br.ic.unicamp.modelo.ImplementaAnimal;
import br.ic.unicamp.modelo.ImplementaAnimalOrcamento;
import br.ic.unicamp.modelo.ItemOrcamento;
import br.ic.unicamp.modelo.ItemOrcamentoComplexo;

public class TestaOrcamento {	
	public static void main(String[] args) {
		ItemOrcamento itemOrcamento1 = new ItemOrcamento("Vacina W", new BigDecimal("150.00"));
		ItemOrcamento itemOrcamento2 = new ItemOrcamento("Vacina A", new BigDecimal("200.50"));
		ItemOrcamento itemOrcamento3 = new ItemOrcamento("Ração", new BigDecimal("50.75"));
		ItemOrcamento itemOrcamento4 = new ItemOrcamento("Vacina B", new BigDecimal("90.50"));
		ItemOrcamento itemOrcamento5 = new ItemOrcamento("Palha", new BigDecimal("150.80"));
		
		ItemOrcamento[] novoVetor = new ItemOrcamento[10];
		
		for (int i = 0; i < novoVetor.length; i++) {
			if (novoVetor[i] == null) {
				novoVetor[i] = itemOrcamento1;
				novoVetor[i+1] = itemOrcamento2;
				novoVetor[i+2] = itemOrcamento3;
				novoVetor[i+3] = itemOrcamento4;
				novoVetor[i+4] = itemOrcamento5;
				break;
			}
		}
		
		ItemOrcamentoComplexo itemOrcamentoComplexo1 = new ItemOrcamentoComplexo("FrigoBar", new BigDecimal("90.00"), novoVetor);
		
		ItemOrcamento c = itemOrcamentoComplexo1.encontraItem("FrigoBar");
		
		System.out.println(c);
		
		ImplementaAnimal leader = new ImplementaAnimal();
		ImplementaAnimal animal1 = new ImplementaAnimal("Felino", "Gatinho");
		ImplementaAnimal animal2 = new ImplementaAnimal("Ave", "Loro");
		ImplementaAnimal animal3 = new ImplementaAnimal("Canino", "Nutella");
		ImplementaAnimal animal4 = new ImplementaAnimal("Ave", "Pelicano");
		ImplementaAnimal animal5 = new ImplementaAnimal("Ave", "Pereira");
		ImplementaAnimal animal6 = new ImplementaAnimal("Felino", "Tom");
		ImplementaAnimal animal7 = new ImplementaAnimal("Felino", "Tigresa");
		ImplementaAnimal animal8 = new ImplementaAnimal("Hipopotamus", "Hipo");
		
		
		leader.adiciona(animal1);
		leader.adiciona(animal2);
		leader.adiciona(animal3);
		leader.adiciona(animal4);
		leader.adiciona(animal5);
		leader.adiciona(animal6);
		leader.adiciona(animal7);
		leader.adiciona(animal8);
		
		Animal[] novaLista = leader.getLista();
		
		
		ImplementaAnimalOrcamento teste = new ImplementaAnimalOrcamento();
		ItemOrcamento orcamentoAnimal = teste.orcamentoGastosAnimal();
		teste.adiciona(animal1, itemOrcamento1);
		teste.adiciona(animal2, itemOrcamento2);

		
	
		
		
		Animal[] novaAnimal = teste.getListaAnimal();
		ItemOrcamento[] novoItem = teste.getListaItem();
		
		for (Animal novo : novaAnimal) {
			if (novo != null) {
				System.out.println(novo);
			}
		}
		
		for (ItemOrcamento item : novoItem) {
			if (item != null) {
				System.out.println(item);
			}
		}
		

		
		
	}
}
