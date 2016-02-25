package br.ic.unicamp.modelo;

public class ImplementaAnimal implements Animal {
	private String especie;
	private String nomeAnimal;
	public Animal[] animal = new Animal[10];

	//Constructor
	public ImplementaAnimal() {}
	
	public ImplementaAnimal(String especie, String nomeAnimal) {
		this.especie = especie;
		this.nomeAnimal = nomeAnimal;
	}
	
	//Getters and Setters
	public String getEspecie() {
		return especie;
	}


	public String getNomeAnimal() {
		return nomeAnimal;
	}
	
	public void adiciona(Animal animal) {
		for (int i = 0; i < this.animal.length; i++) {
			if (this.animal[i] == null) {
				this.animal[i] = animal;
				break;
			}
		}
	}
	
	public Animal[] getLista() {
		return this.animal;
	}
	
	//Methods
	public Resultado[] questao(Animal[] completo, RepresentaFerramenta representaFerramenta) {
		String[] classifica = representaFerramenta.classificaEspecie(completo);
		int[] quantidade = new int[classifica.length];
		
		
		for (int i = 0; i < quantidade.length; i++) { //Itera sobre a quantidade, entretanto itera até 10
			Animal[] novaLista = representaFerramenta.filtraEspecie(completo, classifica[i]);
				quantidade[i] = novaLista.length;
		}
		
		
		Resultado[] resultado = new Resultado[completo.length];
		for (int i = 0; i < resultado.length; i++) {
			if (resultado[i] == null) {
				resultado[i] = new Resultado(classifica[i], quantidade[i]);
			}
		}

		
		return resultado;
		
		
	}
	
	public String toString() {
		return "\nEspécie: " + getEspecie() + "\t Nome: " + getNomeAnimal();
	}
		
		
	

}
