package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main28 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String entrada = br.readLine();
		
		String[] vetor = entrada.split(" ");
		int valor1 = Integer.parseInt(vetor[0]);
		int valor2 = Integer.parseInt(vetor[1]);
		
		if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
	}
}
