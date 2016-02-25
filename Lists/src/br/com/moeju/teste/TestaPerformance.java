package br.com.moeju.teste;

import java.util.List;
import java.util.Vector;

public class TestaPerformance {
	public static void main(String[] args) {
		/*System.out.println("Iniciando . . .");
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();
		
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
			//System.out.println("\nAdicionando. . . " + System.currentTimeMillis());
		}
		
		for (int i = 0; i < total; i++) {
			teste.contains(i);
			System.out.println("\nPesquisando . . . " + System.currentTimeMillis());
		}
		
		long fim = System.currentTimeMillis();
		
		long tempo = fim - inicio;
		System.out.println("Tempo: " + tempo);
		*/
		
		System.out.println("Iniciando . . . ");
		List<Integer> lista = new Vector<>();
		
		long inicio = System.currentTimeMillis();
		
		
		for (int i = 0; i < 30000; i++) {
			lista.add(0, i);
			//System.out.println("\nAdicionando. . . " + System.currentTimeMillis());
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo Gasto: " + tempo);
		
		
		
		
	}
	

}
