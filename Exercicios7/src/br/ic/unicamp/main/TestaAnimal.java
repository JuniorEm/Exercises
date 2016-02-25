package br.ic.unicamp.main;

import br.ic.unicamp.modelo.Animal;
import br.ic.unicamp.modelo.ImplementaAnimal;
import br.ic.unicamp.modelo.RepresentaFerramenta;
import br.ic.unicamp.modelo.Resultado;

public class TestaAnimal {
	public static void main(String[] args) {
		ImplementaAnimal leader = new ImplementaAnimal();
		ImplementaAnimal animal1 = new ImplementaAnimal("Ave", "Pereira");
		ImplementaAnimal animal2 = new ImplementaAnimal("Ave", "Figueira");
		ImplementaAnimal animal3 = new ImplementaAnimal("Ave", "Oliveira");
		ImplementaAnimal animal4 = new ImplementaAnimal("Canino", "Bob");
		ImplementaAnimal animal5 = new ImplementaAnimal("Felino", "Miau");
		
		leader.adiciona(animal1);
		leader.adiciona(animal2);
		leader.adiciona(animal3);
		leader.adiciona(animal4);
		leader.adiciona(animal5);
		
		Animal[] novaLista = leader.getLista();
		
		/*
		for (Animal animal : novaLista) {
			if (animal != null) {
				System.out.println(animal.getEspecie() + "\t" + animal.getNomeAnimal());
			}
		} */
		
		RepresentaFerramenta representaFerramenta = new RepresentaFerramenta();
		Animal[] listaFiltrada = representaFerramenta.filtraEspecie(novaLista, "Ave");
		String[] listaClassificada = representaFerramenta.classificaEspecie(novaLista);
		
		/*
		for (Animal animal : listaFiltrada) {
			if (animal != null) {
				System.out.println(animal.getEspecie() + "\t" + animal.getNomeAnimal());
			}
		} */
		
		/*
		for (String string : listaClassificada) {
			if (string != null) {
				System.out.println(string);
			}
		} */


		Resultado[] resultadoGeral = leader.questao(novaLista, representaFerramenta);
		
		for (Resultado resultado: resultadoGeral) {
			if (resultado.getNomeEspecie() != null) {
				System.out.println(resultado);
			}
		}

	}
}
