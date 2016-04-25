
public class Main {
	
	public static void main(String[] args) {
		ImplementaAnimal animal = new ImplementaAnimal();
		Animal animal1 = new ImplementaAnimal("Pinguim", "Biggy");
		Animal animal2 = new ImplementaAnimal("Pinguim", "Mabel");
		Animal animal3 = new ImplementaAnimal("Pinguim", "Maven");
		Animal animal4 = new ImplementaAnimal("Pinguim", "Gosling");
		Animal animal5 = new ImplementaAnimal("Felino", "Tiririca");
		Animal animal6 = new ImplementaAnimal("Canino", "Bob");
		Animal animal7 = new ImplementaAnimal("Jepetino", "Leo Rodrigues");
		Animal animal8 = new ImplementaAnimal("Canino", "Geraldo");
		Animal animal9 = new ImplementaAnimal("Felino", "Gepeto");
		Animal animal10 = new ImplementaAnimal("LeoRod", "otário");
		Animal animal11 = new ImplementaAnimal("Felino", "otário2");
		Animal animal12 = new ImplementaAnimal("Felino", "otário3");
		Animal animal13 = new ImplementaAnimal("LeoRod", "otário");
		Animal animal14 = new ImplementaAnimal("Pinguim", "Gapa");
		
		
		animal.adicionaAnimal(animal1);
		animal.adicionaAnimal(animal2);
		animal.adicionaAnimal(animal3);
		animal.adicionaAnimal(animal4);
		animal.adicionaAnimal(animal5);
		animal.adicionaAnimal(animal6);
		animal.adicionaAnimal(animal7);
		animal.adicionaAnimal(animal8);
		animal.adicionaAnimal(animal9);
		animal.adicionaAnimal(animal10);
		animal.adicionaAnimal(animal11);
		animal.adicionaAnimal(animal12);
		animal.adicionaAnimal(animal13);
		animal.adicionaAnimal(animal14);
		

		
		Animal[] novoArray = animal.getList();
		
		
		Ferramentas ferramenta = new ImplementaFerramenta();
	
		Resultado[] result = animal.questOne(novoArray, ferramenta);
		
		for (Resultado resultado : result) {
			if (resultado.getNomeEspecie() != null && resultado.getQuantidade() != 0) {
				System.out.println(resultado.getNomeEspecie() + " ----- " + resultado.getQuantidade());
			}
		}
		
		/*
		Animal[] array = ferramenta.filtraEspecie(novoArray, "Felino");
		
		for (Animal animalz : array) {
			if (animalz != null) {
				System.out.println(animalz.getNomeEspecie());
			}
		}
		

		Animal[] array2 = ferramenta.filtraEspecie(novoArray, "Pinguim");
		
		for (Animal animalz : array2) {
			if (animalz != null) {
				System.out.println(animalz.getNomeEspecie());
			}
		} */
		

		
	
		
		
		
	}
}
