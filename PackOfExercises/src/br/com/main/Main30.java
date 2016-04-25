package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main30 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String entrada = br.readLine();

		String[] vetor = entrada.split(" ");
		int valor1 = Integer.parseInt(vetor[0]);
		int valor2 = Integer.parseInt(vetor[1]);
		int horas = 0;
		
		if (valor1 > valor2) {
			horas = 24 - valor1;
			horas = horas + valor2;
		} else horas = Math.abs(valor2 - valor1);
		
		if (valor1 == valor2)
			horas = 24;
		

		
		System.out.println("O JOGO DUROU " + horas + " HORA(S)");
	}
}
