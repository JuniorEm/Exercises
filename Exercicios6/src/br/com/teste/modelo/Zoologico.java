package br.com.teste.modelo;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	List<Animal> animal = new ArrayList<>();
	
	//Constructor
	public Zoologico() {};
	
	
	//Methods
	public void adiciona(Animal animal) {
		this.animal.add(animal);
	}
	
	public void remove(Animal animal) {
		this.animal.remove(animal);
	}
	
	public List<Animal> getListaDeAnimal() {
		return animal;
	}
	
}
