package br.com.moeju.teste;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteLists2 {
	public static void main(String[] args) {
		Set<String> cargos = new HashSet<>();
		
		cargos.add("Diretor");
		cargos.add("Gerente");
		cargos.add("Auxiliar Administrativo");
		cargos.add("Auxiliar Administrativo");
		
		//retorna o iterator
		Iterator<String> i = cargos.iterator();
		while (i.hasNext()) { //Boolean, inicia com um true, quando for falso ele para de cair no i.next
			String palavra = i.next(); //Variável local recebendo os elementos da lista
			System.out.println(palavra);
		}
		
	}

}
