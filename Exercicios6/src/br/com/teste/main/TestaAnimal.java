package br.com.teste.main;

import java.util.List;

import br.com.teste.modelo.Animal;
import br.com.teste.modelo.Cat;
import br.com.teste.modelo.Dog;
import br.com.teste.modelo.Zoologico;

public class TestaAnimal {
	public static void main(String[] args) {
		Zoologico zoo = new Zoologico();
		
		Animal animal1 = new Dog();
		Animal animal2 = new Dog();
		Animal animal3 = new Cat();
		
		animal1.setHunger(true);
		
		zoo.adiciona(animal1);
		zoo.adiciona(animal2);
		zoo.adiciona(animal3);
		
		List<Animal> novaLista = zoo.getListaDeAnimal();
		
		for (Animal animal : novaLista) {
			System.out.println(animal);
			if (animal instanceof Dog) {
				System.out.println("\t" + ((Dog) animal).beNice());
			} else if (animal instanceof Cat) {
				System.out.println("\t \tMiau");
			}
		}
		
		
		
		
	}
}
