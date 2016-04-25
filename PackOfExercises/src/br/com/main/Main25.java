package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main25 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String entrada = br.readLine();
		String[] vetor = entrada.split(" ");
		int a = Integer.parseInt(vetor[0]);
		int b = Integer.parseInt(vetor[1]);
		int c = Integer.parseInt(vetor[2]);
				
		int[] novoVetor = {a, b, c};
		
		int[] maisNovoVetor = {a, b, c};
		
		
		for (int i = 0; i < novoVetor.length; i++) {
			for (int y = 0; y < novoVetor.length - 1; y++) {
				if (novoVetor[y] > novoVetor[y + 1]) {
					int aux = novoVetor[y];
					novoVetor[y] = novoVetor[y + 1];
					novoVetor[y + 1] = aux;
				}
			}
		}
		
		for (int x : novoVetor)
			System.out.println(x);
		
		System.out.println();
		
		for (int x : maisNovoVetor)
			System.out.println(x);
		
		
	}
}
