package inter.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstTest {
	
	public static String transformaStringEmMinusculo(String string) {
		return string.toLowerCase();
	}
	
	public static int numeroDeVezesQueAparece(String string, char caracter) {
		char[] novoArray = string.toCharArray(); //Transforma uma String em um array de Char
		int cont = 0;
		for (int i = 0; i < novoArray.length; i++) {
			if (novoArray[i] == caracter) {
				cont++;
			}
		}
		return cont;
	}
	
	public static String repeteParaDel(String string, char caracter) {
		char[] novoArray = string.toCharArray();
		for (int i = 0; i < novoArray.length; i++) {
			if (novoArray[i] == caracter) {
				novoArray[i] = ' ';
			}
		}		
		String novaString = String.copyValueOf(novoArray);
		//Converte em String caracteres de um Array Char
		return novaString;
	}
	
	public static boolean repetidoOuNao(String string, char caracter) {
		char[] novoArray = string.toCharArray(); //Transforma uma String em um array de Char
		int cont = 0;
		for (int i = 0; i < novoArray.length; i++) {
			if (novoArray[i] == caracter) {
				cont++;
			}
		}
		
		return (cont > 1);
	}
	
	
	public static String retireTheRepeats(String string) {
		char[] oldArray = string.toCharArray();

		for (int i = 0; i < oldArray.length; i++) {
			for (int y = 0; y < oldArray.length; y++) {
				if (i != y) {
					if (oldArray[i] == oldArray[y]) {
						oldArray[y] = ' ';
					}
				}
			}
		}

		String newArray = String.copyValueOf(oldArray);
		
		return newArray;
	}
	
	
	public static void main(String[] args) {
		String testandoUm = new String("TrEMendo de MedO");
		System.out.println(FirstTest.transformaStringEmMinusculo(testandoUm));
		
		System.out.println(FirstTest.numeroDeVezesQueAparece("example", 'e'));
		
		System.out.println(FirstTest.repeteParaDel("Monique", 'i'));
		
		System.out.println(FirstTest.repetidoOuNao("Menique", 'i'));
		
		System.out.println(FirstTest.retireTheRepeats("paralelepipedo"));
		
	}
}
