package br.com.exercicio.teste;

import br.com.exercicio.modelo.Animal;
import br.com.exercicio.modelo.ImplementaAnimal;
import br.com.exercicio.modelo.RepresentaFerramenta;
import br.com.exercicio.modelo.Resultado;

public class TestaAnimal {
	public static void main(String[] args) {
		ImplementaAnimal implementa = new ImplementaAnimal(10);
		ImplementaAnimal animal1 = new ImplementaAnimal("Felideo", 1);
		ImplementaAnimal animal2 = new ImplementaAnimal("Felideo", 3);
		ImplementaAnimal animal3 = new ImplementaAnimal("Felideo", 4);
		ImplementaAnimal animal4 = new ImplementaAnimal("Felideo", 5);
		ImplementaAnimal animal5 = new ImplementaAnimal("S. Camelus", 1);
		ImplementaAnimal animal6 = new ImplementaAnimal("S. Camelus", 2);
		ImplementaAnimal animal7 = new ImplementaAnimal("S. Camelus", 3);
		RepresentaFerramenta rf = new RepresentaFerramenta();
		
		implementa.adiciona(animal1);
		implementa.adiciona(animal2);
		implementa.adiciona(animal3);
		implementa.adiciona(animal4);
		implementa.adiciona(animal5);
		implementa.adiciona(animal6);
		implementa.adiciona(animal7);
		ImplementaAnimal[] novoArray = implementa.mostra();
		
		Resultado r = new Resultado();
		Resultado[] resultado = r.questao(novoArray, rf);
		
		for (Resultado result : resultado) {
			System.out.println("Espécie: " + result.getNomeDaEspecie() + "\t" + " Quantidade: " + result.getQuantidade());
		}
		//rf.filtraEspecie(novoArray, "felideo");
		//rf.classificaEspecie(novoArray);
		
		

		
	}
}
