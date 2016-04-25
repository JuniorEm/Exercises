package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main23 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String entrada = br.readLine();
		String[] vetor = entrada.split(" ");
		int a = Integer.parseInt(vetor[0]);
		int b = Integer.parseInt(vetor[1]);
		int c = Integer.parseInt(vetor[2]);
		int d = Integer.parseInt(vetor[3]); 
		
		if ((b > c) && (d > a) && (c + d > a + b) && (c > 0 && d > 0) && (a % 2 == 0))
			System.out.println("Valores aceitos");
		else
			System.out.println("Valores nao aceitos");
	}
}
