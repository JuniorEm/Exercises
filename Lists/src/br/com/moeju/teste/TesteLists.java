package br.com.moeju.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLists {
	public static void main(String[] args) {
		List<String> monique = new ArrayList<>(); //Boa prática na hora de utilizar uma List:
		//Sempre ser o mais genérico possível, referenciemos dessa forma: List<Contatos> contato = new ArrayList<>();tr
		monique.add("\nMonique 1");
		monique.add("\nMonique 2");
		monique.add("\nMonique 3");
		monique.add("\nMonique 4");
		monique.add("\nMonique 5");
		monique.add("\nMonique 6");
		monique.add("\nMonique 7");
		monique.add("\nMonique 8");
		monique.add("\nMonique 9");
		monique.add("\nMonique 10");
		monique.add("\nMonique 11");
		monique.add("\nMonique 12");
		monique.add("\nMonique 13");
		monique.add("\nMonique 14");
		monique.add("\nMonique 15");
		
		System.out.println(monique);
		
		Collections.sort(monique);
		System.out.println(monique);
	}
}
